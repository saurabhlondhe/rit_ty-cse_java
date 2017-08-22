import java.util.Scanner;
class factorial
{
	public static void main(String args[])
	{
		int n,fact=1,i;
		Scanner object=new Scanner(System.in);
		System.out.println("Enter no to calculate factorial");
		n=object.nextInt();
		System.out.println("calculating factorial of" +n);
			for(i=1;i<=n;i++)
			{
				fact=fact*i;
			}
		System.out.println("factorial is"+fact);
	}
}