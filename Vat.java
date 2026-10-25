import java.util.Scanner;
public class Vat{
	
	public static void main(String[] arg){
	
	     //Instantiation of the scanner object
	    Scanner target = new Scanner(System.in);
	
	    //Declaring variables
	    String sName;
	    final double rVat_Calc = 0.15;
	    int iCost;
	    double rPrice;
	
	    //Input 
	    System.out.print("\nWhat item was bought: ");
	    sName = target.nextLine();
	    System.out.print("How much did it cost?: ");
	    iCost = target.nextInt();
	    rPrice = iCost + (rVat_Calc * iCost);
		
		//Output
	    System.out.print("So the total price for " + sName + " is R" + rPrice);	
	}
}
