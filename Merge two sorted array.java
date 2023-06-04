class Solution {
public:
    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
        ListNode* temp_node = new ListNode(0);
        ListNode* cur_node = temp_node;
        
        while (l1 != nullptr && l2 != nullptr) {
            if (l1->val < l2->val) {
                cur_node->next = l1;
                l1 = l1->next;
            } else {
                cur_node->next = l2;
                l2 = l2->next;
            }
            cur_node = cur_node->next;
        }
        
        if (l1 != nullptr) {
            cur_node->next = l1;
        }
        
        if (l2 != nullptr) {
            cur_node->next = l2;
        }
        
        return temp_node->next;
    }
};
