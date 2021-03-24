package regix.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regixMain 
{
	public static void main(String[] args) {
		String info ="홍길자|30세|서울시 강남구|017-1111-1234";
		
		String pattern = "\\d{3}-\\d{3,4}-\\d{4}";
		info = info.replaceAll(pattern,"***_****-****");
		System.out.println(info);
		
		//[가-힣] 한글1개찾음
		
		String info2 = "30세/서울시 강남구/02-123-3452-/010-1234-5678/kim@naver.com";
		String pattern1 = "\\d{2,3}-\\d{3,4}-\\d{4}";
		Pattern p2 =Pattern.compile(pattern1);
		
		
		
		//String p3 = "\\w+@\\w+.\\w+";Matcher m = p3.matcher(info);
		
		String str = "헠4,500원 헐~1200원엏? 6000원ㅋ 120000원ㅎ";
		String p4 ="(\\d,?)*\\d+원";
		Pattern p3 =Pattern.compile(p4);
		Matcher m = p3.matcher(str);
		while(m.find())
		{
			System.out.println(m.group());
		}
	}
}
