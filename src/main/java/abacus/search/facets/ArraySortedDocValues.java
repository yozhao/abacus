package abacus.search.facets;

import org.apache.lucene.index.SortedDocValues;
import org.apache.lucene.util.BytesRef;

public class ArraySortedDocValues extends SortedDocValues {
  private final int[] ords;
  private final byte[] buffer;
  private final BytesRef[] byteRefs;
  public ArraySortedDocValues(SortedDocValues inner, int maxDoc) {    
    this.ords = new int[maxDoc];
    for (int i =0;i< maxDoc; ++i) {
      this.ords[i] = inner.getOrd(i);
    }
    
    byteRefs = new BytesRef[inner.getValueCount()];
    
    int numBytes = 0;
    for (int i=0;i<byteRefs.length;++i) {
      BytesRef tempRef = new BytesRef();
      inner.lookupOrd(i, tempRef);
      numBytes+=tempRef.length;
      byteRefs[i] = tempRef;
    }
    buffer = new byte[numBytes];
    for (int i=0;i<byteRefs.length;++i) {
      System.arraycopy(byteRefs[i].bytes, byteRefs[i].offset, buffer, byteRefs[i].offset, byteRefs[i].length);
      byteRefs[i].bytes = buffer;
    }
  }
  
  @Override
  public int getOrd(int docID) {
    return this.ords[docID];
  }

  @Override
  public void lookupOrd(int ord, BytesRef result) {
    result.bytes = buffer;
    result.offset = byteRefs[ord].offset;
    result.length = byteRefs[ord].length;
  }

  @Override
  public int getValueCount() {
    return byteRefs.length;
  }

}
