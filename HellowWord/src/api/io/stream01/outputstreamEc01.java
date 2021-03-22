package api.io.stream01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class outputstreamEc01 {
	public static void main(String[] args) {
		//OutputSteram
		Scanner scan = new Scanner(System.in);
		System.out.println("파일명> ");
		String fileName = scan.next();
		String name = "E:\\file\\";
		FileOutputStream fos = null;
		try 
		{
			fos = new FileOutputStream(name+fileName+".txt");
			System.out.println("문장을 입력해주세여.");
			scan.nextLine();
			String str = scan.nextLine();
			byte []arr= str.getBytes();
			fos.write(arr);
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
				scan.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
