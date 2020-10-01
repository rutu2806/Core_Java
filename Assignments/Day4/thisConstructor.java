/*41.Write a program to demonstrate this() construct functionality.*/


class Demo{
	Demo(){
		this(10);
		System.out.println("This is a Non-Parametrised Constructor");
		}

	Demo(int i){
		this(20,30);
		System.out.println("This is a Parametrised Constructor");
		}
	
	Demo(int a,int b){
	System.out.println(a+" "+b);
		}


	}

class ThisDemo{
	public static void main(String args[]){
		
	Demo d=new Demo();
		}
	
	}