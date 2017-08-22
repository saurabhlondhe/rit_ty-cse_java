/*prg by saurabh londhe
 * THIS POINTER FOR FUNCTION
 * You may invoke the method of the current class by using the this keyword.
 * If you don't use the this keyword,
 * compiler automatically adds this keyword while invoking the method.
 * */

import java.util.*;

class this_class
{
	public void a()
	{
			System.out.println("function 'a' is called");
			
	}	
	
	public void b()
	{
			System.out.println("function 'b' is called");
			a();
			//using this pointer we called function a but in upper case compiler
			//defaultly taken this pointer for a so at both time
			// a();		&		this.a(); 	function will work
			this.a();
	}
	
	public static void main(String args[])
	{
			this_class ptr=new this_class();
			ptr.b();
	}
}

