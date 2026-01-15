import java.util.Scanner;
class distance
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		double kilo = input.nextDouble();
		double miles= kilo*1.6;
		System.out.println(miles);
	}
}
