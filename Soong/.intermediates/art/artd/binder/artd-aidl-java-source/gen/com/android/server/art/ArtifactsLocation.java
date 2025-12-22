/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation --min_sdk_version 31 --ninja -d out/soong/.intermediates/art/artd/binder/artd-aidl-java-source/gen/com/android/server/art/ArtifactsLocation.java.d -o out/soong/.intermediates/art/artd/binder/artd-aidl-java-source/gen -Nart/artd/binder art/artd/binder/com/android/server/art/ArtifactsLocation.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package com.android.server.art;
/** @hide */
public @interface ArtifactsLocation {
  /** No usable artifacts. */
  public static final int NONE_OR_ERROR = 0;
  /** In the global "dalvik-cache" folder. */
  public static final int DALVIK_CACHE = 1;
  /** In the "oat" folder next to the dex file. */
  public static final int NEXT_TO_DEX = 2;
  /** In the dex metadata file. This means the only usable artifact is the VDEX file. */
  public static final int DM = 3;
  /**
   * The OAT and ART files are in the SDM file next to the dex file. The VDEX file is in the DM
   * file next to the dex file. The SDC file is in the global "dalvik-cache" folder. (This happens
   * typically when the app is in incremental-fs.)
   */
  public static final int SDM_DALVIK_CACHE = 4;
  /**
   * The OAT and ART files are in the SDM file next to the dex file. The VDEX file is in the DM
   * file next to the dex file. The SDC file is next to the dex file.
   */
  public static final int SDM_NEXT_TO_DEX = 5;
}
