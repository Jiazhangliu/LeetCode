/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class swapPairs {
public:
    ListNode *swapPairs(ListNode *head) {
        if(!head) {return NULL;}
        if(!head->next) {return head;}
        
        ListNode *n = head->next;
        ListNode *node = n;
        
        ListNode *prev = head; 
        int i = 0;
        while (head->next && head && n){
            
            head->next = n->next;
            n->next = head;
            if(i != 0)
                prev->next = n;
            i = 1;
            prev = head;    
            head = head->next;
            
            if(head){
                n = head->next;
            }else{
                break;
            }
            
        }
        
        return node;
    }
};
