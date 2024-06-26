import java.util.EmptyStackException;

public class SelectionSortStack {

    private ListNode top;
    private int length;


    private static class ListNode{

        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;
        }

    }
    private SelectionSortStack(){
        this.top = null;
        length = 0;
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }
    public void push(int data){
        ListNode node = new ListNode(data);
        node.next = top;
        top = node;
        length++;
    }
    public int pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }
    public int peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return top.data;
    }
    // Insertion Sort

    public void Insertion(){
        SelectionSortStack insertionStack = new SelectionSortStack();
        while (!isEmpty()){
            int temp = pop();
            while (!insertionStack.isEmpty() && insertionStack.peek() > temp){
                push(insertionStack.pop());
            }
            insertionStack.push(temp);
        }
        while (!insertionStack.isEmpty()){
            push(insertionStack.pop());
        }

    }

    public static void main(String[] args) {
        SelectionSortStack sll = new SelectionSortStack();

        System.out.println(sll.isEmpty()); // true

        sll.push(34);
        sll.push(3);
        sll.push(31);
        sll.push(98);
        sll.push(92);
        sll.push(23);

        System.out.println("Original stack length: " + sll.length()); // length 6
        System.out.println("Original stack top: " + sll.peek()); // 23

        sll.Insertion();

        System.out.println("Sorted stack length: " + sll.length()); // length 6
        System.out.println("Sorted stack top: " + sll.peek()); // 3 (since it's sorted in ascending order)

    }
}