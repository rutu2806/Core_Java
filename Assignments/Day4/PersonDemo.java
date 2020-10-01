/*37.Create a class Person with properties (name and age) with following features. 
a.Default age of person should be 18.
b.A person object can be initialized with name and age.
c.Method to display name and age of person
Create another class PersonDemo ( main class ) that demonstrates the functionalities of Person class by creating Person object and calling methods.
*/

import java.util.Scanner;
class Person{
     	private int age;
 	private String name;

        Person(){
         	 this.age=18;
                 //System.out.println(this.age);
           }
        
      Person(String name){
        	this();
	this.name=name;
	}
       
     void  DisplayPerson(){
	System.out.println(" Name : "+this.name+" & Age :"+this.age);
	}

}

class PersonDemo{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	Person p=new Person("maya");
	p.DisplayPerson();
	
 	}
}