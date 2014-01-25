/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class RemoveDuplicatesfromSortedList {
public:
    ListNode *deleteDuplicates(ListNode *head) {
        if(head == NULL){
            return NULL;
        }else if(head->next == NULL){
            return head;
        }
        
        ListNode *n = head;
        
        while(head->next != NULL){
            if(head->next->val == head->val){
                head->next = head->next->next;
                //n = head;
            }else{
                head = head->next;
            }
        }
        
        return n;
    }
};
