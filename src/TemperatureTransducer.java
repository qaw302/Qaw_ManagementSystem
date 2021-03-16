import java.util.Scanner;

public class TemperatureTransducer {

	public static void main(String[] args) {
		System.out.print("Input the Fahrenheit: ");
		Scanner input = new Scanner(System.in);
		
		double Fahrenheit = input.nextDouble();
		double Celsius = (Fahrenheit - 32)*5/9;
		System.out.println(Celsius);

	}

}
