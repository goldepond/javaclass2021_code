package api.lang.wrap;

public class wrapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 기본형의 객체타입을 의미
		
		int a= 100;
		double d =3.141592;
		char c = 'A';
		boolean b = true;
		
		//boxing = 기본타입을 객체타입으로 변환하는 작업
		
		Integer var1 = new Integer(a);
		var1.byteValue();
		
		Double var2 = new Double(d);
		
		Character var3 = new Character(c);

		Boolean var4 = new Boolean(b);
		
		//unboxing =객체타입을 기본타입으로 변환하는것
		
		var1.intValue();
		
		var2.doubleValue();
		
		var3.charValue();
		
		var4.booleanValue();
		
		//Autoboxing 자동박싱 지이이잉
		
		Integer aa =11;
		Double dd = 3.141414;
		Character ccc = 'A';
		Boolean bbb = true;
		
		
		int v1 = aa;
		double ddd = dd;
		
		//wrapper클래스들은 문자열을 기본으로 변환하느넫 많이 사용
		
		int a11 = Integer.parseInt("100");
		double ddddd =Double.parseDouble("3.141593");
		Long ll = Long.parseLong("3333333333");
	}

}
