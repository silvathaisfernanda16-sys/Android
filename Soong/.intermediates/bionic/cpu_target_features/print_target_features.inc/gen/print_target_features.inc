#include <stdio.h>

#define TO_STRING_EXP(DEF) #DEF
#define TO_STRING(DEF) TO_STRING_EXP(DEF)


void printAarch64TargetFeatures() {
#if defined(__ARM_FEATURE_AES)
  printf("%s=%s\n", TO_STRING_EXP(__ARM_FEATURE_AES), TO_STRING(__ARM_FEATURE_AES));
#else
  printf("%s not defined\n", TO_STRING_EXP(__ARM_FEATURE_AES));
#endif
#if defined(__ARM_FEATURE_BTI)
  printf("%s=%s\n", TO_STRING_EXP(__ARM_FEATURE_BTI), TO_STRING(__ARM_FEATURE_BTI));
#else
  printf("%s not defined\n", TO_STRING_EXP(__ARM_FEATURE_BTI));
#endif
#if defined(__ARM_FEATURE_CRC32)
  printf("%s=%s\n", TO_STRING_EXP(__ARM_FEATURE_CRC32), TO_STRING(__ARM_FEATURE_CRC32));
#else
  printf("%s not defined\n", TO_STRING_EXP(__ARM_FEATURE_CRC32));
#endif
#if defined(__ARM_FEATURE_CRYPTO)
  printf("%s=%s\n", TO_STRING_EXP(__ARM_FEATURE_CRYPTO), TO_STRING(__ARM_FEATURE_CRYPTO));
#else
  printf("%s not defined\n", TO_STRING_EXP(__ARM_FEATURE_CRYPTO));
#endif
#if defined(__ARM_FEATURE_PAC_DEFAULT)
  printf("%s=%s\n", TO_STRING_EXP(__ARM_FEATURE_PAC_DEFAULT), TO_STRING(__ARM_FEATURE_PAC_DEFAULT));
#else
  printf("%s not defined\n", TO_STRING_EXP(__ARM_FEATURE_PAC_DEFAULT));
#endif
#if defined(__ARM_FEATURE_SHA2)
  printf("%s=%s\n", TO_STRING_EXP(__ARM_FEATURE_SHA2), TO_STRING(__ARM_FEATURE_SHA2));
#else
  printf("%s not defined\n", TO_STRING_EXP(__ARM_FEATURE_SHA2));
#endif
#if defined(__ARM_FEATURE_SHA3)
  printf("%s=%s\n", TO_STRING_EXP(__ARM_FEATURE_SHA3), TO_STRING(__ARM_FEATURE_SHA3));
#else
  printf("%s not defined\n", TO_STRING_EXP(__ARM_FEATURE_SHA3));
#endif
#if defined(__ARM_FEATURE_SHA512)
  printf("%s=%s\n", TO_STRING_EXP(__ARM_FEATURE_SHA512), TO_STRING(__ARM_FEATURE_SHA512));
#else
  printf("%s not defined\n", TO_STRING_EXP(__ARM_FEATURE_SHA512));
#endif
}

void printArm32TargetFeatures() {
#if defined(__ARM_ARCH_ISA_THUMB)
  printf("%s=%s\n", TO_STRING_EXP(__ARM_ARCH_ISA_THUMB), TO_STRING(__ARM_ARCH_ISA_THUMB));
#else
  printf("%s not defined\n", TO_STRING_EXP(__ARM_ARCH_ISA_THUMB));
#endif
#if defined(__ARM_FEATURE_AES)
  printf("%s=%s\n", TO_STRING_EXP(__ARM_FEATURE_AES), TO_STRING(__ARM_FEATURE_AES));
#else
  printf("%s not defined\n", TO_STRING_EXP(__ARM_FEATURE_AES));
#endif
#if defined(__ARM_FEATURE_BTI)
  printf("%s=%s\n", TO_STRING_EXP(__ARM_FEATURE_BTI), TO_STRING(__ARM_FEATURE_BTI));
#else
  printf("%s not defined\n", TO_STRING_EXP(__ARM_FEATURE_BTI));
#endif
#if defined(__ARM_FEATURE_CRC32)
  printf("%s=%s\n", TO_STRING_EXP(__ARM_FEATURE_CRC32), TO_STRING(__ARM_FEATURE_CRC32));
#else
  printf("%s not defined\n", TO_STRING_EXP(__ARM_FEATURE_CRC32));
#endif
#if defined(__ARM_FEATURE_CRYPTO)
  printf("%s=%s\n", TO_STRING_EXP(__ARM_FEATURE_CRYPTO), TO_STRING(__ARM_FEATURE_CRYPTO));
#else
  printf("%s not defined\n", TO_STRING_EXP(__ARM_FEATURE_CRYPTO));
#endif
#if defined(__ARM_FEATURE_PAC_DEFAULT)
  printf("%s=%s\n", TO_STRING_EXP(__ARM_FEATURE_PAC_DEFAULT), TO_STRING(__ARM_FEATURE_PAC_DEFAULT));
#else
  printf("%s not defined\n", TO_STRING_EXP(__ARM_FEATURE_PAC_DEFAULT));
#endif
#if defined(__ARM_FEATURE_SHA2)
  printf("%s=%s\n", TO_STRING_EXP(__ARM_FEATURE_SHA2), TO_STRING(__ARM_FEATURE_SHA2));
#else
  printf("%s not defined\n", TO_STRING_EXP(__ARM_FEATURE_SHA2));
#endif
}

void printX86TargetFeatures() {
#if defined(__AES__)
  printf("%s=%s\n", TO_STRING_EXP(__AES__), TO_STRING(__AES__));
#else
  printf("%s not defined\n", TO_STRING_EXP(__AES__));
#endif
#if defined(__AVX__)
  printf("%s=%s\n", TO_STRING_EXP(__AVX__), TO_STRING(__AVX__));
#else
  printf("%s not defined\n", TO_STRING_EXP(__AVX__));
#endif
#if defined(__CRC32__)
  printf("%s=%s\n", TO_STRING_EXP(__CRC32__), TO_STRING(__CRC32__));
#else
  printf("%s not defined\n", TO_STRING_EXP(__CRC32__));
#endif
#if defined(__POPCNT__)
  printf("%s=%s\n", TO_STRING_EXP(__POPCNT__), TO_STRING(__POPCNT__));
#else
  printf("%s not defined\n", TO_STRING_EXP(__POPCNT__));
#endif
#if defined(__SHA512__)
  printf("%s=%s\n", TO_STRING_EXP(__SHA512__), TO_STRING(__SHA512__));
#else
  printf("%s not defined\n", TO_STRING_EXP(__SHA512__));
#endif
#if defined(__SHA__)
  printf("%s=%s\n", TO_STRING_EXP(__SHA__), TO_STRING(__SHA__));
#else
  printf("%s not defined\n", TO_STRING_EXP(__SHA__));
#endif
}

void printRiscvTargetFeatures() {
#if defined(__riscv_vector)
  printf("%s=%s\n", TO_STRING_EXP(__riscv_vector), TO_STRING(__riscv_vector));
#else
  printf("%s not defined\n", TO_STRING_EXP(__riscv_vector));
#endif
}
