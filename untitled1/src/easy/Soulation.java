package easy;

import java.util.ArrayList;
import java.util.Stack;


public class Soulation {
    public int[] reversePrint(ListNode head) {
        Stack<ListNode> listNodes = new Stack<>();
        ListNode temp = head;
        while (temp!=null) {
            listNodes.push(temp);
            temp = temp.next;
        }
        int size = listNodes.size();
        int[] ints = new int[size];
        for (int i = 0; i < size; i++) {
            ints[i] = listNodes.pop().val;
        }
        return ints;
    }

}

 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
