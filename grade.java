import java.util.*;

class grade
{
		public static void main(String args[])
		{
		student obj=new student();
		obj.mark();
		}	
}

class student
{
		void mark()
		{
				int no;
				System.out.println("Enter your marks in %");
				Scanner scanf=new Scanner(System.in);
				no=scanf.nextInt();
				if(75>=no&&no>=60)
				{
						System.out.println("Second class");
					
				}
				else if(90>no&&no>75)
				{
						System.out.println("First class");
				}
				else if(100>no&&no>=90)
				{
						System.out.println("First class with Distinction");
				}
				else
				{
						System.out.println("fail");
				}
		}
}
