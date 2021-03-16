package api.lang.sb;

public class StringBufferEx {
public static void main(String[] args) {

	//새로운 객체 생성
	String str = new String(" asdasdsa ");
	
	//객체 재활용
	StringBuffer  sb = new StringBuffer(" asdasdsa ");
	
	System.out.println(str);
	System.out.println(sb);
	
	str = str + " program ";// 문자열 변경
	System.out.println(	);
	
	sb.append(" program ");
	
	System.out.println(sb);
	
	sb.insert(3, " fffff ");
	System.out.println(sb);
	
	sb.delete(5, 6);
	
	System.out.println(sb);
	
	double d = Math.random();
	double dd = Math.ceil(1.11);
	double dddd = Math.floor(1.11);
	double ddddd = Math.round(1.111f);
	double dddddd = Math.round(1.111);
	double ddddddd = Math.max(33333,1.111);
	
	System.out.println(d);
	System.out.println(dd);
	System.out.println(dddd);
	System.out.println(ddddd);
	System.out.println(dddddd);
	System.out.println(ddddddd);
	
} 
}
