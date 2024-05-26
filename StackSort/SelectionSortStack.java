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
        public void selectioSort(){
            SelectionSortStack sortStack=new SelectionSortStack();
            SelectionSortStack tempStack=new SelectionSortStack();
            while (!isEmpty()){
                int min = pop();
                while (!isEmpty()){
                    int temp = pop();
                    if (temp < min){
                        tempStack.push(temp);
                        min=temp;
                    }
                }
            }
    }

        public static void main(String[] args) {
            SelectionSortStack  sll = new SelectionSortStack ();

            System.out.println(sll.isEmpty());// true

            sll.push(1); // insert 1
            sll.push(2); // insert 2
            sll.push(3); // insert 3
            sll.push(4); // insert 4



            System.out.println(sll.length);   // legth 4
            System.out.println(sll.pop());    // 4
            System.out.println(sll.length);   // 3
            System.out.println(sll.peek());   // 3
            System.out.println(sll.isEmpty());// false

        }
    }


