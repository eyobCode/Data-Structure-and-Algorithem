public class LinkedList {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public ListNode Reverse(ListNode head){
       if (head == null || head.next == null){
           return head;
       }
       ListNode current = head;
       ListNode previous = null;
       ListNode next = null;
       while (current != null){
           next = current.next;
           current.next = previous;
           previous = current;
           current = next;
       }
       return previous;
    }
    public ListNode Remove(int position){
        if (position == 1){
            ListNode removeValue = head;
            head = head.next;
            return removeValue;
        }
        ListNode temp = head;
        int count = 1;
        while (count < position -1){
            temp = temp.next;
            count++;
        }
        ListNode remove = temp.next;
        temp.next=remove.next;
        return  remove;
    }
    public ListNode RemoveLast(){
        if (head == null || head.next == null){
            return head;
        }
        ListNode remove = head;
        ListNode previous = null;
        while (remove.next != null){
            previous = remove;
            remove = remove.next;
        }
        previous.next = null;
        return remove;
    }
    public ListNode RemoveFirst(){
        if (head == null || head.next == null){
            return head;
        }
        ListNode remove = head;
        head = head.next;
        return remove;
    }
    public void Insert(int value,int position){
        ListNode node = new ListNode(value);
        if (position == 1){
            node.next = head;
            head = node;
        }else {
            ListNode current = head;
            int count = 1;
            while (count < position -1){
                current = current.next;
                count++;
            }
            node.next=current.next;
            current.next = node;
        }
    }
    public void Append(int value){
        ListNode node = new ListNode(value);
        if (head == null || head.next == null){
            head = node;
        }else {
            ListNode count = head;
            while (count.next != null){
                count=count.next;
            }
            count.next = node;
        }
    }
    public void Prepend(int value){
        ListNode node = new ListNode(value);
        if (head == null){
            head = node;
        }else {
            node.next = head;
            head = node;
        }
    }
    public void length(){
        if (head == null){
            System.out.println(0);
        }else {
            ListNode count=head;
            int len=0;
            while (count != null){
                count = count.next;
                len++;
            }
            System.out.println(len);
        }
    }
    public void print(ListNode head){
        if (head == null || head.next == null){
            System.out.println("null");
        }else {
            ListNode count = head;
            while (count != null){
                System.out.print(count.data+"--->");
                count = count.next;
            }
            System.out.println("null");
        }
    }
    public boolean Search(int key){
        ListNode target = head;
        while (target != null){
            if (key == target.data){
                return true;
            }
            target = target.next;
        }
        return false;

    }

    public static void main(String[] args) {
      LinkedList ll=new LinkedList();

      ll.head=new ListNode(1);
      ListNode second=new ListNode(2);
      ListNode third=new ListNode(3);
      ListNode forth=new ListNode(4);

      //connect each athore

        ll.head.next=second;
        second.next=third;
        third.next=forth;

        //print
        //length

        ll.print(ll.head);
        ll.length();

        //Insert in position

        ll.Insert(9,5);
        ll.print(ll.head);

        //Prepend

        ll.Prepend(0);
        ll.print(ll.head);

        //Append

        ll.Append(0);
        ll.print(ll.head);

        //RemoveLast

        System.out.println(ll.RemoveLast().data);
        ll.print(ll.head);

        //RemoveFirst

        System.out.println(ll.RemoveFirst().data);
        ll.print(ll.head);

        //Remove in position

        System.out.println(ll.Remove(5).data);
        ll.print(ll.head);

        //Searching value, if the value in the linked list return true

        System.out.println(ll.Search(7));

        // Reverse it takes head

        ll.print(ll.Reverse(ll.head));

    }

}
