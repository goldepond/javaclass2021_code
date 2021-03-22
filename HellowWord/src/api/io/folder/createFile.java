package api.io.folder;

import java.io.File;

public class createFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("E:\\file\\copy123.jpg");
		if(!file.exists())
		{
			file.mkdir();
		}
		else
		{
			file.delete();
		}
	}

}
