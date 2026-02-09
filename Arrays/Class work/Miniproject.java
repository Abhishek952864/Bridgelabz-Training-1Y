class CALCULATOR
{
	
		public int add(int num1, int num2)
		{
			return num1+num2;
		}
		public int sub(int num1, int num2)
		{
			return num1-num2;
		}
		public int mul(int num1, int num2)
		{
			return num1*num2;
		}
		public int div(int num1, int num2)
		{
			return num1/num2;
		}
		public static void main(String...args)
		{
			int a=10;
			int b=5;
			CALCULATOR c1=new CALCULATOR();
			int addition=c1.add(a,b);
			System.out.println(addition);
			int subtraction=c1.sub(a,b);
			System.out.println(subtraction);
			int multipication=c1.mul(a,b);
			System.out.println(multipication);
			int division=c1.div(a,b);
			System.out.println(division);
		}
}
