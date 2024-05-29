public class CircularSinglyLinkedList {

    private ListNode last;
    private int length;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public boolean isEmpty(){
        return length == 0;
    }
    public int length(){
        return length;
    }
    public void display(){
        if (isEmpty()){
            return;
        }


    }
}
