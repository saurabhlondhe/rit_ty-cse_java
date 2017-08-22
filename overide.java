import java.util.*;

class overide
{
		public static void main(String args[])
		{
			a o=new a();
			a x=new b();
			o.show();
			x.show();
		}
}

class a
{
		void show()
		{
			System.out.println("class a get executed");
		}
}

class b extends a
{
		void show()
		{
			System.out.println("class b ge executed");
		}
}

