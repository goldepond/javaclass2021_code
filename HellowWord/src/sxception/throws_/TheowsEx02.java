package sxception.throws_;

public class TheowsEx02 {
	public void aaa(int num) {
		System.out.println("aaa호출");
		System.out.println("aaa끝ㄴ");
	}
	
	public void bb()
	{
		System.out.println("bbb호출");
		aaa(0);
		System.out.println("bbb호출종료");
	}
	
	public TheowsEx02() {
		bb();
		System.out.println("생성자 호출");
	}
	

}
