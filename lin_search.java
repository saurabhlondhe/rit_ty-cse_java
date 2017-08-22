import java.util.*;
class lin_search
{
   public static void main(String args[])
   {
       
         seach obj=new seach();
        obj.clas();
	}
}

class seach
{
    public void clas()
    {
	 int[] a=new int[10];
        int i,n,x;
        System.out.println("Enter 10 array element");
        Scanner scanf=new Scanner(System.in);
        for(i=0;i<10;i++)
        {
            a[i]=scanf.nextInt();
        }
        System.out.println("Enter no to search in the array");
        n=scanf.nextInt();
        
        for(i=0;i<10;i++)
        {
				if(a[i]==n)
				{
						x=i+1;
						System.out.println("\tno\t"+n+"\tfound at position\t"+x);
					//	break;
				}
			
		}
    }
}
