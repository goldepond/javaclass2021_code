package sxception.throws_;

public class throwEx01 {
	public static void main(String[] args) {
		try {

			System.out.println(return0101(4,4));
			
		}
		catch (Exception e) {
			// TODO: handle exception

			System.out.println(e.getMessage());
		}
	}
	
	static int return0101(int num, int nunm) throws Exception
	{
		if(num<13)
		{
			throw new Exception("우린끝났어ㅓㅓ");
		}
		return num+nunm;
	}

}
