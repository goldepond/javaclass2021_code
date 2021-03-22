package api.io.stream01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class InputSteamEX01 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis =  new FileInputStream("E:\\file\\text2.txt");
			byte[] arr = new byte[100];
			int result123 = fis.read(arr);
		
		int i=0;
			while(true)
			{
				/*int result = fis.read();
				if(result ==-1)
				{
					break;
				}
				System.out.println(result);
			*/	if(arr[i]==0)
			{
				break;
			}
				System.out.println((char)(arr[i]));
				i++;
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
			try {
				fis.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
