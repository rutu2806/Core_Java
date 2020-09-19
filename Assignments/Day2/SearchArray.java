/*24.Write a program to search an element in the array.*/
import java.util.Scanner;
class SearchArray{

	public static void main (String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of the array: ");
		int size = sc.nextInt();
                                int arr[]= new int[size];

		for(int i=0; i<size; i++){
			System.out.print("Enter a number: ");
			arr[i]=sc.nextInt();
		}
                               
                               System.out.println("Enter number to serach: ");
                               int search = sc.nextInt();

                              for(int i=0; i<size; i++){
                               if(arr[i]==search){
                                        System.out.println("Element "+search+" found ." ); 
                                       break;
                                        }
                                     
                             }
                                     System.out.println("Element "+search+" not found ." ); 

	}	

}