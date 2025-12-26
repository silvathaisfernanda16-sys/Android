/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation --min_sdk_version 31 --ninja -d out/soong/.intermediates/art/artd/binder/artd-aidl-java-source/gen/com/android/server/art/DexoptTrigger.java.d -o out/soong/.intermediates/art/artd/binder/artd-aidl-java-source/gen -Nart/artd/binder art/artd/binder/com/android/server/art/DexoptTrigger.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package com.android.server.art;
/**
 * Represents the conditions where dexopt should be performed.
 * See `OatFileAssistant::DexOptTrigger`.
 * 
 * This is actually used as a bit field, but is declared as an enum because AIDL doesn't support bit
 * fields.
 * 
 * @hide
 */
public @interface DexoptTrigger {
  public static final int COMPILER_FILTER_IS_BETTER = 1;
  public static final int COMPILER_FILTER_IS_SAME = 2;
  public static final int COMPILER_FILTER_IS_WORSE = 4;
  public static final int PRIMARY_BOOT_IMAGE_BECOMES_USABLE = 8;
  public static final int NEED_EXTRACTION = 16;
}
