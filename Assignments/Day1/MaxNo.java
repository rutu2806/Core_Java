/*13.Program to find greatest in 3 numbers. [ once using if else statement and then using ternary operator ( logical operator) ]  */

import java.util.Scanner;

class Max
{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println(": Greatest of three :");
System.out.println("Enter 1st number : ");
int  a=sc.nextInt();
System.out.println("Enter 2nd number : ");
int  b=sc.nextInt();
System.out.println("Enter 3rd number : ");
int  c=sc.nextInt();

if(a>b && a>c)
{
	System.out.println("The greatest of three "+a+" and "+b+" and "+c+" is --> "+a);
}
else if(b>a && b>c)
{
	System.out.println("The greatest of three "+a+" and "+b+" and "+c+" is --> "+b);
}
else
{
	System.out.println("The greatest of three "+a+" and "+b+" and "+c+" is --> "+c);
}

}
}

class Greater{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

int  n1=sc.nextInt();
int  n2=sc.nextInt();
int  n3=sc.nextInt();

int max = (n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
System.out.println("Maximum is: "+max);
}
}
