/*08.Write a program to find the simple interest. Take the principle amount, rate of interest and time from user using Scanner class.*/

import java.util.Scanner;
  class SI{
     public static void main (String args[]){
     Scanner in=new Scanner(System.in);
     System.out.println("Enter Principle:");
     float p = in.nextFloat();
     System.out.println("Enter Rate:");
     float r = in.nextFloat();
     System.out.println("Enter Time:");
     float t = in.nextFloat();

     float SI=(p*t*r)/100;
  System.out.println("Simple Interest="+SI);
     
       }

}