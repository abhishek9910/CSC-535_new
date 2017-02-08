
public class Number {

		public static void main(String argv[])
		{
		int c=0;
		for(int i=1;i<=1000000;i++)
		{
		 if (i%9==0|| i
		%13==0|| i
		%27==0|| i
		%81==0)
		 {
			 c ++;
		 }
		}
		 System.out.println("The total numbers present between 1 and 1 Millon and which are divisible by 9,13,27,81 :"+c);
		}
		}