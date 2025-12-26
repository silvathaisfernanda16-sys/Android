/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation --min_sdk_version 31 --ninja -d out/soong/.intermediates/art/artd/binder/artd-aidl-java-source/gen/com/android/server/art/FileVisibility.java.d -o out/soong/.intermediates/art/artd/binder/artd-aidl-java-source/gen -Nart/artd/binder art/artd/binder/com/android/server/art/FileVisibility.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package com.android.server.art;
/**
 * Indicates the visibility of a file. I.e., whether the file has the "read" bit for "others"
 * (S_IROTH).
 * 
 * Theoretically, even if the value is {@code OTHER_READABLE}, others' access can still be denied
 * due to the lack of the "exec" bit on parent directories. However, for compilation artifacts, all
 * parent directories do have the "exec" bit for "others" in practice.
 * 
 * @hide
 */
public @interface FileVisibility {
  public static final int NOT_FOUND = 0;
  public static final int OTHER_READABLE = 1;
  public static final int NOT_OTHER_READABLE = 2;
}
