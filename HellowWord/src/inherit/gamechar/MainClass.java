package inherit.gamechar;

public class MainClass {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		warrior war = new warrior("김이택");
		warrior war2 = new warrior("개새끼");
		war.info();
		war.bash(war2);
	
		System.out.println("///////////////////////////////////////");
		Mage mage = new Mage("김이택");
		mage.info();
	//	mage.Blizzardh(war2);
	}

}
