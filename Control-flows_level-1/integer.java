import java.util.Scanner;
class assignment
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers=");
		int num1=sc.nextInt();
		if(num1>0){
			System.out.println("POSITIVE");
		}
		else if(num1<0){
		System.out.println("NEGATIVE");	
		}
		else{
			System.out.println("ZERo");
		}
	}
}



