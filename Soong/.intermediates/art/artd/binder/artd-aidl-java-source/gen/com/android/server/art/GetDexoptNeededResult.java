/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation --min_sdk_version 31 --ninja -d out/soong/.intermediates/art/artd/binder/artd-aidl-java-source/gen/com/android/server/art/GetDexoptNeededResult.java.d -o out/soong/.intermediates/art/artd/binder/artd-aidl-java-source/gen -Nart/artd/binder art/artd/binder/com/android/server/art/GetDexoptNeededResult.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package com.android.server.art;
/**
 * The result of {@code IArtd.getDexoptNeeded}.
 * 
 * @hide
 */
public class GetDexoptNeededResult implements android.os.Parcelable
{
  /** Whether dexopt is needed. */
  public boolean isDexoptNeeded = false;
  /** Whether there is a usable VDEX file. Note that this can be true even if dexopt is needed. */
  public boolean isVdexUsable = false;
  /**
   * The location of the best usable artifacts (the ones picked by OatFileAssistant::GetBestInfo
   * and used by the runtime).
   */
  public int artifactsLocation = com.android.server.art.ArtifactsLocation.NONE_OR_ERROR;
  /**
   * True if the dex file has dex code. (The dex file is a .jar/.apk file that has .dex entries,
   * or is a .dex file.) False otherwise. (The dex file is a .jar/.apk file that has no .dex
   * entries.)
   */
  public boolean hasDexCode = false;
  public static final android.os.Parcelable.Creator<GetDexoptNeededResult> CREATOR = new android.os.Parcelable.Creator<GetDexoptNeededResult>() {
    @Override
    public GetDexoptNeededResult createFromParcel(android.os.Parcel _aidl_source) {
      GetDexoptNeededResult _aidl_out = new GetDexoptNeededResult();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public GetDexoptNeededResult[] newArray(int _aidl_size) {
      return new GetDexoptNeededResult[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeBoolean(isDexoptNeeded);
    _aidl_parcel.writeBoolean(isVdexUsable);
    _aidl_parcel.writeInt(artifactsLocation);
    _aidl_parcel.writeBoolean(hasDexCode);
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
      isDexoptNeeded = _aidl_parcel.readBoolean();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      isVdexUsable = _aidl_parcel.readBoolean();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      artifactsLocation = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      hasDexCode = _aidl_parcel.readBoolean();
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
