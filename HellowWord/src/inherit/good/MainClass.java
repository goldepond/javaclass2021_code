package inherit.good;

public class MainClass {

	public static void main(String[] args) {
		Person p = new Person();
		p.age =20;
		p.name="홍길동";
		System.out.println(p.info());
		
		Student s = new Student();
		s.name= "이순신";
		s.age = 30;
		s.studentID="123";
		System.out.println(s.info());
	}

}
