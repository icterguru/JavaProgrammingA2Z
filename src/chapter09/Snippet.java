package chapter09;
/*
public class Snippet {
	// VariableReferenceEx1.cpp
	// Example of using reference in C++
	#include <iostream>
	using namespace std;
	
	int main()
	{
	 cout << "Hello world!" << endl;
	 int x= 10, y = 100; // variable declaration
	 int & j= x; // j is a reference declaration; 
	   		// j reference to variable "x"
	//int & k = 100; // is NOT valid
	
	cout << "Variable x = " << x << endl;
	cout << "Address of variable x, &x = " << &x << endl;
	cout << "Reference j = " << j << endl;
	cout << "Address of reference j, &j = " << &j << endl;
	cout << "&j + 1 = " << &j+1 << endl;
	
	return 0;
	}
	
}
*/

public class Snippet {
	//CallByValueEx1.cpp
	
	#include <iostream>
	using namespace std;
	
	int CallByValue(string ); // Function with a variable argument
	
	int main() {
	
	    string myname = "Mahdi";  // myname is a local variable
	    cout << "Initially, inside main(), Name = " << myname << endl;
	
	    CallByValue(myname);
	
	    cout << "After calling CallByValue(), Name = " << myname << endl; // Look here ??!!??
	    cout << endl ;
	
	    cout << "Now, inside main(), Name = " << myname << endl;
	
	    return 0;
	}
	
	int CallByValue(string newname )  // newname is a parameter (local variable) here
	{
	    newname = "Mahdi Munim";
	    cout << "Inside CallByValue(), Name = " << newname << endl;
	    return 0;
	}

	//CallByRefEx1.cpp
	
	//CallByRefEx1.cpp
	
	#include <iostream>
	using namespace std;
	
	int CallByRef(string& );  // Function with a reference argument
	
	int main() {
	
	    string myname = "Mahdi";  // myname is a local variable
	    cout << "Initially, inside main(), Name = " << myname << endl;
	
	
	    CallByRef(myname);
	    cout << "After calling CallByRef(), Name = " << myname << endl; // Look here ??!!??
	    cout << endl;
	    cout << "Now, inside main(), Name = " << myname << endl;
	
	    return 0;
	}
	
	int CallByRef(string& newname )  // newname is a reference here
	{
	    newname = "Mahdi Munim";
	    cout << "Inside CallByRef(), Name = " << newname << endl;
	    return 0;
	}
	
	
	


	/* NativeMe.cpp	*/
	/* This Program define body of the Native Method  */
	
	#include<jni.h>		//From jdk1.3\include
	#include<NativeMe.h>  //From Current Directory
	#include<stdio.h>	//From Included Directory
	
	JNIEXPORT void JNICALL Java_NativeMe_test(JNIEnv *env, jobject obj)
	{
	jclass cls;
	jfieldID fid;
	jint i;
	
	cout<<"\tLoading the native method....." <<endl;
	cls = (*env)->GetObjectClass(env, obj);
	fid = (*env)->GetFieldID(env, cls, "i", "I");
	
	if(fid ==0)
	{
	cout<<"Could not found get field!" <<endl;
	return;
	}
	i = (*env)->GetIntField(env, obj, fid);
	
	 cout<<"Inside the test() Before Changing i = << i << endl;
	 (*env)->SetIntField(env, obj, fid, i*2);
	 cout<<"Inside the test() After Changing i = << i << endl;
	 cout<<"\tEnding the native method....." <<endl;
	 }
	}
