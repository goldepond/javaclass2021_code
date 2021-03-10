package javabasic20210308.basic3;

public class House 
{
	
	private int index;

	private Person [] arr;
	
	House()
	{
		arr = new Person[100];
	}

	Person t =new Teacher();
	Person s =new Student();
	Person e =new Employee();
	
	public void setin(Person p)
	{
		arr[index] =s;
		index++;
	}
	public void info()
	{
	}
}
