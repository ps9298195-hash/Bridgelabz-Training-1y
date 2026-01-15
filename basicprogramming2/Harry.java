import java.util.Scanner;
class Harry
{
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the birthYear");
		int birthYear = input.nextInt() ;
		int currentyear = input.nextInt ();
		int age = currentyear-birthYear;
		System.out.println(age);
	}
}
