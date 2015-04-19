LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
LOCAL_MODULE := AndroidNDKTest
LOCAL_SRC_FILES := com_guoyonghui_ndktest_JNICalculator.c
include $(BUILD_SHARED_LIBRARY)