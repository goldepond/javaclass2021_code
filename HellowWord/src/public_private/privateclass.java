package public_private;

public class privateclass {
	private int year;
	private int month;
	private int day;
	private String ssn;
	
	public void setYear(int year) {
		
		if(year <= 1950 || year > 20201)
		{
			System.out.println("삐빅 저장안됨");
		}
		else
		{
			this.year = year;
		}
	}
	public int getYear()
	{
		return this.year;
	}

	
	public void setmonth(int month) {
		
		if(month <= 12 || month > 0)
		{
			this.month = month;
			
		}
		else
		{
			System.out.println("삐빅 저장안됨");
		}
	}
	public int getmonth()
	{
		return this.month;
	}
	
	public void setday(int day) {
		
		if(day <= 01 || day > 31)
		{
			System.out.println("삐빅 저장안됨");
		}
		else
		{
			this.day = day;
		}
	}
	public int getday()
	{
		return this.day;
	}

	
	public void setssn(String ssn) {
		
		if(ssn.length() <14)
		{
			this.ssn = ssn;
		}
		else
		{
			System.out.println("삐빅 저장안됨");
		}
	}
	public String getssn()
	{
		return this.ssn;
	}


	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	public privateclass(int year, int month, int day, String ssn, int a) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
		this.ssn = ssn;
		this.a = a;
	}
}
