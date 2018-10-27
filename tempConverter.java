import java.util.*;
public class tempConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Testing");
		Celcius c = new Celcius(input.nextDouble());
		Fahrenheit f = new Fahrenheit(input.nextDouble());
		Kelvin k = new Kelvin(input.nextDouble());
		Rankine ra = new Rankine(input.nextDouble());
		Reaumur re = new Reaumur(input.nextDouble());
	}
}

interface toFahrenheit{
	double convertToFahrenheit(double a);
}

interface toCelcius{
	double convertToCelcius(double a);
}

interface toKelvin{
	double convertToKelvin(double a);
}

interface toRankine{
	double convertToRankine(double a);
}

interface toReaumur{
	double convertToReaumur(double a);
}

class Celcius implements toFahrenheit, toKelvin, toRankine, toReaumur{
	
	public Celcius(double a) {
		System.out.println("Celcius to Fahrenheit = " + convertToFahrenheit(a));
		System.out.println("Celcius to Kelvin = " + convertToKelvin(a));
		System.out.println("Celcius to Rankine = " + convertToRankine(a));
		System.out.println("Celcius to Reaumur = " + convertToReaumur(a));
	}

	@Override
	public double convertToReaumur(double a) {
		// TODO Auto-generated method stub
		return a * 0.8;
	}

	@Override
	public double convertToRankine(double a) {
		// TODO Auto-generated method stub
		return a * 1.8 + 32 + 459.67;
	}

	@Override
	public double convertToKelvin(double a) {
		// TODO Auto-generated method stub
		return a + 273.15;
	}

	@Override
	public double convertToFahrenheit(double a) {
		// TODO Auto-generated method stub
		return a * 1.8 + 32;
	}
}

class Fahrenheit implements toCelcius, toKelvin, toRankine, toReaumur{
	
	public Fahrenheit(double a) {
		System.out.println("Fahrenheit to Celcius = " + convertToCelcius(a));
		System.out.println("Fahrenheit to Kelvin = " + convertToKelvin(a));
		System.out.println("Fahrenheit to Rankine = " + convertToRankine(a));
		System.out.println("Fahrenheit to Reaumur = " + convertToReaumur(a));
	}

	@Override
	public double convertToReaumur(double a) {
		// TODO Auto-generated method stub
		return (a - 32) / 2.25;
	}

	@Override
	public double convertToRankine(double a) {
		// TODO Auto-generated method stub
		return a + 459.67;
	}

	@Override
	public double convertToKelvin(double a) {
		// TODO Auto-generated method stub
		return (a + 459.67) / 1.8;
	}

	@Override
	public double convertToCelcius(double a) {
		// TODO Auto-generated method stub
		return (a - 32) / 1.8;
	}
	
}

class Kelvin implements toCelcius, toFahrenheit, toRankine, toReaumur{
	
	public Kelvin(double a) {
		System.out.println("Kelvin to Celcius = " + convertToCelcius(a));
		System.out.println("Kelvin to Fahrenheit = " + convertToFahrenheit(a));
		System.out.println("Kelvin to Rankine = " + convertToRankine(a));
		System.out.println("Kelvin to Reaumur = " + convertToReaumur(a));
	}

	@Override
	public double convertToReaumur(double a) {
		// TODO Auto-generated method stub
		return (a - 273.15) * 0.8;
	}

	@Override
	public double convertToRankine(double a) {
		// TODO Auto-generated method stub
		return a * 1.8;
	}

	@Override
	public double convertToFahrenheit(double a) {
		// TODO Auto-generated method stub
		return a * 1.8 - 459.67;
	}

	@Override
	public double convertToCelcius(double a) {
		// TODO Auto-generated method stub
		return a - 273.15;
	}
	
}

class Rankine implements toCelcius, toFahrenheit, toKelvin, toReaumur{
	
	public Rankine(double a) {
		System.out.println("Rankine to Celcius = " + convertToCelcius(a));
		System.out.println("Rankine to Fahrenheit = " + convertToFahrenheit(a));
		System.out.println("Rankine to Kelvin = " + convertToKelvin(a));
		System.out.println("Rankine to Reaumur = " + convertToReaumur(a));
	}

	@Override
	public double convertToReaumur(double a) {
		// TODO Auto-generated method stub
		return (a - 32 - 459.67) / 2.25;
	}

	@Override
	public double convertToKelvin(double a) {
		// TODO Auto-generated method stub
		return a / 1.8;
	}

	@Override
	public double convertToFahrenheit(double a) {
		// TODO Auto-generated method stub
		return a - 459.67;
	}

	@Override
	public double convertToCelcius(double a) {
		// TODO Auto-generated method stub
		return (a - 32 - 459.67) / 1.8;
	}
	
}

class Reaumur implements toCelcius, toFahrenheit, toKelvin, toRankine{
	
	public Reaumur(double a) {
		System.out.println("Reaumur to Celcius = " + convertToCelcius(a));
		System.out.println("Reaumur to Fahrenheit = " + convertToFahrenheit(a));
		System.out.println("Reaumur to Kelvin = " + convertToKelvin(a));
		System.out.println("Reaumur to Rankine = " + convertToRankine(a));
	}

	@Override
	public double convertToRankine(double a) {
		// TODO Auto-generated method stub
		return a * 2.25 + 32 + 459.67;
	}

	@Override
	public double convertToKelvin(double a) {
		// TODO Auto-generated method stub
		return a * 1.25 + 273.15;
	}

	@Override
	public double convertToFahrenheit(double a) {
		// TODO Auto-generated method stub
		return a * 2.25 + 32;
	}

	@Override
	public double convertToCelcius(double a) {
		// TODO Auto-generated method stub
		return a * 1.25;
	}
	
}
