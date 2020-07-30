import java.util.*;
public class Stack {
    public static void main(String a[])
    {
        Scanner s=new Scanner(System.in);
         StackImpliment ob=new StackImpliment();
         System.out.println("enter the no of elements u wanna keep in stack");
         int n=s.nextInt();
        int item;
         for(int i=0;i<n;i++)
         {
            item=s.nextInt();
            ob.push(item);
         }
System.out.println();
            ob.show();
System.out.println();
         for(int i=0;i<n;i++)
         {
             ob.pop();
         }

    }
    
}
class StackImpliment{
    int top;
    int Max;
    int stack[];

    StackImpliment()
    {
        top=-1;
        Max=10;
        stack=new int[Max];
    }

    public void push(int item)
    {
        if(top>=Max)
        {
            System.out.println("Cannot be pushed ,, Stack overflowed");
        }
        else if(top<Max)
        {
            top++;
            stack[top]=item;
           // System.out.println(stack[top]);
        }
    }
    public void pop()
    {
       if(top<0)
       {
           System.out.println("Stack is empty ,, nothing to be popped");
       }
       else
       {
           int x=stack[top];
           System.out.println(x);
           top--;
       }
    }
  public void show()
    {
        for (int i=0;i<=top;i++)
        {
            System.out.println(stack[i]);
        }
    }

}