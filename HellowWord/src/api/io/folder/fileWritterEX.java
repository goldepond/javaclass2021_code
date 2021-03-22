package api.io.folder;

import java.io.FileWriter;
import java.io.IOException;

public class fileWritterEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자를 써서 저장 = fileWritter
		FileWriter fw =  null;
		try {
			fw = new FileWriter("E:\\file\\copy.txt");
			String str = "굳굳굳굳";
			fw.write(str);
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
