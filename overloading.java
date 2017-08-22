import java.util.*;

class overloading
{
	public static void main(String args[])
	{
	
		Scanner sc=new Scanner(System.in);
		overloading x=new overloading();
			  int p,q;
			  float c,r,s;
			  System.out.println("Enter 1 side p=");
			  p=sc.nextInt();
			  System.out.println("Enter 2 side q=");
			  q=sc.nextInt();
			  System.out.println("Enter radius/height r=");
			  r=sc.nextFloat();
			  System.out.println("Enter base=");
			  s=sc.nextFloat();
			if(q==0&&r==0&&s==0)
			{
			  x.area(p);
			}
			else if(p==0&&q==0&&s==0)
			{
			x.area(r);
			}
			else if(r==0&&s==0)
			{
			  x.area(p,q);
			}
			else if(p==0&&q==0)
			{
			  x.area(r,s);
			}
			else
			{
			x.area(p);
			x.area(r);
			x.area(p,q);
			x.area(r,s);
			}
		}

			



		void area(int p)
		{
			int c;
			  c=p*p;
			 // System.out.println("\033[H\033[2J");
			  System.out.println("Area of square is:\n"+c);
		}
		void area(float r)
		{
			double c,pi=3.14;
			c=(r)*(r)*pi;
			  System.out.println("Area of circle is:\n"+c);
		}
		void area(int p,int q)
		{
			float c;
			c=p*q;
			  System.out.println("Area of rectangle is:\n"+c);
		}
		void area(float r,float s)
		{
			double c;//,h=0.5;
			c=r*s*0.5;
			  System.out.println("Area of triangle is :\n"+c);
		}


	
}
