/*14.Program to check that entered year is a leap year or not.*/

import java.util.Scanner;

class Leapyear
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

int year =sc.nextInt();

String check= (year%4==0 && year%100!=0) ?  year + "is a leap year" : ((year%400 == 0 ) ? year+" is a leap year": year + "is not a leap year");

System.out.println(check);
     }
}