import java.util.*;
public class Main{
    
  Node head;
  int count;
  int sum=0;
 
  class Node
{
    int data;
    Node next;
     
    Node(int data)
    {
        this.data=data;
        next=null;
    }
    
}
    
 
    
    public void insertStart(int data)
    {
        Node node=new Node(data);
        node.next=head;
        head=node;
    }
    
    public void insertAtIndex(int index,int data)
    {
        if(index==0)
        {
            insertStart(data);
        }
        else
        {
            count=1;
            Node t=head;
            while(t.next!=null)
            {
                count++;
                t=t.next;
                
            }
            if( index<=count)
            {
              Node node=new Node(data);
            Node temp=head;
            for(int i=0;i<index-1;i++)
            {
                temp=temp.next;
            }
            node.next=temp.next;
            temp.next=node;
            }
            else
            {
                System.out.println("index value exceeded. Cannot be inserted");
            }
        }
    }
    
    public void deleteAt(int index)
    {
        if(head!=null)
        {
        if(index==0)
        {
            head=head.next;
            count--;
        }
        else
        {
            Node n1=null;
            Node temp=head;
            
            for(int i=0;i<index-1;i++)
            {
                temp=temp.next;
            }
            n1=temp.next;
            temp.next=n1.next;
            System.out.println("deleted item is "+n1.data);
            count--;
        }
        }
        else
        {
             System.out.println("Linked list is already empty");
        }
    }
    
    public void reverse()
    {
        Node curr=head;
        Node prev=null;
        
        while(curr!=null)
        {
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    
    
    public void separate()
    {
        Node even_h=null;
        Node even_t=null;
        Node odd_h=null;
        Node odd_t=null;
        
        Node curr=head;
        
        while(curr!=null)
        {
            int x=curr.data;
            if(x%2==0)
            {
                if(even_h==null)
                {
                    even_h=curr;
                    even_t=even_h;
                }
                else
                {
                    even_t.next=curr;
                    even_t=even_t.next;
                }
            }
            else if(x%2==1)
            {
               if(odd_h==null)
               {
                   odd_h=curr;
                   odd_t=odd_h;
               }
               else
               {
                   odd_t.next=curr;
                   odd_t=odd_t.next;
               }
            }
            
            curr=curr.next;
        }
        
        if(odd_h==null || even_h==null)
        {
            return;
        }
        
   //    even_t.next=odd_h;
   //    odd_t.next=null;
        
        Node temp2=even_h;
        
         System.out.println("the Linked List with even elements");
        
         while(temp2!=even_t.next)
        {
            System.out.println(temp2.data);
            temp2=temp2.next;
        }
        
        
       Node temp1=odd_h;
        
        
        System.out.println("the Linked List with odd elements");
        
        while(temp1!=odd_t.next)
        {
            System.out.println(temp1.data);
            temp1=temp1.next;
        }
        
        
        System.exit(0);
        
       
    }
    
    
    public void sumE()
    {
        Node temp1=head;
        while(temp1!=null)
        {
            sum+=temp1.data;
            temp1=temp1.next;
        }
        System.out.println("sum is"+sum);
    }
    
    public void insert(int data)
    {
        Node node=new Node(data);
        if(head==null)
        {
            head=node;
        }
        else
        {
            Node n=head;
            while(n.next!=null)
            {
                n=n.next;
            }
            n.next=node;
        }
        
    }
     

    public  void show()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    
    
    
     public static void main(String []args){
      
      Main ob=new Main();
      Scanner s1=new Scanner(System.in);
   //   System.out.println("enter the length of list u want to keep");
      ob.insert(1); 
      
      ob.insert(2);
      ob.insert(1); 
        
      ob.separate();
      ob.show();