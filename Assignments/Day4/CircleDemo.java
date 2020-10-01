/*34.Create a class Circle that has two data members, one to store the radius and another to store area and three methods first init() method to input radius from user, second calculateArea() method to calculate area of circle and third display() method to display values of radius and area. Create class CircleDemo ( main class) that creates the Circle object and calls init(), calculateArea() and display() methods.*/


import java.util.Scanner;
class Circle{
 private float radius;
 private float area;

void CircleInit(float radius){
   this.radius=radius;
    }

void CalculateArea(){
 
  area= 3.14f*radius*radius;
}

void show(){
	System.out.println("Circle radius : "+this.radius+" & Area : "+area);
     }

}

class CircleDemo{

public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter radius:");
	float radius=sc.nextFloat();

	Circle c=new Circle();
	c.CircleInit(radius);
	c.CalculateArea();
	c.show();
	}
}