class Fizzbuzz
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		if(num<0){
			System.out.println("Invalid");
			return;
		}
		String result[]=new int[num];
		for(i=0;i<num;i++){
			if(i%3==0&i%5==0){
			result[i+1]="Fizzbuzz";
			}
		
		else if(i%3){
			result[i+1]="Fizz";
		}
		else if(i%5){
			result[i+1]="Buzz";
		}
		else{
			result[i]=String.valueOf(i);
		}
		}
		System.out.println(Arrays.tostring[i]);
	}
}
