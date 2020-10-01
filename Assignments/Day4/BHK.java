
import java.util.Scanner;
class OneBhk
{

     private int roomArea ;
     private int hallArea ;
     private float price;
     private static float totalPrice;
	
	OneBhk(){
		this(200,200,100f);	
		
		}
	
	OneBhk(int roomArea,int hallArea,float price)
	{
        	this.roomArea = roomArea;
       	this.hallArea = hallArea;
        	this.price = price ; 
                  totalPrice+= price;
 	}
	
	public void show()
	{
  	 System.out.println("roomArea = "+this.roomArea);
  	 System.out.println("HallArea = "+this.hallArea);
 	 System.out.println("Price = "+this.price);
	}

	public static void Calculate(){
	System.out.println("Total amount is: "+totalPrice);
	}

}

 class TwoBhk  extends OneBhk{
                    
	 private int room2Area;

  TwoBhk(){
	super();
	room2Area=200;
	}
	  
  
 TwoBhk(int roomArea,int hallArea,float price,int room2Area)
{
       super(roomArea, hallArea, price);
        this.room2Area = room2Area;
       
 }


public void show()
 {
   super.show();
   System.out.println("room2Area = "+room2Area);

  }


}

 class Demo
{

  public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);

		for(int i=0; i<3; i++){

			System.out.println("Enter room 1area: ");
			int rm1 = sc.nextInt();
			System.out.println("Enter hall area: ");
			int ha = sc.nextInt();
			System.out.println("Enter room 2 area: ");
			int rm2 = sc.nextInt();
			System.out.println("Enter room price: ");
			float price = sc.nextInt();


		TwoBhk tb = new TwoBhk(rm1, ha, price, rm2);
			tb.show();
			}
    	OneBhk.Calculate();

}

}
