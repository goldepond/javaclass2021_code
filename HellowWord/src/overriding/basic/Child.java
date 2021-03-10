package overriding.basic;

public class Child extends Patrnt{

	int  method2()
	{
		System.out.println("2오버라이드 ");
		return 1;
	}
	
	void  method3()
	{
		System.out.println("자식 독단 메서드 ");
	}
}
