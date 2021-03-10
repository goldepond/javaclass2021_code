package inherit.gamechar;

public class Player 
{
	String id;
	int hp;
	int mp;
	int attack;
	int armor;
	
	void info()
	{
		System.out.println("캐릭명 " +id);
		System.out.println("체력  " + hp);
		System.out.println("공격력 " +attack);
		System.out.println("아머 " +armor);
	}
}
