import java.util.Scanner;

	public class IT24101669Lab5Q2{
		public static void main(String[] args){

			Scanner scanner = new Scanner(System.in);

			System.out.print("Enter the number of new members introduced: ");
			int member = scanner.nextInt();
			
			System.out.println();

			if(member<0)
				{
					System.out.println("Input must be a number 0 or greater");
				}
			else
			{
				switch(member)
				{
			
					case 0 : System.out.print("Prize is a : No Prize");
						break;
	
					case 1 : System.out.print("Prize is a : Pen");
						break;	
			
					case 2 : System.out.print("Prize is a : Umbrella");
						break;

					case 3 : System.out.print("Prize is a : Bag");
						break;
	
					case 4 : System.out.print("Prize is a : Travelling Chair");
						break;
							
					default :  System.out.print("Prize is a : Headphone");
				}
	
			}

	}

}								