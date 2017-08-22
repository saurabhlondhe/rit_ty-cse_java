import java.util.Scanner;
class large_no
{
    public static void main(String args[])
    {
        int a,b,c,n;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter 3 no.s to find large no");
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();
        System.out.println("entered 3 no.s are\t"+a+"\t"+b+"\t"+c);
        
        if(a>b&&a>c)
        {
            System.out.println("a is greater no"+a);
        }
        else if(b>a&&b>c)
        {
            System.out.println("b is greater no"+b);
        }
        else if(c>a&&c>b)
        {
            System.out.println("c is greater no"+c);
        }       
    }
}
