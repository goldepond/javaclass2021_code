import java.util.Arrays;
import java.util.Scanner;

public class javabasic20210224 {

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.printf("%3s", "o");
		System.out.println("=================좌석 수를 선택하세요======================");
		int chair = scn.nextInt();
		int[] arrt = new int [chair]; // 배열 만들기
		
		for(int a=0; a<chair; a++)
		{
			int random = (int)(Math.random() * chair)+1;
			arrt[a] = random;			
			for(int d=0; d<a; d++)
			{
				if(arrt[d] == arrt[a])// 
				{
						a--;//중복값이 있으면 다시 랜덤값 배열
				}
			}
		}
		 System.out.println(Arrays.toString(arrt));
		
		while(true)
		{
			System.out.println("=================좌석 선택 프로그램 ======================");
			for(int arr=1; arr<chair+1; arr++)
			{
				System.out.printf("%3d", arr); //1~10배열
			}
			System.out.println();
			
			for(int arr=1; arr<chair+1; arr++)
			{
				if(arrt[arr-1] == -1) 
				{
					System.out.printf("%3s", "●");
				}
				else
				{
					System.out.printf("%3s", "o");
				}
			}
			
			System.out.println();
			int select = scn.nextInt();
			int a =0;
			
			for(int find =0; find <chair; find++)
			{
				if(arrt[find] == select)
				{
					a =  find;

					arrt[find] = -1;
					System.out.printf("%d 자리는 번호를 공개합니다~ : %d", select ,a+1 );
					System.out.println();
					continue;
				}
				else if(arrt[find] == -1)
				{
					System.out.printf("다시 선택해 주십시오" );
					System.out.println();
					find--;
					break;
				}
				
			}

		}
		
	}

}
