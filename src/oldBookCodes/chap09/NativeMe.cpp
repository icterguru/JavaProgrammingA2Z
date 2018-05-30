
 /* NativeMe.cpp      */
 /* This Program define body of the Native Method  */

 #include<jni_md.h>
 #include<NativeMe.h>
 #include<stdio.h>

 JNIEXPORT void JNICALL Java_NativeMe_test(JNIEnv *env, jobject obj)
 {
 jclass cls;
 jfieldID fid;
 jint i;

 cout<<"Loading the native method....." <<endl;
 cls = (*env)->GetObjectClass(env, obj);
 fid = (*env)->GetFieldID(env, cls, "i", "I");

 if(fid ==0)
 {
 cout<<"Could not found get field!" <<endl;
 return;
 }

 i = (*env)->GetIntField(env, obj, fid);

 cout<<" i = << i << endl;
 (*env)->SetIntField(env, obj, fid, i*2);

 cout<<"Loading the native method....." <<endl;

 }




