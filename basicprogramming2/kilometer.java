import java.util.Scanner ;
class kilometer
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		double kilometer = input.nextDouble();
		double miles =(kilometer*1.6);
		System.out.println(miles);
	}
}
