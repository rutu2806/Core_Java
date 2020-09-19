/*25.Write the program to find the sum of even elements and sum of odd elements present in the array of integer type.*/
import java.util.Scanner;
class SumEvenOdd{

	public static void main (String args[]){

		Scanner sc = new Scanner(System.in);
                                 
		System.out.println("Enter size of the array: ");
		int size = sc.nextInt();
                                int arr[]= new int[size];
                              

		for(int i=0; i<size; i++){
			System.out.print("Enter a number: ");
			arr[i]=sc.nextInt();
		}
                                      
		int even = 0;
		int odd = 0;
                                for (int i=0; i<size;i++){

                                         if(arr[i] % 2 == 0){
                                                  even+=arr[i];
                                        }
                                        else{
                                                 odd+=arr[i];
                                         }
		}
                                 System.out.println("Sum of even elements:" +even);
                                 System.out.println("Sum of even elements:" +odd);

	}	

}