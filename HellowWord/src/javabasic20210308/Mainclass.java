package javabasic20210308;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		child c = new child();
		
		p.methid01();
		p.methid02();
		
		c.methid01();
		c.methid02();
		c.methid03();
		
		System.out.println();
		//parents 기능만 사용할 수 있는데 오버라이딩 된 메서드는 우선 실행~~~~
		//우효~~
		Parent p1 =c;
		p1.methid01();
		p1.methid02();
		
		System.out.println(c);
		System.out.println(	p1);
		

		System.out.println(	p1==c);
		
		Parent p2 =new child();
		child cc = (child) p2;
		cc.methid01();
		cc.methid02();
		cc.methid03();
		
		Parent pp = new Parent();
		child ccc = (child)pp;
	}

}
