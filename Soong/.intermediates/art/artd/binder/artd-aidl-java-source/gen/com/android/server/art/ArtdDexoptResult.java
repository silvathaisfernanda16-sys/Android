/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation --min_sdk_version 31 --ninja -d out/soong/.intermediates/art/artd/binder/artd-aidl-java-source/gen/com/android/server/art/ArtdDexoptResult.java.d -o out/soong/.intermediates/art/artd/binder/artd-aidl-java-source/gen -Nart/artd/binder art/artd/binder/com/android/server/art/ArtdDexoptResult.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package com.android.server.art;
/**
 * The result of {@code IArtd.dexopt}.
 * 
 * @hide
 */
public class ArtdDexoptResult implements android.os.Parcelable
{
  /** True if the operation is cancelled. */
  public boolean cancelled = false;
  /**
   * The wall time of the dex2oat invocation, in milliseconds, or 0 if dex2oat is not run or if
   * failed to get the value.
   */
  public long wallTimeMs = 0L;
  /**
   * The CPU time of the dex2oat invocation, in milliseconds, or 0 if dex2oat is not run or if
   * failed to get the value.
   */
  public long cpuTimeMs = 0L;
  /**
   * The total size, in bytes, of the dexopt artifacts, or 0 if dex2oat fails, is cancelled, or
   * is not run.
   */
  public long sizeBytes = 0L;
  /**
   * The total size, in bytes, of the previous dexopt artifacts that have been replaced, or
   * 0 if there were no previous dexopt artifacts or dex2oat fails, is cancelled, or is not
   * run.
   */
  public long sizeBeforeBytes = 0L;
  public static final android.os.Parcelable.Creator<ArtdDexoptResult> CREATOR = new android.os.Parcelable.Creator<ArtdDexoptResult>() {
    @Override
    public ArtdDexoptResult createFromParcel(android.os.Parcel _aidl_source) {
      ArtdDexoptResult _aidl_out = new ArtdDexoptResult();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public ArtdDexoptResult[] newArray(int _aidl_size) {
      return new ArtdDexoptResult[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeBoolean(cancelled);
    _aidl_parcel.writeLong(wallTimeMs);
    _aidl_parcel.writeLong(cpuTimeMs);
    _aidl_parcel.writeLong(sizeBytes);
    _aidl_parcel.writeLong(sizeBeforeBytes);
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
      cancelled = _aidl_parcel.readBoolean();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      wallTimeMs = _aidl_parcel.readLong();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      cpuTimeMs = _aidl_parcel.readLong();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      sizeBytes = _aidl_parcel.readLong();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      sizeBeforeBytes = _aidl_parcel.readLong();
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
