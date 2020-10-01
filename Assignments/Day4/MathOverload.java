/*36.Create a class MathOperation containing overloaded methods ‘multiply’ to calculate multiplication of following arguments. 
a.two integers 
b. three floats 
c. all elements of array 
d.one double and one integer 
*/

class MathOverload{
 static void Multiply(int i, int j){
	int a= i*j;
	System.out.println(a);
	}

static void Multiply(float i, float j, float k){
	float a= i*j*k;
	System.out.println(a);
}
 
static void Multiply(double i, int j){
	double a= i*j;
	System.out.println(a);
}

}

class MathOverloadDemo{
 public static void main(String args[]){
	MathOverload.Multiply(10,20);
	MathOverload.Multiply(10,20,30);
	MathOverload.Multiply(3D,2);

	}
}




/*Second method

import java.util.Scanner;

class MultiOverload{
	
		int Multiply(int no1, int no2){
			return no1*no2;
		}

		float Multiply(float no1, float no2, float no3){
			return no1*no2*no3;
		}

		double Multiply(double no1, int no2){
			return no1*no2;
		}

		

	
}

class MultiOverloadDemo{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		
		MultiOverload m = new MultiOverload();
		double x = 24;
		System.out.println(x);
		
		System.out.println("Multiplication int int: "+m.Multiply(2,3));
		System.out.println("Multiplication float*3: "+m.Multiply(2,3,4));
		System.out.println("Multiplication double int : "+m.Multiply(2D,3));
		 
	}
	
}

*/