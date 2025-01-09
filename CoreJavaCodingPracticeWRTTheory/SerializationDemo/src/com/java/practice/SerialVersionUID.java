package com.java.practice;

/*SerialVersionUID

  -	To perform Serialization & Deserialization internally JVM will use a unique identifier , 
	which is nothing but serialVersionUID.
  - At the time of serialization JVM will save serialVersionUID with object
  - At the time of Deserialization JVM will compare serialVersionUID.
  - If it is matched then only object will be Deserialized 
  	Otherwise we will get RuntimeException saying "InvalidClassException".
  
  
  The process in depending on default serialVersionUIDare :
  -	After Serializing object if we change the .class file then we can't perform deserialization 
  	because of mismatch in serialVersionUID of local class and 
	for serialized object, at the time of Deserialization we will get RuntimeException saying 
	"InvalidClassException".
  -	Both sender and receiver should use the same version of JVM 
  	if there any incompatability in JVM versions then receive unable to deserializable because of 
	different serialVersionUID , in this case receiver will get RuntimeException saying "InvalidClassException" .
  - To generate serialVersionUID internally JVM will use complexAlgorithm which may create performance problems.
  
	
  We can solve above problems by configuring our own serialVersionUID .
  -	private static final long serialVersionUID = 1L;
  -	after serialization even though if we perform any change to .class file , we can deserialize object.
  - If we configure our own serialVersionUID both sender and receiver not required to maintain the same JVM versions.

	
*/

class India {
	private static final long serialVersionUID = 1l;
}

public class SerialVersionUID {

	public static void main(String[] args) {

	}

}
