package inter.basic;

public class Main 

{
	Animal ani[] = new Animal[5];
	int aniindex =0;
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Animal d =new Dog();
		Animal cat = new Cat();
		Animal ti = new Tiger();
		
		Ipet dd = new Dog();
		Ipet cc = new Cat();
	}
	
	void Animalmath(Animal a)
	{
		for(Animal a1: ani)
		{
			a1.eat();
		}
	}
	
	
}


