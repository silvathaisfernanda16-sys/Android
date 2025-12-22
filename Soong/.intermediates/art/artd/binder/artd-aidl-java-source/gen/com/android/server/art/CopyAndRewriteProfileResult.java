/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation --min_sdk_version 31 --ninja -d out/soong/.intermediates/art/artd/binder/artd-aidl-java-source/gen/com/android/server/art/CopyAndRewriteProfileResult.java.d -o out/soong/.intermediates/art/artd/binder/artd-aidl-java-source/gen -Nart/artd/binder art/artd/binder/com/android/server/art/CopyAndRewriteProfileResult.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package com.android.server.art;
/**
 * The result of {@code IArtd.copyAndRewriteProfileResult}.
 * 
 * @hide
 */
public class CopyAndRewriteProfileResult implements android.os.Parcelable
{
  /** The status code. */
  public int status;
  /** The error message, if `status` is `BAD_PROFILE`. */
  public java.lang.String errorMsg;
  public static final android.os.Parcelable.Creator<CopyAndRewriteProfileResult> CREATOR = new android.os.Parcelable.Creator<CopyAndRewriteProfileResult>() {
    @Override
    public CopyAndRewriteProfileResult createFromParcel(android.os.Parcel _aidl_source) {
      CopyAndRewriteProfileResult _aidl_out = new CopyAndRewriteProfileResult();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public CopyAndRewriteProfileResult[] newArray(int _aidl_size) {
      return new CopyAndRewriteProfileResult[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(status);
    _aidl_parcel.writeString(errorMsg);
    int _aidl_end_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.setDataPosition(_aidl_start_pos);
    _aidl_parcel.writeInt(_aidl_end_pos - _aidl_start_pos);
    _aidl_parcel.setDataPosition(_aidl_end_pos);
  }
  public final void readFromParcel(android.os.Parcel _aidl_parcel)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    int _aidl_parcelable_size = _aidl_parcel.readInt();
    try {
      if (_aidl_parcelable_size < 4) throw new android.os.BadParcelableException("Parcelable too small");;
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      status = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      errorMsg = _aidl_parcel.readString();
    } finally {
      if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
        throw new android.os.BadParcelableException("Overflow in the size of parcelable");
      }
      _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
    }
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
  public static @interface Status {
    /** The operation succeeded. */
    public static final int SUCCESS = 0;
    /** The input does not exist or is empty. This is not considered as an error. */
    public static final int NO_PROFILE = 1;
    /** The input is a bad profile. */
    public static final int BAD_PROFILE = 2;
  }
}
