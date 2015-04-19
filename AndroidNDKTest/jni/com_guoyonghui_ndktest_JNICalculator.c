#include <stdio.h>
#include <stdlib.h>

#include "com_guoyonghui_ndktest_JNICalculator.h"

#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     com_guoyonghui_ndktest_JNICalculator
 * Method:    add
 * Signature: (DD)I
 */
JNIEXPORT jint JNICALL Java_com_guoyonghui_ndktest_JNICalculator_add
  (JNIEnv * env, jclass arg, jdouble a, jdouble b) {
	return a + b;
}

#ifdef __cplusplus
}
#endif
