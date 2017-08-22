import java.util.*;
class sum_avg
{
		public static void main(String args[])
		{
				int[] a=new int[5];int i,c,sum=0;
				System.out.println("Enter 5 no.s to calculate sum and average=\n");
				Scanner obj=new Scanner(System.in);
				for(i=0;i<5;i++)
				{
						c=obj.nextInt();
						a[i]=c;
						//System.out.println(""+a[i]);
						sum=sum+a[i];
				}
				/*for(i=0;i<5;i++)
				{
						System.out.println(a[i]+"");
						//sum=sum+a[i];
				}*/
				System.out.println("sum is ="+sum);
				System.out.println("avg is ="+sum/5);
		}
}
