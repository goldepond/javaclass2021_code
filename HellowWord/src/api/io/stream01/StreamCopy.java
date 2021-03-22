package api.io.stream01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("C:\\Users\\user\\Desktop\\김이택\\java_git\\javaclass2021_code\\HellowWord\\src\\api\\io\\stream01\\copy.jpg");
			fos = new FileOutputStream ("E:\\file\\copy.jpg");
			
			byte[]aee = new byte[100];
			
			/*while(true)
			{

				int result = fis.read(aee);
		
				if(result == -1) {
					break;
				}
				
				fos.write(aee, 0, result);
			}*/
			
			int result;
			while((result = fis.read(aee)) != -1)
			{

				fos.write(aee, 0, result);
			}
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
