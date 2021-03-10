package javabasic20210308;
class A
{
	//하나의 클래스 파일 안에 여러 클래스가 가능하며
	//파일명이 같은 클래스가 존재하며 해당 클래스는 퍼블릳기앋.
}

class B extends A{}
class C extends B{}
class D extends B{}
class E extends C{}



public class polybasic 
{
	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	int x =10;
	
	A a1 =b;
	A a2 = c;
	A a3 = new D();

}
