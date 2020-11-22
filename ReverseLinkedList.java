//Definition for the singly LinkList
class ListNode{
    int val;
    ListNode next;

    ListNode(int x){
        val = x;
    }
}


class SolutionReverseLinkedList{
    public ListNode reverseList(ListNode head){
        ListNode prev = null;

        while (head!=null)
        {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}


public class ReverseLinkedList {
    public static void main(String[] args) {

    }
}
