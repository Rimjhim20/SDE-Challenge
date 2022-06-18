import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

        class Node
        {
        public:
	        int data;
	        Node *next;
	        Node(int data)
	        {
		        this->data = data;
		        this->next = NULL;
	        }
        };

*****************************************************************/

public class Solution {
	public static Node getListAfterReverseOperation(Node head, int n, int b[]) {
		// Write your code here.
        int i=0;

      Node curr=head;

      boolean isFirst=true;

     Node prevFirst=null;

      boolean flag=false;

      while(curr!=null){

          Node first=curr;

          Node prev=null;

          Node nextnode=null;

          int count=0;

          while(i<n&&b[i]==0){

              i++;

          }

          if(isFirst&&i>=n){

              return head;

          }

         while(curr != null && i<n && count < b[i]){

              nextnode=curr.next;

              curr.next=prev;

              prev=curr;

              curr=nextnode;

              if(curr!=null&&curr.data==-1){

                  flag=true;

                  break;

              }

              count++;

          }

          if(isFirst){

              head=prev;

              isFirst=false;

          }

          else{

              prevFirst.next=prev;

          }

         

         prevFirst=first;

          i++;

          if(flag||i>=n){

              prevFirst.next=curr;

              return head;

          }

      }

      return head;
	}
}