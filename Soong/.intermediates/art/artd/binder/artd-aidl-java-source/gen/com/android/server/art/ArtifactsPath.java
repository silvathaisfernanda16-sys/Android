/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation --min_sdk_version 31 --ninja -d out/soong/.intermediates/art/artd/binder/artd-aidl-java-source/gen/com/android/server/art/ArtifactsPath.java.d -o out/soong/.intermediates/art/artd/binder/artd-aidl-java-source/gen -Nart/artd/binder art/artd/binder/com/android/server/art/ArtifactsPath.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package com.android.server.art;
/**
 * Represents the path to the dexopt artifacts of a dex file (i.e., ART, OAT, and VDEX files).
 * 
 * @hide
 */
public class ArtifactsPath implements android.os.Parcelable
{
  /** The absolute path starting with '/' to the dex file (i.e., APK or JAR file). */
  public java.lang.String dexPath;
  /** The instruction set of the dexopt artifacts. */
  public java.lang.String isa;
  /** Whether the dexopt artifacts are in the dalvik-cache folder. */
  public boolean isInDalvikCache = false;
  /**
   * Whether the dexopt artifacts are for Pre-reboot Dexopt. For now, this is always `false` for
   * inputs because we never take Pre-reboot artifacts as inputs.
   */
  public boolean isPreReboot = false;
  public static final android.os.Parcelable.Creator<ArtifactsPath> CREATOR = new android.os.Parcelable.Creator<ArtifactsPath>() {
    @Override
    public ArtifactsPath createFromParcel(android.os.Parcel _aidl_source) {
      ArtifactsPath _aidl_out = new ArtifactsPath();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public ArtifactsPath[] newArray(int _aidl_size) {
      return new ArtifactsPath[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeString(dexPath);
    _aidl_parcel.writeString(isa);
    _aidl_parcel.writeBoolean(isInDalvikCache);
    _aidl_parcel.writeBoolean(isPreReboot);
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
      dexPath = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      isa = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      isInDalvikCache = _aidl_parcel.readBoolean();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      isPreReboot = _aidl_parcel.readBoolean();
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
