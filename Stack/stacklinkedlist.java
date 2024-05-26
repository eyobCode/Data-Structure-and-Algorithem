import java.util.EmptyStackException;

public class stacklinkedlist {

    private ListNode top;
    private int length;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public stacklinkedlist() {
        this.top = null;
        this.length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void push(int data) {
        ListNode node = new ListNode(data);
        node.next = top;
        top = node;
        length++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    // Merge Sort Implementation
    public void mergeSort() {
        if (isEmpty() || length == 1) {
            return;
        }

        stacklinkedlist leftStack = new stacklinkedlist();
        stacklinkedlist rightStack = new stacklinkedlist();
        int count = length;
        int mid = count / 2;

        // Split the stack into two halves
        while (count-- > mid) {
            leftStack.push(pop());
        }
        while (count-- >= 0) {
            rightStack.push(pop());
        }

        // Sort each half
        leftStack.mergeSort();
        rightStack.mergeSort();

        // Merge the sorted halves
        merge(leftStack, rightStack);
    }

    private void merge(stacklinkedlist leftStack, stacklinkedlist rightStack) {
        stacklinkedlist tempStack = new stacklinkedlist();

        while (!leftStack.isEmpty() && !rightStack.isEmpty()) {
            if (leftStack.peek() <= rightStack.peek()) {
                tempStack.push(leftStack.pop());
            } else {
                tempStack.push(rightStack.pop());
            }
        }

        while (!leftStack.isEmpty()) {
            tempStack.push(leftStack.pop());
        }

        while (!rightStack.isEmpty()) {
            tempStack.push(rightStack.pop());
        }

        // Restore the elements to the original stack in sorted order
        while (!tempStack.isEmpty()) {
            push(tempStack.pop());
        }
    }

    public static void main(String[] args) {
        stacklinkedlist sll = new stacklinkedlist();

        System.out.println(sll.isEmpty()); // true

        sll.push(34);
        sll.push(3);
        sll.push(31);
        sll.push(98);
        sll.push(92);
        sll.push(23);

        System.out.println("Original stack length: " + sll.length()); // length 6
        System.out.println("Original stack top: " + sll.peek()); // 23

        sll.mergeSort();

        System.out.println("Sorted stack length: " + sll.length()); // length 6
        System.out.println("Sorted stack top: " + sll.peek()); // 98 (since it's sorted in ascending order)
    }
}

