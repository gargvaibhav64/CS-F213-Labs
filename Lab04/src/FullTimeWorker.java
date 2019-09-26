
public class FullTimeWorker extends Worker {
	
	private int hours_Worked;
	
	public FullTimeWorker(String name, double salary_rate, int hours_Worked) {
		super(name, salary_rate);
		this.hours_Worked = hours_Worked;
	}


	@Override
	public double ComputePay() {
		if (hours_Worked > 240)
		{
			return super.getSalary_rate()*240;
		}
		else
		{
			return super.getSalary_rate()*hours_Worked;
		}
	}

}
