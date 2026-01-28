import java.util.Scanner;
class assignment
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age=");
		int age=sc.nextInt();
		if(age>=18){
		System.out.println("the person age is greater and can vote");	
		}
		else{
		System.out.println("the person age is less and cannot vote");	
		}
	}
}



