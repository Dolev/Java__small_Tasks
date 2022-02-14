
class Solution {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode fake = new ListNode(0);
        ListNode p = fake;

        ListNode i = l1;
        ListNode j = l2;
        
        int carry = 0;

        while(i != null&&j != null){
            int sum = carry;
            sum+=i.val+j.val;
            System.out.println("sum:"+sum);
            if(sum>9){
                 carry=1;
                 ListNode l = new ListNode(sum%10); 
                 p.next = l; 
            }
            else{
                ListNode l = new ListNode(sum);
                p.next = l;
                carry =0;
            }
            
            p = p.next;
            i=i.next;
            j=j.next;
        }
        if(carry > 0){
        ListNode l = new ListNode(carry);
        p.next = l;
        }
        return fake.next;
    }
}