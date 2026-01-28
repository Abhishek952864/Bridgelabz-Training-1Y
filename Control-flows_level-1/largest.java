import java.util.Scanner;
class largest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st no.=  ");
		int num1=sc.nextInt();
		System.out.println("Enter 2nd no.=  ");
		int num2=sc.nextInt();
		System.out.println("Enter 3rd no.=  ");
		int num3=sc.nextInt();
		if(num1>num2){
		System.out.println("num1 is largest");
		}
		else if(num2>num3)
		{
		System.out.println("num2 is largest");
		}
		else{
		System.out.println("num3 is largest");
		}
	}
}
