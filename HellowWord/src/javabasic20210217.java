import java.awt.print.Printable;

public class javabasic20210217 
{
	public static void main(String[] args) 
	{
		char c ='A';
		int i =2;
		
		char ccc = (char)(c +i);
		System.out.println(ccc);
		
		short b1 =100;
		byte b2 =12;
		short b3 = (short)(b1+b2);
		System.out.println(b3);
		
		byte b =10; // 1010
		System.out.println(~b);
		
		boolean b123 =true; // 1010
		System.out.println(!b123);
		
		int x =10, y =20;
		
		if(x==10 && ++y == 233)
		{
			System.out.println("넘나 재밌다");
		}
		else
		{
			System.out.println("넘나 지루해");
		}
		
		if(x==10 | ++y == 233)
		{
			System.out.println("넘나 재밌다22");
		}
		else
		{
			System.out.println("넘나 지루해22");
		}
		
		System.out.println(Math.random());
		
		
		int dd = (int)(Math.random() * 10);
		System.out.println(dd + "이거 이거 ");
		
		String r = (dd %2 ==0) ? ("짝수"): ("홀수 ");
		System.out.println(r);
		
		
		
	}

}
