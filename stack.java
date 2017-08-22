import java.util.*;
class stack
{
int[] s;
int top;
    
   public void push(int x)
    {
        
       // System.out.println("Enter no to push in the stack=");
        if(top==9)
        {
            System.out.println("Stack is full");
        }
        else
        {
            top=top+1;
            s[top]=x;
        }
    }
    
   public void pop()
    {
        if(top==-1)
        {
        System.out.println("Stack is empty");
        }
        else
        {
            top=top-1;
        }
    }
    
   public void display()
    {
        int i;
        if(top==-1)
        {
            System.out.println("stack is empty");
            
        }
        else
        {
            for(i=0;i<=top;i++)
            {
                System.out.println(s[i]+"");
			}
		}
    
    
	}

public static void main(String args[])
    {
        stack obj=new stack ();
        int x,ch,c;
        obj.top=-1;
        obj.s=new int[10];
        Scanner ob=new Scanner(System.in);
        
 do{
        System.out.println("Enter your choice \n1)push\n2)pop\n3)display\n");
        ch=ob.nextInt();
     
        switch(ch)
        {
            case 1: System.out.println("Enter no to enter in stack=");
                    x=ob.nextInt();
                    obj.push(x);
                    break;
                    
            case 2: obj.pop();
                    break;
                    
            case 3: obj.display();
                    break;
                    
            default: System.out.println("Enter correct choice");
        }
			System.out.println("\n Do you want conti. ");
			//fflush(stdin);
		//	scanf("%c",&ch);
		c=ob.nextInt();
		}while(c==1);
    }



}
