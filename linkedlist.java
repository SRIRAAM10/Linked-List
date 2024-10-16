      import java.util.Scanner;
class Node
{
    int data;
    Node next;
    
}
class LinkedList
{
    Node head;
    Scanner scan=new Scanner(System.in);
    public void insert()
    {
        int x;
        System.out.println("Enter Elements to Be inserted: ");
        x=scan.nextInt();
        Node node=new Node();
        node.data=x;
        node.next=null;
        
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
    public void insertAtStart()
    {
        int x;
        
        System.out.println("Enter Element : ");
        x=scan.nextInt();
        
        Node node=new Node();
        node.data=x;
        node.next=null;
        node.next=head;
        head=node;
        
    
  
}
   public void insertAtpos()
   {
       Node node=new Node();
        int x;
        int pos;
        System.out.println("Enter Element and position: ");
        x=scan.nextInt();
        pos=scan.nextInt();
        node.data=x;
        node.next=null;
        Node n=head;
        
        for(int i=0;i<pos;i++)
        {
            n=n.next;
        }
        if(pos==0)
        {
            insertAtStart();
        }
        
       
   }
   public void show()
   {
       Node node=head;
       if(head==null)
       {
           System.out.println("List Is empty");
       }
       else{
       while(node!=null)
       {
           System.out.println(node.data);
           node=node.next;
       }
       }
       
   }
   public void DeleteAt()
   {
       int index;
       System.out.print("Enter Index: ");
       index=scan.nextInt();
      
       if(index==0)
       {
           head=head.next;
       }
       else{
           Node n=head;
           Node n1=null;
       for(int i=0;i<index-1;i++)
       {
           n=n.next;
           
           
       }
       n1=n.next;
       n.next=n1.next;
       n1=null;
       }
   }
}
public class Main
{
    public static void main(String args[])
    {
        LinkedList list=new LinkedList();
        Scanner van=new Scanner(System.in);
          int choice;
        System.out.println("Enter Choice: ");
       
        
        
        do
        {
             choice=van.nextInt();
             switch(choice)
             {
                 case 1:
                     list.insert();
                     break;
                 case 2:
                     list.insertAtStart();
                       break;
                case 3:
                    list.insertAtpos();
                      break;
                case 4:
                    list.show();
                      break;
                case 5:
                    
                    break;
                case 6:
                    list.DeleteAt();
             }
             } while(choice!=5);
         
      
       
        }
    }

