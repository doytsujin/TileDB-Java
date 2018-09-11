/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.tiledb.libtiledb;

public enum tiledb_filter_type_t {
  TILEDB_FILTER_NONE,
  TILEDB_FILTER_GZIP,
  TILEDB_FILTER_ZSTD,
  TILEDB_FILTER_LZ4,
  TILEDB_FILTER_RLE,
  TILEDB_FILTER_BZIP2,
  TILEDB_FILTER_DOUBLE_DELTA,
  TILEDB_FILTER_BLOSC_LZ,
  TILEDB_FILTER_BLOSC_LZ4,
  TILEDB_FILTER_BLOSC_LZ4HC,
  TILEDB_FILTER_BLOSC_SNAPPY,
  TILEDB_FILTER_BLOSC_ZLIB,
  TILEDB_FILTER_BLOSC_ZSTD,
  TILEDB_FILTER_BIT_WIDTH_REDUCTION,
  TILEDB_FILTER_POSITIVE_DELTA;

  public final int swigValue() {
    return swigValue;
  }

  public static tiledb_filter_type_t swigToEnum(int swigValue) {
    tiledb_filter_type_t[] swigValues = tiledb_filter_type_t.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (tiledb_filter_type_t swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + tiledb_filter_type_t.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private tiledb_filter_type_t() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private tiledb_filter_type_t(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private tiledb_filter_type_t(tiledb_filter_type_t swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}
