public class CircularQueue {
    private ListNode front;
    private ListNode rear;
    private int length;


    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    CircularQueue(){
        front=null;
        rear=null;
        length=0;
    }

}
