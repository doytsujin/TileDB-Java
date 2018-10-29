/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.tiledb.libtiledb;

public class int32_tArray {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;
  private final int nelements;

  protected int32_tArray(long cPtr, boolean cMemoryOwn, int nelements) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
    this.nelements = nelements;
  }

  protected static long getCPtr(int32_tArray obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        tiledbJNI.delete_int32_tArray(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public int32_tArray(int nelements) {
    this(tiledbJNI.new_int32_tArray(nelements), true, nelements);
  }

  public int getitem(int index) {
    if (index >= nelements || index < 0) {
      throw new ArrayIndexOutOfBoundsException(index);
    }
    return tiledbJNI.int32_tArray_getitem(swigCPtr, this, index);
  }

  public void setitem(int index, int value) {
    if (index >= nelements || index < 0) {
      throw new ArrayIndexOutOfBoundsException(index);
    }
    tiledbJNI.int32_tArray_setitem(swigCPtr, this, index, value);
  }

  public SWIGTYPE_p_int cast() {
    long cPtr = tiledbJNI.int32_tArray_cast(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  protected int size() {
    return nelements;
  }
}
