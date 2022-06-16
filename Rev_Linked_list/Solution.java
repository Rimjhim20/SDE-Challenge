import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        // Write your code here!
         LinkedListNode temp = head;
         LinkedListNode prev = null;
         LinkedListNode next = null;
        while(temp != null){
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }
}