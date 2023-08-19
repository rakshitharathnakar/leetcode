
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null)   return true;
        List<Integer>l=new ArrayList<>();
        while(head!=null)
        {
            l.add(head.val);
            head=head.next;
        }
        int s=0,e=l.size()-1;
        while(s<e){
            if(l.get(s)!=l.get(e))
                return false;
            s++;
            e--;
        }
        return true;
    }
}
