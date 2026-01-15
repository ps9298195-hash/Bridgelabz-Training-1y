import java.util.Scanner;
class volumeofearth
{
	public static void main(String args[])
	{
		Scanner input =  new Scanner(System.in);
		double kilo = 6378;
		double miles = kilo*0.6;
		System.out.println(miles);
		double r = miles;
		double volumeofearth = 4/3*3.14*r*r*r;
		System.out.println(volumeofearth);
	}
}
