package inherit.gamechar;

public class Mage extends Player{

	Mage(String _id)
	{
		id = _id;
		mp = 1000;
		hp = 50;
		attack = 10;
		armor = 5;
	}
	void Blizzardh(Player [] a)
	{		
		for(Player p : a)
		{
			System.out.println(p.id+" 한테 블리자드");
			if(mp>100)
			{
				int bb = (int)(Math.random() * 5)+10;
				System.out.println(bb +" 데미지 적중!");
				this.mp -=100;
				//a.hp  -= bb;

				//System.out.println(a.id+" : 남은체력 " + a.hp);
			}
			else
			{
				System.out.println("마나가 없다");
			}
		}

	}
	
}
