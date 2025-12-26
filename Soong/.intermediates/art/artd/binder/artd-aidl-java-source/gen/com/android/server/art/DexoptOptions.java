/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation --min_sdk_version 31 --ninja -d out/soong/.intermediates/art/artd/binder/artd-aidl-java-source/gen/com/android/server/art/DexoptOptions.java.d -o out/soong/.intermediates/art/artd/binder/artd-aidl-java-source/gen -Nart/artd/binder art/artd/binder/com/android/server/art/DexoptOptions.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package com.android.server.art;
/**
 * Miscellaneous options for performing dexopt. Every field corresponds to a dex2oat command line
 * flag.
 * 
 * DO NOT add fields for flags that artd can determine directly with trivial logic. That includes
 * static flags, and flags that only depend on system properties or other passed parameters, such as
 * the priority class.
 * 
 * All fields are required.
 * 
 * @hide
 */
public class DexoptOptions implements android.os.Parcelable
{
  /** --compilation-reason */
  public java.lang.String compilationReason;
  /** -Xtarget-sdk-version */
  public int targetSdkVersion = 0;
  /** --debuggable */
  public boolean debuggable = false;
  /** --app-image-fd */
  public boolean generateAppImage = false;
  /** -Xhidden-api-policy:enabled */
  public boolean hiddenApiPolicyEnabled = false;
  /** --comments */
  public java.lang.String comments;
  public static final android.os.Parcelable.Creator<DexoptOptions> CREATOR = new android.os.Parcelable.Creator<DexoptOptions>() {
    @Override
    public DexoptOptions createFromParcel(android.os.Parcel _aidl_source) {
      DexoptOptions _aidl_out = new DexoptOptions();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public DexoptOptions[] newArray(int _aidl_size) {
      return new DexoptOptions[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeString(compilationReason);
    _aidl_parcel.writeInt(targetSdkVersion);
    _aidl_parcel.writeBoolean(debuggable);
    _aidl_parcel.writeBoolean(generateAppImage);
    _aidl_parcel.writeBoolean(hiddenApiPolicyEnabled);
    _aidl_parcel.writeString(comments);
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
      compilationReason = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      targetSdkVersion = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      debuggable = _aidl_parcel.readBoolean();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      generateAppImage = _aidl_parcel.readBoolean();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      hiddenApiPolicyEnabled = _aidl_parcel.readBoolean();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      comments = _aidl_parcel.readString();
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
}
