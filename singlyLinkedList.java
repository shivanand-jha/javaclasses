
import java.util.Scanner;
class node
{
    int rollNo;
    node next;
}
public class singlyLinkedList {
   node start;
   singlyLinkedList()
   {
       start =null;
   }
    public static void main(String[] args)
      {
       singlyLinkedList obj = new singlyLinkedList();
       Scanner sc = new Scanner(System.in);
       while(true)
       {
            System.out.println("press 1 for insert");
            System.out.println("press 2 for delete");
            System.out.println("press 3 for traverse");
            System.out.println("press 4 for exit");
            System.out.println("enter your choice");
            
            int choice = sc.nextInt();
            
            switch (choice)
           {
               case 1:
                   obj.insert();
                 break;
               case 2:
                   obj.delete();
                   break;
               case 3:
                   obj.traverse();
                   break;
               case 4:System.exit(0);
               default : System.out.println("Wrong Choice");
           }
       }
       }
   
   void insert()
   {
//       System.out.println("insert fun is working");
       System.out.println(" Enter your roll number");
      Scanner sc = new Scanner(System.in);
       int data = sc.nextInt();
       node nn = new node();
       nn.rollNo= data;
       nn.next=null;
       if(start ==null)
       {
           start=nn;
       }
       else
       {
           node current=start;
           while(current.next!=null)
           {
               current = current.next;
           }
           current.next=nn;
       }
   }
   void delete()
   {
       System.out.println("delete fun is working");
   }
   void traverse()
   {
       System.out.println("treverse fun is working");
       if(start==null)
       {
           System.out.println("List Empty");
       }
       else
       {
           System.out.println("---list element ----");
           node current;
           for(current=start; current!=null; current=current.next)
           {
               System.out.println(" "+current.rollNo);
           }
       }
   }
 
}
