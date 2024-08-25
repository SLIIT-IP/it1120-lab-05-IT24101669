import java.util.Scanner;

	public class IT24101669Lab5Q3{
    		public static void main(String[] args){

        	Scanner scanner = new Scanner(System.in);

        		final double roomperday = 48000.00;
       			final double discount_3_4_days = 0.1;
        		final double discount_5_more_days = 0.2;


       		System.out.print("Enter Start Date (1-31):");
        	int startdate = scanner.nextInt();

        	System.out.print("Enter End Date (1-31):");
        	int enddate = scanner.nextInt();
		
		if(startdate <= 0 || enddate >= 31)
        		{
           			System.out.println("Error: Days must be betweeen 1 and 31");
            			return;
       			}
               else if(startdate >= enddate)
        		{
           			System.out.println("Error: Start Date must be less than End Date");
            			return;
        		}
		 
       		System.out.println("");
        	System.out.println("Room Charge per Day: Rs. 48000.0/= ");

        		int daysreserved = enddate - startdate;
        		System.out.println("Number of Days Reserved: " + daysreserved);

        			double priceforroom = roomperday*daysreserved;
        			double discountrate = 0.0;

        	if(daysreserved>=3 && daysreserved<=4)
        		{
            			discountrate = discount_3_4_days;
        		}
        	else if(daysreserved>=5)
        		{
             			discountrate = discount_5_more_days;
        		}


        			double discountprice = 	priceforroom*discountrate;
        			double totalprice = priceforroom - discountprice;

        	System.out.print("Totle Amount to be Paid:" + totalprice);

    }
}