import java.util.*;
class final_method
{
		public static void main(String args[])
		{
				final_method ptr=new final_method();
				ptr.show();
		}
		
		final void show()
		{
			System.out.println("final function executed");
		}
		
/***********************************************************************
		 * void show()
		{
            System.out.println("another show function get executed");
		}
*************************************************************************/ 
}
