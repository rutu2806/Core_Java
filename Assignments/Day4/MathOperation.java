/*35.Create a class MathOperation that has four static methods. add() method that takes two integer numbers as parameter and returns the sum of the numbers. subtract() method that takes two integer numbers as parameter and returns the difference of the numbers. multiply() method that takes two integer numbers as parameter and returns the product. power() method that takes two integer numbers as parameter and returns the power of first number to second number. Create another class Demo (main class) that takes the two numbers from the user and calls all four methods of MathOperation class by providing entered numbers and prints the return values of every method.*/


import java.util.Scanner;
import java.lang.Math;

class MathOpe{
                  static int Sum(int i,int j)
	{
   	  return i+j;
                  }
	 static int Sub(int i,int j)
	{
   	  return i-j;
                  }
	 static int Mul(int i,int j)
	{
   	  return i*j;
                  }
	 static double Power(int i,int j)
	{
   	  return Math.pow(i, j);
                  }
	 
}

class MathOpeDemo{
 	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number: ");
	int i = sc.nextInt();
	System.out.println("Enter second number: ");
	int j = sc.nextInt();

	System.out.println("Addition: "+MathOpe.Sum(i,j));
	System.out.println("Subtraction: "+MathOpe.Sub(i,j));
	System.out.println("Multiplication: "+MathOpe.Mul(i,j));
	System.out.println("Power: "+MathOpe.Power(i,j));

 } }