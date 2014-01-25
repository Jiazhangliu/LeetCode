/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class ReorderList {
public:
    void reorderList(ListNode *head) {
        if(!head){ return; }
        if(!head->next) {return;}
        
        ListNode *p=head; 
        ListNode *q=head; 
         
        //find the midddle pointer p
        while (q->next && q->next->next){
            p=p->next;
            q=q->next->next;
        }
        
        //reverse p->next to end
        q = p->next;
        ListNode *n = head;
        while(n->next != NULL){
            n = n->next;
        }
        p->next = reverse(q,n,NULL);
        
         //reorder
        q = head;
        while (p!=q && p->next){
            ListNode* tmp = q->next;
            q->next = p->next;
            p->next = p->next->next;
            q->next->next = tmp;
            q=q->next->next;
        }
        return;
    }
    
    /*1 2 3 4 5 6 11 10 9 8 7
      q         p   
    
    1 11 2 3 4 5 6 10 8 7*/
    
    
    //1 2 3 4 5 6 null
    
    ListNode *reverse(ListNode *left, ListNode *right, ListNode *tail){
        if(left == right){ return left; }
        
        ListNode *node = left->next;
        left->next = tail;
        
        while(node != right){
            ListNode *temp = node;
            node = node->next;
            temp->next = left;
            left = temp;
        }
        
        node->next = left;
        
        return node;
    }
};
