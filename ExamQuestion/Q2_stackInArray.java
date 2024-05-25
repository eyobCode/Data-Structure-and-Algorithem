public class Q2_stackInArray {
    private int top;
    private int[] arr;

    public Q2_stackInArray(int capacity){ // use constructor
         top=-1;
         arr=new int[capacity];
    }
    Q2_stackInArray(){
        this(10);//optional, may be doesnt have capacity
    }
    public boolean isEmpty(){return top < 0;}
    public boolean isFull(){return arr.length == size();}
    public int size(){return top +1;}
    public int peek(){return arr[top];}

    public void push(int data){
        if (isFull()){
            throw new RuntimeException("stack is full");
        }
        top++;
        arr[top]=data;
    }
    public int pop(){
        if (isEmpty()){
            throw new RuntimeException("stack is empty");
        }
        int temp=arr[top];
        top--;
        return temp;
    }
    public static void main(String[] args) {
        Q2_stackInArray stack=new Q2_stackInArray(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());//3
        System.out.println(stack.isFull());//true
        System.out.println(stack.pop());//3
        System.out.println(stack.peek());//2
        System.out.println(stack.isEmpty());//false
    }

}
