//This is Robert Gross' 9th programming assignment written on June 20th, 2023. The intention of this 
//assignment is to use class', getters, and setters in order to fetch information for 3 employees. The 
// This project requires two classes, the main class "EmployeeDemo" and the supplementary class "Employee".
package GrossEmployee; //package declaration
import java.util.Scanner; //insert scanner in order to be able to execute scanner commands

public class GrossEmployeeDemo { // class declaration
	

	public static void main(String[] args) { // main method
		
		GrossEmployee employeeRobert = new GrossEmployee("Robert Gross", 22204, true, 11.06); //create employee Robert
		GrossEmployee employeeCelebrity = new GrossEmployee(); //create employee celeb
		
		System.out.print(employeeRobert.getName() + "\nEmployee ID: " + employeeRobert.getIdNumber() +
				"\nFull-Time: "); //print employeeRobert name and Id and full time statement	
		
			if (employeeRobert.getIsFullTime()) { //if RobertTime is true print yes
			System.out.println("Yes");
			
			}else { //if RobertTime is false print no
				System.out.println("No");
		}
		System.out.printf("Wage: $%.2f",employeeRobert.getHourlyWage()); //print Robert Wage
		System.out.print(" per hour \n\n");
		
		
		employeeCelebrity.setName("Zendaya"); //set values for employeeCeleb
		employeeCelebrity.setIdNumber(168243);
		employeeCelebrity.setIsFullTime(false);
		employeeCelebrity.setHourlyWage(14.23);
		
		System.out.print(employeeCelebrity.getName() + "\nEmployee ID: " + employeeCelebrity.getIdNumber() +
				"\nFull-Time: "); //print employeeCelebrity name and Id and full time statement	
		
			if (employeeCelebrity.getIsFullTime()) { //if CelebTime is true print yes
			System.out.println("Yes");
			
			}else { //if CelebTime is false print no
				System.out.println("No");
		}
		System.out.printf("Wage: $%.2f",employeeCelebrity.getHourlyWage()); //print Celeb Wage
		System.out.print(" per hour \n"); //print per hour 
		
		
		
		Scanner scan = new Scanner(System.in); //Create Scanner to request info from user
		
		
		
		System.out.println("\nWhat is the Employee's name?"); //request name from User
		String userName = scan.nextLine();	//store user name as string
	
		System.out.println("What is the ID Number?"); //request ID Number from user
		int userIdNumber = scan.nextInt();	//store ID Number from user as int
		
		System.out.println("Are they full time?(1 for yes, 2 for no): "); //request int for full time
        int UserFullTime = scan.nextInt(); // store int
		
		System.out.println("What is the employee's hourly wage?"); //request wage from user
		double userHourlyWage = scan.nextDouble();	//store wage from user as double
		
		boolean isUserFullTime = false; //create boolean isUserFullTime and set to false
		
			if(UserFullTime == 1) { //if userinput =1 then UserFullTIme is true
				isUserFullTime = true; 
			}
			
		GrossEmployee employeeUser = new GrossEmployee(userName, userIdNumber, isUserFullTime,
				userHourlyWage); //create employee User
		
		
		System.out.print(employeeUser.getName() + "\nEmployee ID: " + employeeUser.getIdNumber() +
				"\nFull-Time: "); //print employeeCelebrity name and Id and full time statement	
		
			if (employeeUser.getIsFullTime()) { //if CelebTime is true print yes
			System.out.println("Yes");
			
			}else { //if CelebTime is false print no
				System.out.println("No");
		}
		System.out.printf("Wage: $%.2f",employeeUser.getHourlyWage()); //print Celeb Wage
		System.out.print(" per hour \n"); //print per hour
		
		scan.close(); //end scanner
	}
	

}
