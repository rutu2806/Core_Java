/*09.Write a program to read the days (eg. 670 days) as integer value using Scanner class. Now convert the entered days into complete years, months and days and print them.*/

import java.util.Scanner;
public class YMD
{
    public static void main(String args[])
    {
       
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of days:");
        int nod = s.nextInt();

       int yr=0;
       int m=0; 
       int d=0;

       while (nod>=365){
       nod -=365;
        yr++;          
      }
      
      while(nod>=30){
       nod -=30;
       m++;            
       }
     
System.out.println(yr+ "years " +m+ "months "+nod+"days ");
     
    }
}