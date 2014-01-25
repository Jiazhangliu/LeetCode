/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode nd = head;
        ListNode head1 = head;
        if(head == null){
            return null;
        }else if(head.next == null){
            return null;
        }
        
        int number = 1;
        while(head.next != null){
            number++;
            head = head.next;
        }
        if(number == n){
            return nd.next;
        }
        
        int i = 1;
        while(i < number-n){
            head1 = head1.next;
            i++;
        }

        
        ListNode node = head1;
        head1 = head1.next.next;
        node.next = head1;
        
        return nd;
    }
}
