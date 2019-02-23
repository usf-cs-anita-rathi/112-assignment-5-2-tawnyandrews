import java.util.Scanner ;

public class Temperature
{
	Scanner input = new Scanner(System.in);
	float temperature ; 	
	float fahrenheit ;
	float celsius ;
	String temp_scale ;

	public String setTempScale()
	{
		C_temp() ;
		F_temp() ;
		return " " ;
	}

	public float C_temp()
	{
		temperature = temperature;
		temp_scale = "C" ;
		return temperature ;
	}
	public float F_temp()
	{
		temperature = temperature;
		temp_scale = "F" ;
		return temperature ;
	}

	public float fahrenheit()
	{
		System.out.print("Enter the degrees Celsius you'd like to convert: ");
		float celsius = input.nextFloat();
		fahrenheit = ((9*celsius)/5)+32 ;
		return fahrenheit ;
	}

	public float celsius()
	{
		System.out.print("Enter the degrees Fahrenheit you'd like to convert: ");
		float fahrenheit = input.nextFloat();
		celsius = (5*(fahrenheit-32)/9) ;
		return celsius ;
	}

	public String toString()
	{
		return ("Celsius: "+ celsius +"\nFahrenheit: "+fahrenheit); 
	}



}