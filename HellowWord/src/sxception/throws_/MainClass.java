package sxception.throws_;

public class MainClass {
	public static void main(String[] args) {
	
		 TheowsEx02 t = new  TheowsEx02();
		 
	}
	
	private static String[] arr= {"1","2","3","4","5","6"};
	
	public static void greeting(int index ) throws Exception
	{
		System.out.println(arr[index]);
	}
	
}
