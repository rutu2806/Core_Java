/*18.Program to check whether number is prime or not.*/

import java.util.Scanner;

class RevNo{

	public static void main (String args[]){

		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter a no.");
		int num= sc.nextInt();
                                int reverse=0;
		while(num>0){
			
		int digit = num%10;
		reverse = reverse*10+digit;
                                num/=10;
                                }
 		System.out.println("Reverse is:"+reverse);      

	}
}