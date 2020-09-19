/*22.Sort a ten element array in descending order.*/

import java.util.Scanner;
import java.util.Arrays;

class ArraySort
{

public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements");
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{

System.out.println("Enter an number");
arr[i]=sc.nextInt();

}

Arrays.sort(arr);

System.out.println("Descending order : ");
for(int i=(arr.length-1);i>=0;i--)
{

System.out.print(arr[i]+" ");
}
}
}


class ArraySort1
{

public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements");
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{

System.out.println("Enter an number");
arr[i]=sc.nextInt();

}

/*Arrays.sort(arr);*/

for (int i=0; i<arr.length-1;i++){

	for(int j=i+1; j<=arr.length-1;j++){
	
		if(arr[i]<arr[j]){
		int temp = arr[i];
                                arr[i] = arr[j];
		arr[j] = temp;		
		}
	}
}


System.out.println("Descending order : ");
for(int i : arr)
{

System.out.print(i +" ");
}
}
}
