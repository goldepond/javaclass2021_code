package abs.bad;

public class Store1 extends ParentStore{

	@Override
	public void apple() {
		// TODO Auto-generated method stub
		System.out.println(" 쓰울은 500원"); 
		
		super.apple();
	}

	@Override
	public void grape() {
		// TODO Auto-generated method stub
		System.out.println(" 쓰울은 70원"); 
		super.grape();
	}

	@Override
	public void orange() {
		// TODO Auto-generated method stub
		super.orange();
	}

}
