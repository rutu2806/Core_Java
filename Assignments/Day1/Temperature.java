/*10.Write a program to convert temperature from Fahrenheit to Celsius. Take Fahrenheit as input using Scanner class. [ formula : C= 5*(f-32)/9 ]*/

import java.util.Scanner;
class Temperature
{
   public static void main(String args[])
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter temperature");

      float temp=in.nextFloat();
      float C= 5*(temp-32)/9;

      System.out.println("Fahrenheit to Celsius = " + String.format("%.3f", C));
     
   }
}
