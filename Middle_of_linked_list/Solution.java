import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

       class Node 
        { 
        public:
            int data;
            Node next;
            Node(int data) 
            {
              this.data = data;
              this.next = null;
            }
        };

*****************************************************************/

public class Solution {
   public static Node getMiddle(Node head)
    {
        // Write your code here
          if(head==null || head.next == null){
       return head;
   }
   //2 nodes
   if(head.next.next == null){
       return head.next;
   }
  
   Node slow = head;
   Node fast = head.next;
   while(fast!=null){
       fast = fast.next;
       if(fast!=null){
           fast = fast.next;
       }
       slow = slow.next;

   }
   return slow; 
}
   public static Node findMiddle(Node head)  
   {
       return getMiddle(head);
    }
}

