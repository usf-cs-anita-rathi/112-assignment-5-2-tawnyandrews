import java.util.Scanner ;

public class OdometerDemo
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Odometer car1 = new Odometer() ;
		boolean runAgain = true ;
		car1 = new Odometer() ;
		System.out.println("Car #1:");
		car1.efficiency();
		
		while(runAgain==true)
		{
			car1.miles_travelled();
			car1.gallons_consumed() ;
			car1.all_info() ;
			car1.reset() ;
			//Scanner input = new Scanner(System.in);
			System.out.print("Would you like to go on another trip?: ") ;
			String anothertrip = input.next() ;
			if(anothertrip.equals("yes"))
				runAgain = true ;
			else if(anothertrip.equals("no"))
				System.exit(0); 
			else
				System.out.println("Invalid input!") ;
		}
		

	}
}