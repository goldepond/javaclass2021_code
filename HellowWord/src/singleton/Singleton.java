package singleton;

public class Singleton 
{
	//싱글톤 패턴 
	//private static Singleton instance = new Singleton(); // 멤버 변수
	
	
	private Singleton() {	
	}
	
	public static Singleton instance()
	{
		return new Singleton();
	}
}
