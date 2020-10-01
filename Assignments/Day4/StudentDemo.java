/*40.Create a class Student having data members name, roll no., age and score. Write a program to accept 10 records of student and store them in an array. And then arrange the student records based on the score group [0-50], [50-65], [65-80], [80-100].*/

import java.util.Scanner;

class Student{

private String name;
private int rollNo;
private int age;
private int score;

Student(String name,int rollNo,int age,int score){
	this.name=name;
	this.rollNo=rollNo;
	this.age=age;
	this.score=score;
	}

void Display(){
                 System.out.println("Name: "+name+" Roll_No: "+rollNo+" Age: "+age+" Score: "+score);

	}

public static Student[] sortScore(Student s[]){
	
	Student temp;
	for(int i=0;i<s.length;i++){
	   for(int j=i+1;j<s.length;j++)
		if(s[i].score > s[j].score){
			temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			}
		}
		

	System.out.println("Student with score<50 are: ");
	for(int i=0;i<s.length;i++){
	   if(s[i].score<50){
		s[i].Display();
		}
	}

	System.out.println("Student with score>=50 and <65 are: ");
	for(int i=0;i<s.length;i++){
	   if(s[i].score>=50 && s[i].score<65){
		s[i].Display();
		}
	}

	System.out.println("Student with score>=65 and <80 are: ");
	for(int i=0;i<s.length;i++){
	   if(s[i].score>=65 && s[i].score<80){
		s[i].Display();
		}
	}

	System.out.println("Student with score>=80 and <100 are: ");
	for(int i=0;i<s.length;i++){
	   if(s[i].score>=80 && s[i].score<100){
		s[i].Display();
		}
	}
	
	return s;

	}


}


class StudentDemo{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	
                     Student s[]=new Student[10];

     	for(int i=0;i<s.length;i++){
		System.out.println("Enter Name:");
		String name=sc.next();
		System.out.println("Enter Roll_no:");
		int rollNo=sc.nextInt();
		System.out.println("Enter Age:");
		int age=sc.nextInt();
		System.out.println("Enter Score:");
		int score=sc.nextInt();

		Student s1 = new Student(name,rollNo,age,score);
		
                		s[i]=s1;

		}

        	for(Student a : s){
		a.Display();
             		}

	Student.sortScore(s);

    }
}



//--------------------------------------------------------------------------------------------------------

