package ramda.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<>();
	for(int i=1;i<10;i++)
	{
		list.add( new Random().nextInt(100)+1);
	}
	
	//스트립
	//1 중간처리 메서드 -결과를 stream형태로 반환
	// 최종처리 메서드 - 결과를 정수나 실수 혹은 그ㅜ 외의 값으로 반환

	//람다를 적용하는 함수적인 인터페이스 종류
	//conumer 매개변수받고 노 반환
	//predicate 받고 bollean
	//function 매개변수 받고ㅡ 반환은 임의로 결정 
	//mpa== 람다에 저장된 새로운 스트림으로 반환
	
	//중복제거 distinct
	//정렬 sorted
	//p
	list.stream().distinct().forEach((a)->System.out.println(a));

	//====================================
	List<Integer> newList =list
	.stream()
	.distinct()
	.filter((a)-> a>=50 && a%3==0)
	.collect(Collectors.toList());
	
	System.out.println();
	System.out.println();
	System.out.println();
	
	int a1 = list
	.stream()
	.mapToInt((c)->c)
	.sum();
	
	OptionalInt a3 = list.stream().mapToInt((c)->c).max();
	System.out.println();
}	
}
