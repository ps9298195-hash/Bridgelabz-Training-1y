import java.util.Scanner;
class university
{
	public static void main(String args[])
	{
		Scanner input= new Scanner(System.in);
		int fee = 125000;
		int discountper=10;
		int discount=125000*10/100;
		int finalFee =fee-discount;
		System.out.println(discountper);
		System.out.println(finalFee);
	}
}

		