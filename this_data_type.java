/*prg by saurabh londhe
 * using this pointer/keyword for initialized data
 * to remove ambiguity
*/
import java.util.*;
class this_data_type
{
		int roll_no;
		String name;
		public static void main(String args[])
		{
			this_data_type ptr=new this_data_type(10,"saurabh");
			ptr.display();

		}

			void display()
			{
					System.out.println("roll no is="+roll_no);
					System.out.println("name is="+name);
			}
			
			this_data_type(int roll_no, String name)
			{
				//without "this" it will print null values
				this.roll_no=roll_no;
				this.name=name;
				
			}
			

}
