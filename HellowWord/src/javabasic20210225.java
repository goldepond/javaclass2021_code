import java.util.Scanner;

public class javabasic20210225 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
			
		System.out.print("배열할 좌석의 크기를 지정하세요");
		
		int size = scan.nextInt();
		
		int [] arr = new int[size];
		int index = 0;
		
		while(true)
		{
			int seat = (int)(Math.random()*size)+1;
			
			arr[index] = seat;
			index++;
			
		}
	}

}
