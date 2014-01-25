/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class RotateList {
public:
    ListNode *rotateRight(ListNode *head, int k) {
        if(!head) {return NULL;}
        if(!head->next) {return head;}
        if(k == 0) {return head;}
        
        ListNode *tail = head;
        int count = 1;
        while(tail->next != NULL){
            count++;
            tail = tail->next;
        }
        
        if(k % count == 0) { return head; }
        if(k > count) { k = k % count; }
        
        tail->next = head;
        
        ListNode *mid = head;
        int c = 1;
        while(c < count - k){
            c++;
            mid = mid->next;
        }
        head = mid->next; 
        mid->next = NULL;
        
        return head;
    }
};
