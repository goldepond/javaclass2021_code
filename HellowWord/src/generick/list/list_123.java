package generick.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class list_123 {
public static void main(String[] args) {

List<String> list2 = new ArrayList<>();
list2.containsAll(list2);
	String[]arr= {"1","2","3"};
	
	Arrays.asList(arr);
	
	List<String> list12 = new LinkedList<>();
	Queue<String> list123 = new LinkedList<>();
	
	list123.peek();
	list123.poll();
	
	LinkedList<String> list = new LinkedList<>();
	list.peek();
	
}

//리스트를 매개변수나 반환타입으로 사용할때 쓸 수 있느너 문법
//List<?> = 무엇이든 다 들어감 / List<? super String> 스트링 자식크래릇모두 사용  
// List<? super Integer>  인티저의 형태를 가지고 있다면 가능

















public static void add(List<String> list)
{
	
}

public static List<String> add2()
{
	return null;
}
}
