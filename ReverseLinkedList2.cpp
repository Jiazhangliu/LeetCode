/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class ReverseLinkedList2  {
public:
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
    
    ListNode *reverseBetween(ListNode *head, int m, int n) {
        if(head == NULL){ return NULL; }
        if(head->next == NULL) {return head;}
        if(m == n) {return head;}
        
        ListNode *ans = new ListNode(0);
        ans->next = head;
        
        int count = 1;
        ListNode *nn = ans;
        ListNode *left = head;
        while(count < m){
            nn = left;
            count++;
            left = left->next;
        }
        
        ListNode *right = left;
        while(count < n){
            right = right->next;
            count++;
        }
        
        nn->next = reverse(left, right, right->next);
        
        return ans->next;
    }
};
