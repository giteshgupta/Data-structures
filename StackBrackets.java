
import java.util.Scanner;

public class StackBrackets {
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
         StackImpliment ob=new StackImpliment();
         System.out.println("enter the String");

         String str=sc.next();
         System.out.println(ob.isBalanced(str));
}
}
class StackImpliment{
    int top;
    int Max;
    char stack[];

    StackImpliment()
    {
        top=-1;
        Max=20;
        stack=new char[Max];
    }
    boolean isBalanced(String str)
    {
        System.out.println(str); 
        for(int i=0;i<str.length();i++)
          {
              if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='[' )
              {
                  push(str.charAt(i));
              }
              
              else
              {
                  if(isEmpty()==true)
                  {
                      return false;
                  }
                  else if(matching(str.charAt(i),stack[top])==false)
                  {
                      return false;
                  }
                  else
                  {
                      pop();
                  }
              }
          }
          return (isEmpty());
    }
    boolean matching(char a, char b)

    { 
        System.out.println(a+" "+b);
        if((a==')' && b=='(')|| (a==']' && b=='[') || (a=='}' && b=='{'))
        return true;
        else
        return  false;
    }

    boolean isEmpty() 
    { 
{
	if(top <=-1)
	{
		return true;
	}
	else
	{
		return false;
	}
}
    } 

    public void push(char item)
    {
        if(top>Max)
        {
            System.out.println("Cannot be pushed ,, Stack overflowed");
        }
        else if(top<=Max)
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
         //  System.out.print(x);
           top--;
       }
    }
  public void show()
    {
        for (int i=0;i<=top;i++)
        {
            System.out.print(stack[i]);
        }
    }

}