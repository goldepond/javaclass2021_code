package static_int;

public class Computer 
{
	static String model;
	static String company;
	int price;
	
	Computer()
	{
		this.price = 100;
		 System.out.println("일반생성자 ㅇㅇㅇ");
	}
	
	static {
		 model = "LG그램";
		 company = "LG";
		 System.out.println("ㅇㅇ실행");
	}
	
}
