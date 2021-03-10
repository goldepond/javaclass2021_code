package encap.obj;

public class Hotel {
	Employee emp;
	
	chef cef;
	
	public Hotel()
	{
		this.emp = new Employee();
		this.cef = new chef();
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public chef getCef() {
		return cef;
	}

	public void setCef(chef cef) {
		this.cef = cef;
	}
	
	
}
