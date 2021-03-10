package method;

public class Phone 
{
	//=============================
	String model;
	int price;
	String color;
	
	//=============================
	
	Phone()
	{
		System.out.println("폰 생성자 호출!");
		model = "큐리텔";
		price = 10;
		color = "black";
	}
	
	Phone(String pcolor, int price)
	{
		System.out.println("폰 생성자 호출!");
		model = "갤럭시";
		price = price;
		color = pcolor;
	}
	
	Phone(String pcolor,int dprice, String name)
	{
		System.out.println("폰 생성자 호출!");
		model = name;
		price = dprice;
		color = pcolor;
	}
	
	
	//=============================
	
	void info()
	{
		System.out.println("폰의 정보");
		System.out.println("모델 : " + model);
		System.out.println("가격 : " + price);
		System.out.println("색상 : "+ color);
	}
	
	//=============================
	
}
