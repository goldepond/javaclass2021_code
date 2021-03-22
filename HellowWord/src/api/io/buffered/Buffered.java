package api.io.buffered;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Buffered {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	BufferedOutputStream bf = new BufferedOutputStream()
		//buffered가 붙으면 무조건 flush;
		FileReader fr = null;
		BufferedReader bf = null;
		try {
			fr = new FileReader("E:\\file\\test.txt");
			bf = new BufferedReader(fr);
			String str;
			while((str = bf.readLine())!=null)
			{
				System.out.println(bf.readLine());				
			}

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
