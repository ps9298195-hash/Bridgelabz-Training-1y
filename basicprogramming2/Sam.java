import java.util.Scanner;
class Sam
{
	public static void main(String args [])
	{
		Scanner input= new Scanner (System.in);
		int maths = input.nextInt();
		int physics = input.nextInt();
		int chemistry = input.nextInt();
		int average =( maths+physics+chemistry )/ 3;
		System.out.println(average);
	}
}
