/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation --min_sdk_version 31 --ninja -d out/soong/.intermediates/art/artd/binder/artd-aidl-java-source/gen/com/android/server/art/ArtConstants.java.d -o out/soong/.intermediates/art/artd/binder/artd-aidl-java-source/gen -Nart/artd/binder art/artd/binder/com/android/server/art/ArtConstants.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package com.android.server.art;
/**
 * Constants used by ART Service Java code that must be kept in sync with those in ART native code.
 * 
 * A test in art/artd/artd_test.cc checks that the constants are in sync.
 * 
 * @hide
 */
public class ArtConstants implements android.os.Parcelable
{
  public static final android.os.Parcelable.Creator<ArtConstants> CREATOR = new android.os.Parcelable.Creator<ArtConstants>() {
    @Override
    public ArtConstants createFromParcel(android.os.Parcel _aidl_source) {
      ArtConstants _aidl_out = new ArtConstants();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public ArtConstants[] newArray(int _aidl_size) {
      return new ArtConstants[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
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
    } finally {
      if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
        throw new android.os.BadParcelableException("Overflow in the size of parcelable");
      }
      _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
    }
  }
  /**
   * A special compilation reason to indicate that only the VDEX file is usable.
   * 
   * This isn't a valid reason to feed into DexoptParams.
   * 
   * Keep in sync with {@code kReasonVdex} in art/runtime/oat_file.h.
   */
  public static final String REASON_VDEX = "vdex";
  /**
   * The file extension of the dex metadata file.
   * 
   * Keep in sync with {@code kDmExtension} in art/libartbase/base/file_utils.h.
   */
  public static final String DEX_METADATA_FILE_EXT = ".dm";
  /**
   * The file extension of the profile file.
   * 
   * Currently, there is no counterpart in the runtime code because the profile paths are passed
   * from the framework.
   */
  public static final String PROFILE_FILE_EXT = ".prof";
  /**
   * The file extension of the secure dex metadata file.
   * 
   * Keep in sync with {@code kSdmExtension} in art/libartbase/base/file_utils.h.
   */
  public static final String SECURE_DEX_METADATA_FILE_EXT = ".sdm";
  /**
   * The name of the profile entry in the dex metadata file.
   * 
   * Keep in sync with {@code ProfileCompilationInfo::kDexMetadataProfileEntry} in
   * art/libprofile/profile/profile_compilation_info.cc.
   */
  public static final String DEX_METADATA_PROFILE_ENTRY = "primary.prof";
  /**
   * The name of the vdex entry in the dex metadata file.
   * 
   * Keep in sync with {@code VdexFile::kVdexNameInDmFile} in art/runtime/vdex_file.h.
   */
  public static final String DEX_METADATA_VDEX_ENTRY = "primary.vdex";
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
}
