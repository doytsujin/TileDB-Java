/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.tiledb.libtiledb;

public class int16_tArray {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected int16_tArray(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(int16_tArray obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        tiledbJNI.delete_int16_tArray(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public int16_tArray(int nelements) {
    this(tiledbJNI.new_int16_tArray(nelements), true);
  }

  public short getitem(int index) {
    return tiledbJNI.int16_tArray_getitem(swigCPtr, this, index);
  }

  public void setitem(int index, short value) {
    tiledbJNI.int16_tArray_setitem(swigCPtr, this, index, value);
  }

  public SWIGTYPE_p_short cast() {
    long cPtr = tiledbJNI.int16_tArray_cast(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_short(cPtr, false);
  }

  public static int16_tArray frompointer(SWIGTYPE_p_short t) {
    long cPtr = tiledbJNI.int16_tArray_frompointer(SWIGTYPE_p_short.getCPtr(t));
    return (cPtr == 0) ? null : new int16_tArray(cPtr, false);
  }
}
