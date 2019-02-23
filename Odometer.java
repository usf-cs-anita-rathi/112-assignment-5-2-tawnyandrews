import java.util.Scanner ;
public class Odometer
{
	Scanner input = new Scanner(System.in) ;
	private double odometer ;
	public double mileage ;
	public double efficiency ;
	public double gallons_consumed ;

	public void reset()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Would you like to reset your odometer reading?: ") ;
		String response = input.next();
		if (response.equals("yes"))
			odometer = 0 ;
		else
			odometer = odometer ;
			System.out.println("Odometer reading: "+odometer) ;
		}
		public void efficiency()
		{
			Scanner input = new Scanner(System.in) ;
			System.out.println("What is the fuel efficiency for your vehicle?: ") ;
			efficiency = input.nextDouble() ;
		}
		public void miles_travelled()
		{
			Scanner input = new Scanner(System.in) ;
			System.out.println("Enter miles driven during trip: ") ;
			mileage = input.nextDouble() ;
			odometer += mileage ;
		}
		public void gallons_consumed()
		{
			Scanner input = new Scanner(System.in) ;
			gallons_consumed = odometer/efficiency ; 
	
		}
		public void all_info()
		{
			System.out.println("Fuel efficiency: "+efficiency) ;
			System.out.println("Updated odometer reading: "+odometer) ;
			System.out.println("Gallons consumed since last odometer reset: "+gallons_consumed) ;


		}

}