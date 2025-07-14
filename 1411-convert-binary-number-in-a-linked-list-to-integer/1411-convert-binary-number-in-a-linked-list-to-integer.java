/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
          ListNode temp=head;
        int n=0;
        while(temp!=null){
            temp=temp.next;
            n++;
        }
        double data=0;
        int sum=0;
        temp=head;
        while(temp!=null){
            data=temp.val;
            data=data*(Math.pow(2,n-1));
            sum+=data;
            n--;
            temp=temp.next;
        }
        return sum;
    
    }
}