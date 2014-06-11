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

public class FacetParam implements org.apache.thrift.TBase<FacetParam, FacetParam._Fields>, java.io.Serializable, Cloneable, Comparable<FacetParam> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("FacetParam");

  private static final org.apache.thrift.protocol.TField MODE_FIELD_DESC = new org.apache.thrift.protocol.TField("mode", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField MAX_NUM_VALUES_FIELD_DESC = new org.apache.thrift.protocol.TField("maxNumValues", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField MIN_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("minCount", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField RANGES_FIELD_DESC = new org.apache.thrift.protocol.TField("ranges", org.apache.thrift.protocol.TType.LIST, (short)5);
  private static final org.apache.thrift.protocol.TField PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("path", org.apache.thrift.protocol.TType.LIST, (short)6);
  private static final org.apache.thrift.protocol.TField DRILL_SIDEWAYS_FIELD_DESC = new org.apache.thrift.protocol.TField("drillSideways", org.apache.thrift.protocol.TType.BOOL, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new FacetParamStandardSchemeFactory());
    schemes.put(TupleScheme.class, new FacetParamTupleSchemeFactory());
  }

  /**
   * 
   * @see FacetSortMode
   */
  public FacetSortMode mode; // optional
  public int maxNumValues; // optional
  public int minCount; // optional
  /**
   * 
   * @see FacetType
   */
  public FacetType type; // optional
  public List<String> ranges; // optional
  public List<String> path; // optional
  public boolean drillSideways; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see FacetSortMode
     */
    MODE((short)1, "mode"),
    MAX_NUM_VALUES((short)2, "maxNumValues"),
    MIN_COUNT((short)3, "minCount"),
    /**
     * 
     * @see FacetType
     */
    TYPE((short)4, "type"),
    RANGES((short)5, "ranges"),
    PATH((short)6, "path"),
    DRILL_SIDEWAYS((short)7, "drillSideways");

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
        case 1: // MODE
          return MODE;
        case 2: // MAX_NUM_VALUES
          return MAX_NUM_VALUES;
        case 3: // MIN_COUNT
          return MIN_COUNT;
        case 4: // TYPE
          return TYPE;
        case 5: // RANGES
          return RANGES;
        case 6: // PATH
          return PATH;
        case 7: // DRILL_SIDEWAYS
          return DRILL_SIDEWAYS;
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
  private static final int __MAXNUMVALUES_ISSET_ID = 0;
  private static final int __MINCOUNT_ISSET_ID = 1;
  private static final int __DRILLSIDEWAYS_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.MODE,_Fields.MAX_NUM_VALUES,_Fields.MIN_COUNT,_Fields.TYPE,_Fields.RANGES,_Fields.PATH,_Fields.DRILL_SIDEWAYS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MODE, new org.apache.thrift.meta_data.FieldMetaData("mode", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, FacetSortMode.class)));
    tmpMap.put(_Fields.MAX_NUM_VALUES, new org.apache.thrift.meta_data.FieldMetaData("maxNumValues", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.MIN_COUNT, new org.apache.thrift.meta_data.FieldMetaData("minCount", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, FacetType.class)));
    tmpMap.put(_Fields.RANGES, new org.apache.thrift.meta_data.FieldMetaData("ranges", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.PATH, new org.apache.thrift.meta_data.FieldMetaData("path", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.DRILL_SIDEWAYS, new org.apache.thrift.meta_data.FieldMetaData("drillSideways", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(FacetParam.class, metaDataMap);
  }

  public FacetParam() {
    this.mode = abacus.api.query.FacetSortMode.HITS_DESC;

    this.maxNumValues = 5;

    this.minCount = 1;

    this.type = abacus.api.query.FacetType.DEFAULT;

  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public FacetParam(FacetParam other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetMode()) {
      this.mode = other.mode;
    }
    this.maxNumValues = other.maxNumValues;
    this.minCount = other.minCount;
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetRanges()) {
      List<String> __this__ranges = new ArrayList<String>(other.ranges);
      this.ranges = __this__ranges;
    }
    if (other.isSetPath()) {
      List<String> __this__path = new ArrayList<String>(other.path);
      this.path = __this__path;
    }
    this.drillSideways = other.drillSideways;
  }

  public FacetParam deepCopy() {
    return new FacetParam(this);
  }

  @Override
  public void clear() {
    this.mode = abacus.api.query.FacetSortMode.HITS_DESC;

    this.maxNumValues = 5;

    this.minCount = 1;

    this.type = abacus.api.query.FacetType.DEFAULT;

    this.ranges = null;
    this.path = null;
    setDrillSidewaysIsSet(false);
    this.drillSideways = false;
  }

  /**
   * 
   * @see FacetSortMode
   */
  public FacetSortMode getMode() {
    return this.mode;
  }

  /**
   * 
   * @see FacetSortMode
   */
  public FacetParam setMode(FacetSortMode mode) {
    this.mode = mode;
    return this;
  }

  public void unsetMode() {
    this.mode = null;
  }

  /** Returns true if field mode is set (has been assigned a value) and false otherwise */
  public boolean isSetMode() {
    return this.mode != null;
  }

  public void setModeIsSet(boolean value) {
    if (!value) {
      this.mode = null;
    }
  }

  public int getMaxNumValues() {
    return this.maxNumValues;
  }

  public FacetParam setMaxNumValues(int maxNumValues) {
    this.maxNumValues = maxNumValues;
    setMaxNumValuesIsSet(true);
    return this;
  }

  public void unsetMaxNumValues() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MAXNUMVALUES_ISSET_ID);
  }

  /** Returns true if field maxNumValues is set (has been assigned a value) and false otherwise */
  public boolean isSetMaxNumValues() {
    return EncodingUtils.testBit(__isset_bitfield, __MAXNUMVALUES_ISSET_ID);
  }

  public void setMaxNumValuesIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MAXNUMVALUES_ISSET_ID, value);
  }

  public int getMinCount() {
    return this.minCount;
  }

  public FacetParam setMinCount(int minCount) {
    this.minCount = minCount;
    setMinCountIsSet(true);
    return this;
  }

  public void unsetMinCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MINCOUNT_ISSET_ID);
  }

  /** Returns true if field minCount is set (has been assigned a value) and false otherwise */
  public boolean isSetMinCount() {
    return EncodingUtils.testBit(__isset_bitfield, __MINCOUNT_ISSET_ID);
  }

  public void setMinCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MINCOUNT_ISSET_ID, value);
  }

  /**
   * 
   * @see FacetType
   */
  public FacetType getType() {
    return this.type;
  }

  /**
   * 
   * @see FacetType
   */
  public FacetParam setType(FacetType type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public int getRangesSize() {
    return (this.ranges == null) ? 0 : this.ranges.size();
  }

  public java.util.Iterator<String> getRangesIterator() {
    return (this.ranges == null) ? null : this.ranges.iterator();
  }

  public void addToRanges(String elem) {
    if (this.ranges == null) {
      this.ranges = new ArrayList<String>();
    }
    this.ranges.add(elem);
  }

  public List<String> getRanges() {
    return this.ranges;
  }

  public FacetParam setRanges(List<String> ranges) {
    this.ranges = ranges;
    return this;
  }

  public void unsetRanges() {
    this.ranges = null;
  }

  /** Returns true if field ranges is set (has been assigned a value) and false otherwise */
  public boolean isSetRanges() {
    return this.ranges != null;
  }

  public void setRangesIsSet(boolean value) {
    if (!value) {
      this.ranges = null;
    }
  }

  public int getPathSize() {
    return (this.path == null) ? 0 : this.path.size();
  }

  public java.util.Iterator<String> getPathIterator() {
    return (this.path == null) ? null : this.path.iterator();
  }

  public void addToPath(String elem) {
    if (this.path == null) {
      this.path = new ArrayList<String>();
    }
    this.path.add(elem);
  }

  public List<String> getPath() {
    return this.path;
  }

  public FacetParam setPath(List<String> path) {
    this.path = path;
    return this;
  }

  public void unsetPath() {
    this.path = null;
  }

  /** Returns true if field path is set (has been assigned a value) and false otherwise */
  public boolean isSetPath() {
    return this.path != null;
  }

  public void setPathIsSet(boolean value) {
    if (!value) {
      this.path = null;
    }
  }

  public boolean isDrillSideways() {
    return this.drillSideways;
  }

  public FacetParam setDrillSideways(boolean drillSideways) {
    this.drillSideways = drillSideways;
    setDrillSidewaysIsSet(true);
    return this;
  }

  public void unsetDrillSideways() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DRILLSIDEWAYS_ISSET_ID);
  }

  /** Returns true if field drillSideways is set (has been assigned a value) and false otherwise */
  public boolean isSetDrillSideways() {
    return EncodingUtils.testBit(__isset_bitfield, __DRILLSIDEWAYS_ISSET_ID);
  }

  public void setDrillSidewaysIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DRILLSIDEWAYS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MODE:
      if (value == null) {
        unsetMode();
      } else {
        setMode((FacetSortMode)value);
      }
      break;

    case MAX_NUM_VALUES:
      if (value == null) {
        unsetMaxNumValues();
      } else {
        setMaxNumValues((Integer)value);
      }
      break;

    case MIN_COUNT:
      if (value == null) {
        unsetMinCount();
      } else {
        setMinCount((Integer)value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((FacetType)value);
      }
      break;

    case RANGES:
      if (value == null) {
        unsetRanges();
      } else {
        setRanges((List<String>)value);
      }
      break;

    case PATH:
      if (value == null) {
        unsetPath();
      } else {
        setPath((List<String>)value);
      }
      break;

    case DRILL_SIDEWAYS:
      if (value == null) {
        unsetDrillSideways();
      } else {
        setDrillSideways((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MODE:
      return getMode();

    case MAX_NUM_VALUES:
      return Integer.valueOf(getMaxNumValues());

    case MIN_COUNT:
      return Integer.valueOf(getMinCount());

    case TYPE:
      return getType();

    case RANGES:
      return getRanges();

    case PATH:
      return getPath();

    case DRILL_SIDEWAYS:
      return Boolean.valueOf(isDrillSideways());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MODE:
      return isSetMode();
    case MAX_NUM_VALUES:
      return isSetMaxNumValues();
    case MIN_COUNT:
      return isSetMinCount();
    case TYPE:
      return isSetType();
    case RANGES:
      return isSetRanges();
    case PATH:
      return isSetPath();
    case DRILL_SIDEWAYS:
      return isSetDrillSideways();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof FacetParam)
      return this.equals((FacetParam)that);
    return false;
  }

  public boolean equals(FacetParam that) {
    if (that == null)
      return false;

    boolean this_present_mode = true && this.isSetMode();
    boolean that_present_mode = true && that.isSetMode();
    if (this_present_mode || that_present_mode) {
      if (!(this_present_mode && that_present_mode))
        return false;
      if (!this.mode.equals(that.mode))
        return false;
    }

    boolean this_present_maxNumValues = true && this.isSetMaxNumValues();
    boolean that_present_maxNumValues = true && that.isSetMaxNumValues();
    if (this_present_maxNumValues || that_present_maxNumValues) {
      if (!(this_present_maxNumValues && that_present_maxNumValues))
        return false;
      if (this.maxNumValues != that.maxNumValues)
        return false;
    }

    boolean this_present_minCount = true && this.isSetMinCount();
    boolean that_present_minCount = true && that.isSetMinCount();
    if (this_present_minCount || that_present_minCount) {
      if (!(this_present_minCount && that_present_minCount))
        return false;
      if (this.minCount != that.minCount)
        return false;
    }

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_ranges = true && this.isSetRanges();
    boolean that_present_ranges = true && that.isSetRanges();
    if (this_present_ranges || that_present_ranges) {
      if (!(this_present_ranges && that_present_ranges))
        return false;
      if (!this.ranges.equals(that.ranges))
        return false;
    }

    boolean this_present_path = true && this.isSetPath();
    boolean that_present_path = true && that.isSetPath();
    if (this_present_path || that_present_path) {
      if (!(this_present_path && that_present_path))
        return false;
      if (!this.path.equals(that.path))
        return false;
    }

    boolean this_present_drillSideways = true && this.isSetDrillSideways();
    boolean that_present_drillSideways = true && that.isSetDrillSideways();
    if (this_present_drillSideways || that_present_drillSideways) {
      if (!(this_present_drillSideways && that_present_drillSideways))
        return false;
      if (this.drillSideways != that.drillSideways)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(FacetParam other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMode()).compareTo(other.isSetMode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mode, other.mode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMaxNumValues()).compareTo(other.isSetMaxNumValues());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaxNumValues()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.maxNumValues, other.maxNumValues);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMinCount()).compareTo(other.isSetMinCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMinCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.minCount, other.minCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRanges()).compareTo(other.isSetRanges());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRanges()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ranges, other.ranges);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPath()).compareTo(other.isSetPath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.path, other.path);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDrillSideways()).compareTo(other.isSetDrillSideways());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDrillSideways()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.drillSideways, other.drillSideways);
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
    StringBuilder sb = new StringBuilder("FacetParam(");
    boolean first = true;

    if (isSetMode()) {
      sb.append("mode:");
      if (this.mode == null) {
        sb.append("null");
      } else {
        sb.append(this.mode);
      }
      first = false;
    }
    if (isSetMaxNumValues()) {
      if (!first) sb.append(", ");
      sb.append("maxNumValues:");
      sb.append(this.maxNumValues);
      first = false;
    }
    if (isSetMinCount()) {
      if (!first) sb.append(", ");
      sb.append("minCount:");
      sb.append(this.minCount);
      first = false;
    }
    if (isSetType()) {
      if (!first) sb.append(", ");
      sb.append("type:");
      if (this.type == null) {
        sb.append("null");
      } else {
        sb.append(this.type);
      }
      first = false;
    }
    if (isSetRanges()) {
      if (!first) sb.append(", ");
      sb.append("ranges:");
      if (this.ranges == null) {
        sb.append("null");
      } else {
        sb.append(this.ranges);
      }
      first = false;
    }
    if (isSetPath()) {
      if (!first) sb.append(", ");
      sb.append("path:");
      if (this.path == null) {
        sb.append("null");
      } else {
        sb.append(this.path);
      }
      first = false;
    }
    if (isSetDrillSideways()) {
      if (!first) sb.append(", ");
      sb.append("drillSideways:");
      sb.append(this.drillSideways);
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

  private static class FacetParamStandardSchemeFactory implements SchemeFactory {
    public FacetParamStandardScheme getScheme() {
      return new FacetParamStandardScheme();
    }
  }

  private static class FacetParamStandardScheme extends StandardScheme<FacetParam> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, FacetParam struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.mode = FacetSortMode.findByValue(iprot.readI32());
              struct.setModeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MAX_NUM_VALUES
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.maxNumValues = iprot.readI32();
              struct.setMaxNumValuesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MIN_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.minCount = iprot.readI32();
              struct.setMinCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = FacetType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // RANGES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.ranges = new ArrayList<String>(_list8.size);
                for (int _i9 = 0; _i9 < _list8.size; ++_i9)
                {
                  String _elem10;
                  _elem10 = iprot.readString();
                  struct.ranges.add(_elem10);
                }
                iprot.readListEnd();
              }
              struct.setRangesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list11 = iprot.readListBegin();
                struct.path = new ArrayList<String>(_list11.size);
                for (int _i12 = 0; _i12 < _list11.size; ++_i12)
                {
                  String _elem13;
                  _elem13 = iprot.readString();
                  struct.path.add(_elem13);
                }
                iprot.readListEnd();
              }
              struct.setPathIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // DRILL_SIDEWAYS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.drillSideways = iprot.readBool();
              struct.setDrillSidewaysIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, FacetParam struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.mode != null) {
        if (struct.isSetMode()) {
          oprot.writeFieldBegin(MODE_FIELD_DESC);
          oprot.writeI32(struct.mode.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetMaxNumValues()) {
        oprot.writeFieldBegin(MAX_NUM_VALUES_FIELD_DESC);
        oprot.writeI32(struct.maxNumValues);
        oprot.writeFieldEnd();
      }
      if (struct.isSetMinCount()) {
        oprot.writeFieldBegin(MIN_COUNT_FIELD_DESC);
        oprot.writeI32(struct.minCount);
        oprot.writeFieldEnd();
      }
      if (struct.type != null) {
        if (struct.isSetType()) {
          oprot.writeFieldBegin(TYPE_FIELD_DESC);
          oprot.writeI32(struct.type.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.ranges != null) {
        if (struct.isSetRanges()) {
          oprot.writeFieldBegin(RANGES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.ranges.size()));
            for (String _iter14 : struct.ranges)
            {
              oprot.writeString(_iter14);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.path != null) {
        if (struct.isSetPath()) {
          oprot.writeFieldBegin(PATH_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.path.size()));
            for (String _iter15 : struct.path)
            {
              oprot.writeString(_iter15);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetDrillSideways()) {
        oprot.writeFieldBegin(DRILL_SIDEWAYS_FIELD_DESC);
        oprot.writeBool(struct.drillSideways);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class FacetParamTupleSchemeFactory implements SchemeFactory {
    public FacetParamTupleScheme getScheme() {
      return new FacetParamTupleScheme();
    }
  }

  private static class FacetParamTupleScheme extends TupleScheme<FacetParam> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, FacetParam struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetMode()) {
        optionals.set(0);
      }
      if (struct.isSetMaxNumValues()) {
        optionals.set(1);
      }
      if (struct.isSetMinCount()) {
        optionals.set(2);
      }
      if (struct.isSetType()) {
        optionals.set(3);
      }
      if (struct.isSetRanges()) {
        optionals.set(4);
      }
      if (struct.isSetPath()) {
        optionals.set(5);
      }
      if (struct.isSetDrillSideways()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetMode()) {
        oprot.writeI32(struct.mode.getValue());
      }
      if (struct.isSetMaxNumValues()) {
        oprot.writeI32(struct.maxNumValues);
      }
      if (struct.isSetMinCount()) {
        oprot.writeI32(struct.minCount);
      }
      if (struct.isSetType()) {
        oprot.writeI32(struct.type.getValue());
      }
      if (struct.isSetRanges()) {
        {
          oprot.writeI32(struct.ranges.size());
          for (String _iter16 : struct.ranges)
          {
            oprot.writeString(_iter16);
          }
        }
      }
      if (struct.isSetPath()) {
        {
          oprot.writeI32(struct.path.size());
          for (String _iter17 : struct.path)
          {
            oprot.writeString(_iter17);
          }
        }
      }
      if (struct.isSetDrillSideways()) {
        oprot.writeBool(struct.drillSideways);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, FacetParam struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.mode = FacetSortMode.findByValue(iprot.readI32());
        struct.setModeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.maxNumValues = iprot.readI32();
        struct.setMaxNumValuesIsSet(true);
      }
      if (incoming.get(2)) {
        struct.minCount = iprot.readI32();
        struct.setMinCountIsSet(true);
      }
      if (incoming.get(3)) {
        struct.type = FacetType.findByValue(iprot.readI32());
        struct.setTypeIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TList _list18 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.ranges = new ArrayList<String>(_list18.size);
          for (int _i19 = 0; _i19 < _list18.size; ++_i19)
          {
            String _elem20;
            _elem20 = iprot.readString();
            struct.ranges.add(_elem20);
          }
        }
        struct.setRangesIsSet(true);
      }
      if (incoming.get(5)) {
        {
          org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.path = new ArrayList<String>(_list21.size);
          for (int _i22 = 0; _i22 < _list21.size; ++_i22)
          {
            String _elem23;
            _elem23 = iprot.readString();
            struct.path.add(_elem23);
          }
        }
        struct.setPathIsSet(true);
      }
      if (incoming.get(6)) {
        struct.drillSideways = iprot.readBool();
        struct.setDrillSidewaysIsSet(true);
      }
    }
  }

}

