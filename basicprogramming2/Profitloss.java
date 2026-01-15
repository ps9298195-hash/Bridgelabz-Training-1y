import java.util.Scanner;
class Profitloss
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int costprice = input.nextInt();
		int sellingprice = input.nextInt();
		int profitper = (costprice-sellingprice)/100;
		System.out.println(profitper);
	}
}
