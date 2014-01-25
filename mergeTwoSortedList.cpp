/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class mergeTwoSortedList {
public:
    ListNode *mergeTwoLists(ListNode *l1, ListNode *l2) {
        ListNode * head = new ListNode(0);
        ListNode * n = head;
        
        if(l1 == NULL){return l2;}
        if(l2 == NULL){return l1;}
        
        while(l1 != NULL && l2 != NULL){
            if(l1->val <= l2->val){
                n->next = l1;
                l1 = l1->next;
            }else{
                n->next = l2;
                l2 = l2->next;
            }
            n = n->next;
        }
        
        if(l1 == NULL){
            n->next = l2;
        }
        if(l2 == NULL){
            n->next = l1;
        }
        
        return head->next;
    }
};
