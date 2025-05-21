/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {

    struct ListNode * head = NULL;


    struct ListNode * temp = NULL;

    while(list1 != NULL && list2 != NULL)
    {
        if(list1->val < list2->val)
        {
            if(head == NULL)
            {
                head = list1;
                temp = head;
                  list1 = list1->next;
                continue;
            }
            temp->next = list1;
            temp = temp->next;
            list1 = list1->next;
        }
        else
        {
            if(head == NULL)
            {
                head = list2;
                temp = head;
                  list2 = list2->next;
                continue;
            }
            temp->next = list2;
            temp = temp->next;
            list2 = list2->next;
        }
    }

    while(list1 != NULL)
    {
         if(head == NULL)
            {
                head = list1;
                temp = head;
                 list1 = list1->next;
                continue;
            }
         temp->next = list1;
          temp = temp->next;
            list1 = list1->next;
    }

    while(list2 != NULL)
    {
         if(head == NULL)
            {
                head = list2;
                temp = head;
            list2 = list2->next;

                continue;
            }
            temp->next = list2;
            temp = temp->next;
            list2 = list2->next;
    }

    return head;
    
    
}