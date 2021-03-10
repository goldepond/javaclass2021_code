package inherit.gamechar;

public class warrior extends Player{

	warrior(String _id)
	{
		this.id = _id + " 전사";
		hp = 100;
		mp =1000;
		attack = 50;
		armor = 10;
	}
	void bash(Player a)
	{
		System.out.println(a.id+" 한테 베쉬 공격");
		if(mp>100)
		{
			this.mp -=100;
			a.hp  -= 50;

			System.out.println(a.id+" : 남은체력 " + a.hp);
		}
		else
		{
			System.out.println("마나가 없다");
		}
		
		
		
	}

}
