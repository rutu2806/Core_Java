/*11.	Write a program to swap two numbers without using third variable.*/

import java.util.Scanner;

class Swap{
      public static void main(String args[]){
           Scanner in= new Scanner(System.in);
           System.out.println("Enter 1st no:");
           int num1=in.nextInt();
           System.out.println("Enter 2nd no:");
           int num2=in.nextInt();
           System.out.println("Before Swap: 1st = "+num1+" \t 2nd = "+num2);
         
           num1=num1+num2;
           num2=num1-num2;
           num1=num1-num2;
           System.out.println("After Swap:  1st = "+num1+" \t 2nd = "+num2);

        }

}
