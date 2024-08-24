import java.util.Scanner;

	public class IT24101669Lab5Q1{
    		public static void main(String[] args){

        		Scanner scanner = new Scanner(System.in);

       			 System.out.print("Enter the fist integer: ");
       			 int number1 =scanner.nextInt();
		
       			 System.out.print("Enter the second integer: ");
       			 int number2 = scanner.nextInt();

        		System.out.print("Enter the third integer: ");
        		int number3 = scanner.nextInt();


       		 	System.out.println(" ");
       			System.out.println("User entered number are :" +  number1 + " " +number2 + " " + number3 + " ");
			
			int smallerstnumber = number1;
       			
		//checking Smallest number

			if(number2<smallerstnumber)
			{
				smallerstnumber = number2;	
            		}
			
			if(number3<smallerstnumber)
			{
				smallerstnumber = number3;
			}
			
			System.out.println("The Smallest number is : "+ smallerstnumber);
					
			
			int largestnumber = number1;
       			
		//checking Largest number

			if(number2>largestnumber)
			{
				largestnumber = number2;	
            		}
			
			if(number3>largestnumber)
			{
				largestnumber = number3;
			}
			
			System.out.println("The Largest number is : "+ largestnumber);
					

			
			
    }
}
