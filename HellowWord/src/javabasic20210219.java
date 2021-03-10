
public class javabasic20210219 {

	public static void main(String[] args) 
	{
		int a= 0;
		int b =0;
		while (a<10)
		{
			while (b<10)
			{
				System.out.println(a + " x " +b + " = " + a*b);
				b++;
			}
			a++;
			b=0;
			System.out.println("=============================");
		}
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int aa = 0;
		while(aa < arr.length)
		{
			System.out.println((arr[aa]) + " 번째 배열 " );
			aa++;
		}
		


	}

}
