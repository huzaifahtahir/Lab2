package lab2;

public class Employee {

	private String m_Name;
	private double m_HoursWorked;
	private double m_HourlyRate;
	private double m_OvertimeHourlyRate;
	
	public Employee()
	{
		m_Name = "Default Guy";
		m_HoursWorked = 10;
		m_HourlyRate = 5;
	}
	
	public Employee(String name, double hrs, double rate)
	{
		m_Name = name;
		m_HoursWorked = hrs;
		m_HourlyRate = rate;
	}

	//Sets
	public void setName(String name)
	{
		m_Name = name;
	}
	
	public void setHoursWorked(double hrs)
	{
		m_HoursWorked = hrs;
	}
	
	public void setHourlyRate(double rate)
	{
		m_HourlyRate = rate;
	}
	
	public void setOvertimeHourlyRate(double overtime)
	{
		m_OvertimeHourlyRate = overtime;
	}
	
	//Gets
	public String getName() {return m_Name;}
	public double getHoursWorked() {return m_HoursWorked;}
	public double getHourlyRate() {return m_HourlyRate; }
	public double getOvertimeHourlyRate() { return m_OvertimeHourlyRate;}
	
	
	public double getPay()
	{
		return m_HoursWorked * m_HourlyRate;
	}
	
	

}
