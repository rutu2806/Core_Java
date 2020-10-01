/*39.Create class Product with three data members (pid, price, quantity) and parameterized constructor that takes values for all three data members.  
Create a main method in different class (say ProductDemo) and perform following task:
a. Accept information for five Product objects from user and store objects in an array
b. Find pid of product with highest price. 
c. Create a static method (with array of product’s object as argument) in Product class to calculate and return total amount spent on all products. ( amount spent on single product = price of product * quantity of product )
*/

import java.util.Scanner;
class Product{

private int pid;
private float price;
private int quantity;


    Product(int pid, float price, int quantity){
	this.pid=pid;
	this.price=price;
	this.quantity=quantity;
	}


   public static void HighPrice(Product []p){
	Product max=p[0];
	for(int i=1;i<p.length;i++){
	    if(max.price < p[i].price)
	         	{ 
		max = p[i];
		}
	  	 }
	System.out.println(" Highest price Product id: "+max.pid);
	}

 public static void ProductArray(Product p[]){
	float total=0f;
	for(int i=0;i<p.length;i++){
	total +=p[i].quantity*p[i].price;
	}
	System.out.println(" Total Price: "+total);
}


 void DisplayProduct(){
	System.out.println("Product Id:"+this.pid+" Price: "+this.price+" Quantity: "+this.quantity);
	}
}

class ProductDemo{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
		Product p[]=new Product[5];
	for(int i=0;i<p.length;i++){
		System.out.println("Enter pid:");
		int pid=sc.nextInt();
		System.out.println("Enter price:");
		float price=sc.nextFloat();
		System.out.println("Enter Quantity:");
		int quantity=sc.nextInt();
                                   

		Product pp=new Product(pid,price,quantity);
		p[i]=pp;

		}

		Product.HighPrice(p);
		Product.ProductArray(p);
		}
	}