package method;

public class method1 {
	public static void main(String[] args) 
	{
		//System.out.println(calsum(10,100));
		//System.out.println(calsum3(1,3,"°¡"));
		
	}
	
	static int calsum(int start,int end)
	{
		int sum =0;
		for(int i =start; i<=end; i++)
		{
			sum +=i;
		}
		return sum;
	}
	
	static String calsum3 (int start,int end, String ddd)
	{
		int solution = start- end;
		solution= Math.abs(solution);
		System.out.println(solution);
		
		for(int i =0; i<=solution; i++)
		{
			System.out.print(ddd + "");
		}
		return null;
	}
	
}
