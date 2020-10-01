/*33.Write a program to demonstrate functionalities of this keyword in java. */

import java.util.Scanner;
class Student{
	
	private int rollno;
	private String name;
	
	void setData(int rollno, String name){
	this.rollno=rollno;
	this.name=name;
		}

	void showData(){
	System.out.println(rollno+" "+name);
	      }

	}	

class StudentDemo{
public static void main(String args[]){
                         Student s =new Student();
	       s.setData(20,"Rutuja");
	       s.showData();
	        
                         Student s1=new Student();
	       s1.setData(2,"Maya");
	       s1.showData();
             
	/*Scanner sc = new Scanner(System.in);

		System.out.print("Enter Student's name: ");
		String name = sc.nextLine();

		System.out.print("Enter roll number: ");
		int rollno = sc.nextInt();

		Student s =new Student();
		
		s.setData(rollno,name);
		s.showData();*/
	}
}