import java.util.Scanner ;
public class TemperatureDemo
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in) ;
		Temperature temp1 = new Temperature() ;
		float fahrenheit ;
		float celsius ;

		System.out.print("Would you like to convert to fahrenheit or celsius (f or c)? ") ;
		String choice = input.next();
		if (choice.equals("f"))
		{
			System.out.println(fahrenheit = temp1.fahrenheit()) ;
		}
		else if (choice.equals("c"))
		{
			System.out.println(celsius = temp1.celsius());
		}
		else
		{
			System.out.println("Invalid input!");
		}
		

	}
}