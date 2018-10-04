#include <jni.h>

extern "C"
{
int getArea(JNIEnv *env, jobject obj) {
    jclass cls = env->GetObjectClass(obj);
    jmethodID methodId = env->GetMethodID(cls, "getArea", "()I");
    int result = env->CallIntMethod(obj, methodId);

    return result;
}

JNIEXPORT
jint
JNICALL Java_com_example_pppkm_myapplication_MainActivity_invokeMemberFuncFromNative(
        JNIEnv *env,
        jobject callingObject,
        jobject obj) {
    int result = getArea(env, obj);

    return result;
}

JNIEXPORT
jobject
JNICALL Java_com_example_pppkm_myapplication_MainActivity_createObjectFromNative(
        JNIEnv *env,
        jobject callingObject,
        jint param) {
    jclass cls = env->FindClass("com/example/pppkm/myapplication/Rectangle");
    jmethodID methodId = env->GetMethodID(cls, "<init>", "(I)V");
    jobject obj = env->NewObject(cls, methodId, param);

    return obj;
}

}
