import java.util.Arrays;
import java.util.Scanner;

public class javabasic20210224 {

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.printf("%3s", "o");
		System.out.println("=================�¼� ���� �����ϼ���======================");
		int chair = scn.nextInt();
		int[] arrt = new int [chair]; // �迭 �����
		
		for(int a=0; a<chair; a++)
		{
			int random = (int)(Math.random() * chair)+1;
			arrt[a] = random;			
			for(int d=0; d<a; d++)
			{
				if(arrt[d] == arrt[a])// 
				{
						a--;//�ߺ����� ������ �ٽ� ������ �迭
				}
			}
		}
		 System.out.println(Arrays.toString(arrt));
		
		while(true)
		{
			System.out.println("=================�¼� ���� ���α׷� ======================");
			for(int arr=1; arr<chair+1; arr++)
			{
				System.out.printf("%3d", arr); //1~10�迭
			}
			System.out.println();
			
			for(int arr=1; arr<chair+1; arr++)
			{
				if(arrt[arr-1] == -1) 
				{
					System.out.printf("%3s", "��");
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
					System.out.printf("%d �ڸ��� ��ȣ�� �����մϴ�~ : %d", select ,a+1 );
					System.out.println();
					continue;
				}
				else if(arrt[find] == -1)
				{
					System.out.printf("�ٽ� ������ �ֽʽÿ�" );
					System.out.println();
					find--;
					break;
				}
				
			}

		}
		
	}

}
