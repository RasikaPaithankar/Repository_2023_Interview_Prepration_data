package com.java.practice;

class TestClass{
	TestClass()
{
System.out.println(this.hashCode());
}
}
class child extends TestClass{
child(){
System.out.println(this.hashCode());
}
}
class Test{
public static void main(String args[]){
child c=new child();
System.out.println(c.hashCode());
}
	
}
