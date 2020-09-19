/*20.Print all prime numbers between two given numbers. [ break continue ]*/

import java.util.Scanner;

class PrimeRange{

	public static void main (String args[]){

		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter 1st no.");
		int no1= sc.nextInt();
		
		System.out.println("Enter  2nd no.");
		int no2= sc.nextInt();
                                
		int count;
		System.out.print("Prime numbers between "+no1+" and "+no2+" are: ");
		for(int i=no1;i<=no2;i++){
		       count=0;
		for(int j=1; j<=i; j++){
			if(i%j==0){
			count++;
			}
		        }
                                if(count==2){
		 System.out.print(i+" ");
			}
		}		
                }
}