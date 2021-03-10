package overriding.basic;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patrnt p = new Patrnt();
		p.method01();
		p.method02();
		
		Child c = new Child();
		c.method01();
		c.method02();
		c.method2();
		c.method3();
	}

}
