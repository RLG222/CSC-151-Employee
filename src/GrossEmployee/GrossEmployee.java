package GrossEmployee; //package declaration

public class GrossEmployee { // class declaration 
	
	private String name; //fields for name, idNumber, isFullTime, and hourlyWage
	private int idNumber;
	private boolean isFullTime;
	private double hourlyWage; // last field
	
	public void setName(String userName) { //first setter for fields
		name = userName;
	}
	
	public void setIdNumber(int userIdNumber) {
		idNumber = userIdNumber;
	}
	
	public void setIsFullTime(boolean userIsFullTime) {
		isFullTime = userIsFullTime;
	}
	
	public void setHourlyWage(double userHourlyWage) { // last setter for fields
		hourlyWage = userHourlyWage;
	}
	
	public String getName() { //first getter for fields
		return name;
	}
	
	public int getIdNumber() {
		return idNumber;
	}
	
	public boolean getIsFullTime() {
		return isFullTime;
	}
	
	public double getHourlyWage() { // last getter for fields
		return hourlyWage;
	}
	
	
	/*This constructor accepts all 4 fields, and assigns them to the appropriate field 
	 * 
	 */
	public GrossEmployee( String employeeName , int employeeIdNumber, 
			boolean employeeIsFullTime, double employeeHourlyWage ) {	
		name = employeeName;
		idNumber = employeeIdNumber;
		isFullTime = employeeIsFullTime;
		hourlyWage = employeeHourlyWage;
	}
	
	/*This constructor acts as a defualt constructor, returning the name as blank, the id number as 0, the
	 * worker is set to not being fulltime, and a minimum wage of 7.25 for the worker as well
	 */
	public GrossEmployee() {	
		name = "";
		idNumber = 0;
		isFullTime = false;
		hourlyWage = 7.25;
		
	}
}
