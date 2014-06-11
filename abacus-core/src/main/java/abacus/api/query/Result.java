/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package abacus.api.query;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Result implements org.apache.thrift.TBase<Result, Result._Fields>, java.io.Serializable, Cloneable, Comparable<Result> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Result");

  private static final org.apache.thrift.protocol.TField DOCID_FIELD_DESC = new org.apache.thrift.protocol.TField("docid", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField SCORE_FIELD_DESC = new org.apache.thrift.protocol.TField("score", org.apache.thrift.protocol.TType.DOUBLE, (short)2);
  private static final org.apache.thrift.protocol.TField FIELDS_FIELD_DESC = new org.apache.thrift.protocol.TField("fields", org.apache.thrift.protocol.TType.MAP, (short)3);
  private static final org.apache.thrift.protocol.TField EXPLANATION_FIELD_DESC = new org.apache.thrift.protocol.TField("explanation", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ResultTupleSchemeFactory());
  }

  public long docid; // optional
  public double score; // optional
  public Map<String,List<String>> fields; // optional
  public String explanation; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DOCID((short)1, "docid"),
    SCORE((short)2, "score"),
    FIELDS((short)3, "fields"),
    EXPLANATION((short)4, "explanation");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // DOCID
          return DOCID;
        case 2: // SCORE
          return SCORE;
        case 3: // FIELDS
          return FIELDS;
        case 4: // EXPLANATION
          return EXPLANATION;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __DOCID_ISSET_ID = 0;
  private static final int __SCORE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.DOCID,_Fields.SCORE,_Fields.FIELDS,_Fields.EXPLANATION};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DOCID, new org.apache.thrift.meta_data.FieldMetaData("docid", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SCORE, new org.apache.thrift.meta_data.FieldMetaData("score", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.FIELDS, new org.apache.thrift.meta_data.FieldMetaData("fields", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)))));
    tmpMap.put(_Fields.EXPLANATION, new org.apache.thrift.meta_data.FieldMetaData("explanation", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Result.class, metaDataMap);
  }

  public Result() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Result(Result other) {
    __isset_bitfield = other.__isset_bitfield;
    this.docid = other.docid;
    this.score = other.score;
    if (other.isSetFields()) {
      Map<String,List<String>> __this__fields = new HashMap<String,List<String>>(other.fields.size());
      for (Map.Entry<String, List<String>> other_element : other.fields.entrySet()) {

        String other_element_key = other_element.getKey();
        List<String> other_element_value = other_element.getValue();

        String __this__fields_copy_key = other_element_key;

        List<String> __this__fields_copy_value = new ArrayList<String>(other_element_value);

        __this__fields.put(__this__fields_copy_key, __this__fields_copy_value);
      }
      this.fields = __this__fields;
    }
    if (other.isSetExplanation()) {
      this.explanation = other.explanation;
    }
  }

  public Result deepCopy() {
    return new Result(this);
  }

  @Override
  public void clear() {
    setDocidIsSet(false);
    this.docid = 0;
    setScoreIsSet(false);
    this.score = 0.0;
    this.fields = null;
    this.explanation = null;
  }

  public long getDocid() {
    return this.docid;
  }

  public Result setDocid(long docid) {
    this.docid = docid;
    setDocidIsSet(true);
    return this;
  }

  public void unsetDocid() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DOCID_ISSET_ID);
  }

  /** Returns true if field docid is set (has been assigned a value) and false otherwise */
  public boolean isSetDocid() {
    return EncodingUtils.testBit(__isset_bitfield, __DOCID_ISSET_ID);
  }

  public void setDocidIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DOCID_ISSET_ID, value);
  }

  public double getScore() {
    return this.score;
  }

  public Result setScore(double score) {
    this.score = score;
    setScoreIsSet(true);
    return this;
  }

  public void unsetScore() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SCORE_ISSET_ID);
  }

  /** Returns true if field score is set (has been assigned a value) and false otherwise */
  public boolean isSetScore() {
    return EncodingUtils.testBit(__isset_bitfield, __SCORE_ISSET_ID);
  }

  public void setScoreIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SCORE_ISSET_ID, value);
  }

  public int getFieldsSize() {
    return (this.fields == null) ? 0 : this.fields.size();
  }

  public void putToFields(String key, List<String> val) {
    if (this.fields == null) {
      this.fields = new HashMap<String,List<String>>();
    }
    this.fields.put(key, val);
  }

  public Map<String,List<String>> getFields() {
    return this.fields;
  }

  public Result setFields(Map<String,List<String>> fields) {
    this.fields = fields;
    return this;
  }

  public void unsetFields() {
    this.fields = null;
  }

  /** Returns true if field fields is set (has been assigned a value) and false otherwise */
  public boolean isSetFields() {
    return this.fields != null;
  }

  public void setFieldsIsSet(boolean value) {
    if (!value) {
      this.fields = null;
    }
  }

  public String getExplanation() {
    return this.explanation;
  }

  public Result setExplanation(String explanation) {
    this.explanation = explanation;
    return this;
  }

  public void unsetExplanation() {
    this.explanation = null;
  }

  /** Returns true if field explanation is set (has been assigned a value) and false otherwise */
  public boolean isSetExplanation() {
    return this.explanation != null;
  }

  public void setExplanationIsSet(boolean value) {
    if (!value) {
      this.explanation = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DOCID:
      if (value == null) {
        unsetDocid();
      } else {
        setDocid((Long)value);
      }
      break;

    case SCORE:
      if (value == null) {
        unsetScore();
      } else {
        setScore((Double)value);
      }
      break;

    case FIELDS:
      if (value == null) {
        unsetFields();
      } else {
        setFields((Map<String,List<String>>)value);
      }
      break;

    case EXPLANATION:
      if (value == null) {
        unsetExplanation();
      } else {
        setExplanation((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DOCID:
      return Long.valueOf(getDocid());

    case SCORE:
      return Double.valueOf(getScore());

    case FIELDS:
      return getFields();

    case EXPLANATION:
      return getExplanation();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DOCID:
      return isSetDocid();
    case SCORE:
      return isSetScore();
    case FIELDS:
      return isSetFields();
    case EXPLANATION:
      return isSetExplanation();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Result)
      return this.equals((Result)that);
    return false;
  }

  public boolean equals(Result that) {
    if (that == null)
      return false;

    boolean this_present_docid = true && this.isSetDocid();
    boolean that_present_docid = true && that.isSetDocid();
    if (this_present_docid || that_present_docid) {
      if (!(this_present_docid && that_present_docid))
        return false;
      if (this.docid != that.docid)
        return false;
    }

    boolean this_present_score = true && this.isSetScore();
    boolean that_present_score = true && that.isSetScore();
    if (this_present_score || that_present_score) {
      if (!(this_present_score && that_present_score))
        return false;
      if (this.score != that.score)
        return false;
    }

    boolean this_present_fields = true && this.isSetFields();
    boolean that_present_fields = true && that.isSetFields();
    if (this_present_fields || that_present_fields) {
      if (!(this_present_fields && that_present_fields))
        return false;
      if (!this.fields.equals(that.fields))
        return false;
    }

    boolean this_present_explanation = true && this.isSetExplanation();
    boolean that_present_explanation = true && that.isSetExplanation();
    if (this_present_explanation || that_present_explanation) {
      if (!(this_present_explanation && that_present_explanation))
        return false;
      if (!this.explanation.equals(that.explanation))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(Result other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetDocid()).compareTo(other.isSetDocid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDocid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.docid, other.docid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetScore()).compareTo(other.isSetScore());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetScore()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.score, other.score);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFields()).compareTo(other.isSetFields());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFields()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fields, other.fields);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExplanation()).compareTo(other.isSetExplanation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExplanation()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.explanation, other.explanation);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Result(");
    boolean first = true;

    if (isSetDocid()) {
      sb.append("docid:");
      sb.append(this.docid);
      first = false;
    }
    if (isSetScore()) {
      if (!first) sb.append(", ");
      sb.append("score:");
      sb.append(this.score);
      first = false;
    }
    if (isSetFields()) {
      if (!first) sb.append(", ");
      sb.append("fields:");
      if (this.fields == null) {
        sb.append("null");
      } else {
        sb.append(this.fields);
      }
      first = false;
    }
    if (isSetExplanation()) {
      if (!first) sb.append(", ");
      sb.append("explanation:");
      if (this.explanation == null) {
        sb.append("null");
      } else {
        sb.append(this.explanation);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ResultStandardSchemeFactory implements SchemeFactory {
    public ResultStandardScheme getScheme() {
      return new ResultStandardScheme();
    }
  }

  private static class ResultStandardScheme extends StandardScheme<Result> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Result struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DOCID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.docid = iprot.readI64();
              struct.setDocidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SCORE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.score = iprot.readDouble();
              struct.setScoreIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FIELDS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map60 = iprot.readMapBegin();
                struct.fields = new HashMap<String,List<String>>(2*_map60.size);
                for (int _i61 = 0; _i61 < _map60.size; ++_i61)
                {
                  String _key62;
                  List<String> _val63;
                  _key62 = iprot.readString();
                  {
                    org.apache.thrift.protocol.TList _list64 = iprot.readListBegin();
                    _val63 = new ArrayList<String>(_list64.size);
                    for (int _i65 = 0; _i65 < _list64.size; ++_i65)
                    {
                      String _elem66;
                      _elem66 = iprot.readString();
                      _val63.add(_elem66);
                    }
                    iprot.readListEnd();
                  }
                  struct.fields.put(_key62, _val63);
                }
                iprot.readMapEnd();
              }
              struct.setFieldsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // EXPLANATION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.explanation = iprot.readString();
              struct.setExplanationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Result struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetDocid()) {
        oprot.writeFieldBegin(DOCID_FIELD_DESC);
        oprot.writeI64(struct.docid);
        oprot.writeFieldEnd();
      }
      if (struct.isSetScore()) {
        oprot.writeFieldBegin(SCORE_FIELD_DESC);
        oprot.writeDouble(struct.score);
        oprot.writeFieldEnd();
      }
      if (struct.fields != null) {
        if (struct.isSetFields()) {
          oprot.writeFieldBegin(FIELDS_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.LIST, struct.fields.size()));
            for (Map.Entry<String, List<String>> _iter67 : struct.fields.entrySet())
            {
              oprot.writeString(_iter67.getKey());
              {
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, _iter67.getValue().size()));
                for (String _iter68 : _iter67.getValue())
                {
                  oprot.writeString(_iter68);
                }
                oprot.writeListEnd();
              }
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.explanation != null) {
        if (struct.isSetExplanation()) {
          oprot.writeFieldBegin(EXPLANATION_FIELD_DESC);
          oprot.writeString(struct.explanation);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ResultTupleSchemeFactory implements SchemeFactory {
    public ResultTupleScheme getScheme() {
      return new ResultTupleScheme();
    }
  }

  private static class ResultTupleScheme extends TupleScheme<Result> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Result struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetDocid()) {
        optionals.set(0);
      }
      if (struct.isSetScore()) {
        optionals.set(1);
      }
      if (struct.isSetFields()) {
        optionals.set(2);
      }
      if (struct.isSetExplanation()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetDocid()) {
        oprot.writeI64(struct.docid);
      }
      if (struct.isSetScore()) {
        oprot.writeDouble(struct.score);
      }
      if (struct.isSetFields()) {
        {
          oprot.writeI32(struct.fields.size());
          for (Map.Entry<String, List<String>> _iter69 : struct.fields.entrySet())
          {
            oprot.writeString(_iter69.getKey());
            {
              oprot.writeI32(_iter69.getValue().size());
              for (String _iter70 : _iter69.getValue())
              {
                oprot.writeString(_iter70);
              }
            }
          }
        }
      }
      if (struct.isSetExplanation()) {
        oprot.writeString(struct.explanation);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Result struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.docid = iprot.readI64();
        struct.setDocidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.score = iprot.readDouble();
        struct.setScoreIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map71 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.LIST, iprot.readI32());
          struct.fields = new HashMap<String,List<String>>(2*_map71.size);
          for (int _i72 = 0; _i72 < _map71.size; ++_i72)
          {
            String _key73;
            List<String> _val74;
            _key73 = iprot.readString();
            {
              org.apache.thrift.protocol.TList _list75 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
              _val74 = new ArrayList<String>(_list75.size);
              for (int _i76 = 0; _i76 < _list75.size; ++_i76)
              {
                String _elem77;
                _elem77 = iprot.readString();
                _val74.add(_elem77);
              }
            }
            struct.fields.put(_key73, _val74);
          }
        }
        struct.setFieldsIsSet(true);
      }
      if (incoming.get(3)) {
        struct.explanation = iprot.readString();
        struct.setExplanationIsSet(true);
      }
    }
  }

}

