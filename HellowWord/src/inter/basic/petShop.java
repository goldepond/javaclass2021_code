package inter.basic;

import java.net.InterfaceAddress;

public class petShop {
	Ipet p =new Dog();
	
	Ipet pp = new Cat();

	
	void carePet(Ipet a)
	{
		if(a instanceof Dog)
		{
			
		}
	}
	Ipet[] arr = new Ipet[10];
	void PlayInfo(Ipet a)
	{
		for(Ipet a12: arr)
		{
			a12.Play();
		}
	}
	
}
