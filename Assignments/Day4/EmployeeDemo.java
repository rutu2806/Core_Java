/*38.Create a class Employee with three data members (empNo, salary and totalSalary) and following features.
a.Only parameterized constructor. [Do not overload the constructor]
b.totalSalary always represents salary total of all the employees created.
c.empNo should be auto incremented.
d.display total employees and totalSalary using a method.
Create another class EmployeeDemo (main class) that creates some Employee objects and calls Employee method to display no. of employees and total of their salaries.*/



import java.util.Scanner;
class Employee{
     	private static int empNo;
	private float salary;
 	private  static float totalSalary;

        Employee(float salary){
         	 this.salary=salary;
                  empNo++;
	totalSalary+=salary;
           }
        
      
       void  DisplayEmployee(){
	System.out.println(" Employee id : "+empNo);
	System.out.println("Employee Salary: "+salary);
	}

      static void DisplayEmployee1(){
	System.out.println(" Total Salary : "+totalSalary);}

}

class EmployeeDemo{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);

 	 for(int i=0;i<3;i++)
	{
	System.out.println("Enter empNo:");
	int empNo=sc.nextInt();
	
	System.out.println("Enter salary:");
	float salary=sc.nextFloat();
	Employee e = new Employee(salary);
	e.DisplayEmployee();
	
	}
                  Employee.DisplayEmployee1();	
        }
}