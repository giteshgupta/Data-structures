public class Main
{
	public static void main(String[] args) 
	{
		LinkedList l=new LinkedList();
		
	//	l.addFirst(21);         //21
		l.addLast(1);     
		l.addLast(2); 
		l.addLast(2); 
		l.addLast(1); //21 11
	/*	l.addFirst(12);         //12 21 11
		l.add(2,78);            //12 21 78 11
		l.add(4,83);            //12 21 78 11 83
		l.add(3,57);            //12 21 78 57 11 83
		l.display();
		
		/*l.swapAlt();            //21 12 57 78 83 11
		l.display();
		
		l.removeFirst();        //12 57 78 83 11
		l.removeLast();         //12 57 78 83
		l.remove(2);            //12 57 83
		l.display();
		
		l.swapAlt();            //57 12 83
		l.display();
		
		l.get(1);
		l.length();
		
		l.reverse();            //83 12 57
		l.display();
		l.sum();*/
		l.checkPalindrome();
	}
}
class Node 
{
    int data;
    Node next=null;
    public Node(int data)
    {
        this.data=data;
    }
}
class LinkedList
{
    Node head=null;
    int size=0;
    int sum=0;
    int length()
    {
        System.out.println("Length : "+size);
        return size;
    }
    void addFirst(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            newNode.next=head;
            head=newNode;
        }
        size++;
    }
    void addLast(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            Node traverse=head;
            while(traverse.next!=null)
            {
                traverse=traverse.next;
            }
            traverse.next=newNode;
        }
        size++;
    }
    void add(int index,int data)
    {
        Node newNode=new Node(data);
        if(index==0)
        {
            addFirst(data);
        }
        else if(index>size)
        {
            System.out.println("Index does not exists");
        }
        else
        {
            Node traverse=head;
            for(int i=0; i<index-1; i++)
            {
                traverse=traverse.next;
            }
            newNode.next=traverse.next;
            traverse.next=newNode;
            
            size++;
        }
    }
    void removeFirst()
    {
        if(head==null)
        {
            System.out.println("Linked List is already empty");
        }
        else if(size==1)
        {
            head=null;
            size--;
        }
        else
        {
            head=head.next;
            size--;
        }
    }
    void removeLast()
    {
        if(head==null)
        {
            System.out.println("Linked List is already empty");
        }
        else if(size==1)
        {
            head=null;
            size--;
        }
        else
        {
            Node traverse=head;
            while(traverse.next!=null)
            {
                if(traverse.next.next==null)
                {
                    traverse.next=null;
                    break;
                }
                traverse=traverse.next;
            }
            size--;
        }
    }
    void remove(int index)
    {
        if(index==0)
        {
            removeFirst();
        }
        else if(index==size-1)
        {
            removeLast();
        }
        else if(index>=size)
        {
            System.out.println("Index does not exists");
        }
        else
        {
            Node traverse=head;
            for(int i=0; i<index-1; i++)
            {
                traverse=traverse.next;
            }
            traverse.next=traverse.next.next;
            size--;
        }
    }
    int get(int index)
    {
        if(index>=size)
        {
            System.out.println("Index does not exists");
            return -1;
        }
        else
        {
            Node traverse=head;
            for(int i=0; i<index; i++)
            {
                traverse=traverse.next;
            }
           // System.out.println("Index "+index+" : "+traverse.data);
           return traverse.data;
        }
    }
    void reverse()
    {
        if(size==0)
        {
            System.out.println("No elements to reverse");
        }
        else if(size==1)
        {
            return;
        }
        else
        {
            Node current=head;
            Node next=head.next;
        
            current.next=null;
            while(next!=null)
            {
                Node temp=next;
                next=next.next;
            
                temp.next=current;
                current=temp;
                head=current;
            }
            System.out.println("• Linked List has been reversed •");
        }
    }
    void split()
    {
        if(size==0 || size==1)
        {
            System.out.println("Insufficient elements to split");
        }
        else
        {
            Node a,b,traverse=head;
            
        }
    }
    void swapAlt()
    {
        Node traverse=head;
        while(traverse!=null && traverse.next!=null)
        {
            int temp=traverse.data;
            traverse.data=traverse.next.data;
            traverse.next.data=temp;
            
            traverse=traverse.next.next;
        }
        System.out.println("• Elements has been swapped alternatively •");
    }
    void display()
    {
        sum=0;
        Node traverse=head;
        System.out.print("Elements : ");
        while(traverse!=null)
        {
            sum=sum+traverse.data;
            System.out.print(traverse.data+" ");
            traverse=traverse.next;
        }
        System.out.println();
    }
    void sum()
    {
        System.out.println("Sum of Elements : "+sum);
    }
    public void checkPalindrome()
    {
        Node h=head;
        Node h1=null;
        
        while(h!=null)
        {
            Node newnode=new Node(h.data); // creating new linked list.
            if(h1==null)
            {
                h1=newnode;
            }
            else
            {
                Node n=h1;
                while(n.next!=null)
                {
                    n=n.next;
                }
                n.next=newnode;
            }
            h=h.next;
            
        }
        Node head2=null;  // variables used for reversing.
        Node prev=null;
        
        h=head;
        int flag=1;
        
        while(h!=null)
        {
            Node next=h.next;
            h.next=prev;
            prev=h;
            h=next;
        }
        head2=prev;
        int i=0;
      while(head2!=null)
        {
            if(head2.data==h1.data )     //head2.data==copy.get(i)
            {
                flag=1;
            }
            else
            {
                flag=0;
                break;
            }
            h1=h1.next;
            head2=head2.next;
        }  
        
        
        System.out.println(flag);
        
        
        
        
    }
}
