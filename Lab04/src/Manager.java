
public class Manager extends Employee{
	private String dept;

	public Manager(String name, double salary, String dept) {
		super(name, salary);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return super.toString() + " Manager [dept=" + dept + "]";
	}
	
	
}
