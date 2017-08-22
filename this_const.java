/*prg by saurabh londhe
 * */

import java.util.*;
class this_const
{
		int roll_no;
		String name;
		public static void main(String args[])
		{
				this_const ptr=new this_const(1504036,"saurabh");
				ptr.display(143,"1st display");
				
		}
		
		this_const()
		{
				System.out.println("default constructor is called");
		}
		this_const(int roll_no,String name)
		{
				//after creating parametrized constructor the default constructor 
				//	doesn't work	to call the default constructor we use	"this" keyword.
				
				this();
				
				
				this.roll_no=roll_no;
				this.name=name;
				
		}
		
		
		
		void display(int roll_no,String name)
		{
				System.out.println("roll no is ="+roll_no);
				System.out.println("name is ="+name);
		}
		
		
}
