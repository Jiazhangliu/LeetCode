/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class LinkedListCycle {
public:
    bool hasCycle(ListNode *head) {
        if(head == NULL) {return false;}
        if(head->next == NULL) {return (head->next == head);}
        
        ListNode *slow = head, *fast = head;
        while (slow != NULL && fast!= NULL && fast->next!= NULL) {
            slow = slow->next;
            fast = fast->next->next;
            if (slow == fast)
                return true;
            }
        return false;
    }
};
