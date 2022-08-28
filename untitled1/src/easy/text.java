package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;



public class text {

    public static void main(String[] args) {
        int[] a = {1,4,1,6};
        FindNumsAppearOnce(a);

    }

    //maopao 冒泡,通过对 待排序序列 从前向后（从较小的元素开始），依次比较相邻元素的值，若发现逆序就交 换，使 值较大的元素逐渐从前移向后部
    private void bubbleSort(int[] arry) {
        int temp = 0;
        boolean flag = false;
        for (int i = 0; i < arry.length - 1; i++) {
            for (int j = 0; j < arry.length - 1 - i; j++) {
                if (arry[j] > arry[i]) {
                    flag = true;
                    temp = arry[i];
                    arry[i] = arry[j];
                    arry[j] = temp;
                }
                if (flag == false) {
                    break;
                } else {
                    flag = false;
                }
            }
        }
    }
    //xuanzepaixu 选择排序

    /**
     * 选择排序基本思想是：第一次从  arry[0]--array[n-1]中选取最小值，与arry[0]进行交换，
     * 第二次从arry[1]--array[n-1]中选取最小值，与 arry[1]进行交换，依次类推，总共进行n-1次排序，得到一个编码顺序从小到大排序的有序序 列。
     *
     * @param arry
     */
    private void SelcetSort(int[] arry) {
        int MinIndex = 0;
        int MinValue = 0;
        for (int i = 0; i < arry.length - 1; i++) {
            MinIndex = i;//假设最小值为第一个
            MinValue = arry[i];
            for (int j = i + 1; j < arry.length; j++) {
                if (arry[j] > MinValue) {
                    MinValue = arry[j];
                    MinIndex = j;
                }
            }
            if (MinIndex != i) {
                arry[i] = MinValue;
                arry[MinIndex] = arry[i];
            }
        }
    }


    //chongfudeshuzi 重复的数字

    /**
     * 既然数组长度为nnn只包含了0到n−1的数字，那么如果数字没有重复，这些数字排序后将会与其下标一一对应。
     * 那我们就可以考虑遍历数组，每次检查数字与下标是不是一致的，一致的说明它在属于它的位置上，
     * 不一致我们就将其交换到该数字作为下标的位置上，如果交换过程中，那个位置已经出现了等于它下标的数字，那肯定就重复了。
     *
     * @param numbers
     * @return
     */
    private int duplication(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == i) {
                continue;
            } else {
                if (numbers[i] == numbers[numbers[i]]) {
                    return numbers[i];
                } else {
                    swap(numbers, i, numbers[i]);
                }
            }
        }
        return -1;
    }


    private void swap(int[] numbers, int a, int b) {
        int temp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = temp;
    }


    //从尾到头打印链表

    /**
     * 输入一个链表的头节点，按链表从尾到头的顺序返回每个节点的值（用数组返回）
     */
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }

    //反转链表

    /**
     * 给定一个单链表的头节点pHead(该头节点是有值的)，长度为n,反转该链表后，返回新链表的表头
     */
    public ListNode ReverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            //当前节点的下一个节点
            ListNode cur_next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = cur_next;
        }
        return pre;
    }

    //合并两个排序的链表

    /**
     * 输入两个递增的链表，单个链表长度为n,合并这两个链表并使其新链表的节点仍然是递增的。
     */
    public ListNode Merge(ListNode list1, ListNode list2) {
        //哨兵节点
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                dummy.next = list2;
                list2 = list2.next;
                dummy = dummy.next;
            } else {
                dummy.next = list1;
                list1 = list1.next;
                dummy = dummy.next;
            }
        }

        if (list1 == null) {
            dummy.next = list2;
        }

        if (list2 == null) {
            dummy.next = list1;
        }

        return head.next;
    }


    //两个链表的第一个公共节点

    /**
     * 输入两个无环的单向链表，找出他们第一个公共节点，没有就返回空
     */
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode l1 = pHead1;
        ListNode l2 = pHead2;
        while (l1 != l2) {
            l1 = (l1 == null) ? pHead2 : l1.next;
            l2 = (l2 == null) ? pHead1 : l2.next;
        }
        return l1;
    }

    //链表中环的入口节点

    /**
     * 给一个长度为n的链表，若其中包括环，请找出该链表的环的入口节点
     */
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null) return null;
        ListNode fast = pHead, slow = pHead;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) break;
        }

        if (fast == null || fast.next == null) return null;
        fast = pHead;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }


    //链表中倒数第K个节点

    /**
     * 倒数的 + 顺数的长度等于链表总长度 所以可以设置两个指针，一个先走K步，剩下的到链表尾部要走的步数就是倒数第K个节点，需要从头开始走
     *
     * @param pHead
     * @param k
     * @return
     */
    public ListNode FindKthToTail(ListNode pHead, int k) {
        ListNode first = pHead;
        for (int i = 0; i < k; i++) {
            if (first == null) return first;
            first = first.next;
        }
        ListNode last = pHead;
        while (first != null) {
            first = first.next;
            last = last.next;
        }
        return last;
    }

    //删除链表中重复的节点

    /**
     * 在一个排序链表中，存在重复的节点，请删除链表中重复的节点，返回链表的头节点。123344555   --  12
     */
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null) return null;
        ListNode dummy = new ListNode(-1);
        dummy.next = pHead;
        ListNode cur = dummy;
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) {
                int temp = cur.next.val;
                while (cur.next != null && cur.next.val == temp) {
                    cur.next = cur.next.next;
                }
            } else {
                cur = cur.next;
            }
        }
        return dummy.next;
    }

    //删除链表的中间节点
    public  ListNode deleteMiddle(ListNode head) {
        if (head.next == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
            if (fast != null) {
                fast = fast.next;
            }
        }
        ListNode cur = head;
        while (cur.next != slow) {
            cur = cur.next;
        }
        cur.next = slow.next;
        return head;
    }

    /**
     * 给定一个链表的头节点和要删除的一个节点的值，输出删除后的链表
     */
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) return null;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = dummy;
        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
                break;
            }
            cur = cur.next;
        }
        return dummy.next;
    }

    //删除中间节点


    //复制链表
    public RandomListNode clone(RandomListNode pHead) {
        if (pHead == null) return pHead;
        RandomListNode cur = pHead;
        //将新节点拷贝过去，放在原链表的后面
        while (cur != null) {
            RandomListNode tmp = new RandomListNode(cur.label);
            tmp.next = cur.next;
            cur.next = tmp;
            cur = tmp.next;
        }

        cur = pHead;
        RandomListNode clone = pHead.next, ret = pHead.next;
        while (cur != null) {
            //复制随机节点
            if (cur.random == null) {
                clone.random = null;
            } else {
                clone.random = cur.random.next;//这里要理解 因为我们往里面插入了新链表
            }
            cur = cur.next.next;
            if (clone.next != null)
                clone = clone.next.next;
        }

        cur = pHead;
        clone = pHead.next;
        while (cur != null) {
            cur.next = cur.next.next;
            cur = cur.next;
            if (clone.next != null)
                clone.next = clone.next.next;
            clone = clone.next;
        }
        return ret;
    }


    //数组中重复的数字

    public int duplication1(int[] numbers) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])) {
                return numbers[i];
            } else {
                map.put(numbers[i], i);
            }
        }
        return -1;
    }

    //数组中重复的数字

    public int duplicate(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == i) {
                continue;
            } else {
                if (numbers[i] == numbers[numbers[i]]) {
                    return numbers[i];
                } else {
                    swa(numbers, i, numbers[i]);
                }
            }
        }
        return -1;
    }

    private void swa(int[] numbers, int a, int b) {
        int temp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = temp;
    }


    //用两个栈实现队列
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        //将第一个栈的内容放入到第二个栈中
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        int res = stack2.pop();
        //再将栈2中的元素存到栈1，这样就保持了原来栈1的顺序不变，但是取出来了队首的元素。
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return res;
    }

    //实现min函数的栈。

    /**
     * 定义栈的数据结构，请在该类型中，定义一个能够得到栈中所含最小元素的min函数，输入时保证pop、top、min操作时，是有值的
     *
     * @param node
     */
    public void push1(int node) {
        stack1.push(node);
        if (stack2.isEmpty() || stack2.peek() > node) {
            stack2.push(node);
        } else {
            stack2.push(stack2.peek());
        }
    }

    public void pop1() {
        stack1.pop();
        stack2.pop();
    }


    public int top() {
        return stack1.peek();

    }

    public int min() {
        return stack2.peek();
    }


    //栈的压入、弹出序列
    //新建一个栈，将数组A，压入栈，当栈顶的元素等于数组B的元素，就出栈，当循环结束，判断栈是否为空，空就为true
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if (pushA.length == 0 || popA.length == 0 || pushA.length != popA.length) {
            return false;
        }
        int j = 0;
        for (int i = 0; i < pushA.length; i++) {
            stack1.push(pushA[i]);
            while (!stack1.isEmpty() && stack1.peek() == popA[j]) {
                stack1.pop();
                j++;
            }
        }
        return stack1.isEmpty();

    }


    //反转单词序列
    public String ReverseSentence(String str) {
        Stack<String> s = new Stack<>();
        String[] temp = str.split(" ");
        for (int i = 0; i < temp.length; i++) {
            s.push(temp[i]);
            s.push(" ");
        }
        StringBuilder sb = new StringBuilder();
        if (!s.isEmpty()) {
            s.pop();
        }
        while (!s.isEmpty()) {
            sb.append(s.pop());
        }
        return sb.toString();

    }

    //数组逆序对
    //排序
    int count = 0;
    public int InversePairs(int [] array) {
        //长度小于2无法逆序
        if (array.length < 2) return 0;
        mergeSort(array, 0, array.length-1);
        return count;
    }

    private void mergeSort(int[] array, int left, int right) {
        //找分割点
        int mid = (right - left)/2 + left;
        if (left < right) {
            //左子数组
            mergeSort(array, left, mid);
            //右子数组
            mergeSort(array, mid + 1, right);
            //合并
            merge(array, left, mid, right);
        }
    }

    private void merge(int[] array, int left, int mid, int right) {
        //创建临时数组，长度为此时两个子数组加起来的长度
        int[] arr = new int[right - left + 1];
        // 临时数组的下标起点
        int c = 0;
        //保存原数组的起点下标值
        int s = left;
        // 左子数组的起始指针
        int l = left;
        //右子数组的起始指针
        int r = mid + 1;
        while (l <= mid && r <= right) {
            // 左数组元素小，无逆序对
            if (array[l] <= arr[r]) {
                //放入临时数组
                arr[c] = array[l];
                c++;
                l++;
            } else {//存在逆序对
                arr[c] = array[r];
                count += mid + 1 -l;
                count %= 1000007;
                c++;
                r++;
            }
        }

        while (l <= mid) {
            arr[c++] = array[l++];
        }
        while (r <= right) {
            arr[c++] = array[r++];
        }
        //将临时数组中的元素放入到原始数字的指定位置
        for(int num: arr) {
            array[s++] = num;
        }
    }

    //最小的K的个数
    //排序
    public ArrayList<Integer> GetLeastNumber_Solution(int [] input, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        if (k <= 0 || k > input.length) return result;

        for (int i = 1; i < input.length; i++) {
            if (input[i] > input[i-1]) {
                int j = i -1;
                while (j >= 0) {
                    if (input[j] > input[j+1]) {
                        int temp = input[j+1];
                        input[j+1] = input[j];
                        input[j] = temp;
                    }
                    j--;
                }
            }
        }


        for (int i = 0; i<k;i++) {
            result.add(input[i]);
        }
        return result;
    }


    //数流中的中位数
    ArrayList<Integer> list = new ArrayList<Integer>();
    public void Insert(Integer num) {
        if (list.isEmpty())
            list.add(num);
        else {
            int i = 0;
            for (; i < list.size(); i++) {
                if (num <= list.get(i))
                    break;
            }
            list.add(i, num);
        }
    }

    public Double GetMedian() {
        int n = list.size();
        if (n % 2 == 1){
            return (double)list.get(n / 2);
        } else {
            double a = list.get(n / 2);
            double b = list.get(n / 2 -1);
            return (a + b) / 2;
        }
    }

    public static int[] FindNumsAppearOnce(int[] array) {
        // write code here
        if (array.length == 0) return null;
        int[] result = new int[2];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                int j = i - 1;
                while (j >= 0) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j + 1];
                        array[j + 1] = array[j];
                        array[j] = temp;
                    }
                    j--;
                }

            }

        }
        int temp = array[0];
        for (int i = 1; i < array.length; i++) {

            if(array[i] == temp) {
                i++;
            }
        }
        return result;
    }

    public static void heapSort(int[] array) {
        //找到最后一个非叶子节点的index，然后构建大顶堆
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            adjustHeap(array, i, array.length);
        }

        //将顶堆元素和末尾元素进行交换，将最大的值放到末尾
        for(int j = array.length - 1; j > 0; j--) {
            //交换
            int temp = array[j];
            array[j] = array[0];
            array[0] = temp;
            //重新构建大顶堆
            adjustHeap(array, 0, j);
        }
    }

    private static void adjustHeap(int[] array, int i, int length) {
        int temp = array[i];
        for(int k = 2 * i + 1; k < length; k = 2 * i +2) {
            if (k + 1 < length && array[k] < array[k + 1]) {
                //右节点大于左节点
                k++;
            }
            if(array[k] > temp) {
                array[i] = array[k];
                //针对跟节点（i=0）交换后的，该操作循环比较，i = 0，可以循环比较下面所有的节点
                i = k;
            } else {
                break;
            }
        }
        //for 结束，说明已经最大值已经在根节点了。此刻我们将temp放入调整后的问题
        array[i] = temp;
    }

}
