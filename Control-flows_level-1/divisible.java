import java.util.Scanner;
class divisible
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.=  ");
		int num=sc.nextInt();
		if(num%5==0)
		{
		System.out.println("divisible");
		}
		else
		{
		System.out.println("not divisible");
		}
	}
}
