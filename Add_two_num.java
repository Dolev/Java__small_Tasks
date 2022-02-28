 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode fakeHead = new ListNode(0);
        ListNode LN = fakeHead;
        ListNode i = l1;
        ListNode j = l2;
        int carry = 0;

        while(i != null || j != null){
        int x = (i != null) ? i.val : 0;
        int y = (j != null) ? j.val : 0;
        int sum = carry+x+y;
            carry= sum/10;
            LN.next = new ListNode(sum % 10);
            LN = LN.next;
            if (i != null) i = i.next;
            if (j != null) j = j.next;
        }
        if (carry > 0) {
          LN.next = new ListNode(carry);
        }
        return fakeHead.next;
    }
