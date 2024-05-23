public class stackArray {
    private int top;
    private int[] arr;

    public stackArray(int capacity){
        top = -1;
        arr= new int[capacity];
    }
    stackArray(){
        this(15);
    }
    public int size(){
        return top + 1;
    }
    public boolean isFull(){
        return arr.length == size();
    }
    public boolean isEmpty(){
        return top < 0;
    }
    public void push(int data){
        if (isFull()){
            throw new RuntimeException("stack is full!!");
        }
        top++;
        arr[top]=data;
    }
    public int pop(){
        if (isEmpty()){
            throw new RuntimeException("stack is empty!!");
        }
        int result = arr[top];
        top--;
        return result;
    }
    public int peek(){
        return arr[top];
    }

    public static void main(String[] args) {
        stackArray stack = new stackArray(5);

        System.out.println(stack.isEmpty()); // true
        stack.push(1);
        stack.push(2);
        System.out.println(stack.isFull());  //false
        System.out.println(stack.isEmpty()); //false
        System.out.println(stack.peek());    // 2
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.isFull());   // true
        System.out.println(stack.peek());     // 5
        System.out.println(stack.pop());      // 5
        System.out.println(stack.peek());     // 4
    }

}
