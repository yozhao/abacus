/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package abacus.api.query;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum FacetSortMode implements org.apache.thrift.TEnum {
  HITS_DESC(0),
  VALUE_ASC(1),
  CUSTOM(2);

  private final int value;

  private FacetSortMode(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static FacetSortMode findByValue(int value) { 
    switch (value) {
      case 0:
        return HITS_DESC;
      case 1:
        return VALUE_ASC;
      case 2:
        return CUSTOM;
      default:
        return null;
    }
  }
}