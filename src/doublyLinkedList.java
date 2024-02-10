public class doublyLinkedList {
    doublyLinkedListNode head;
    doublyLinkedListNode tail;

    public doublyLinkedList(doublyLinkedListNode head, doublyLinkedListNode tail) {
        this.head = null;
        this.tail = null;
    }

    public void insertAtBeginning(int data){
        doublyLinkedListNode newNode=new doublyLinkedListNode(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else {
            newNode.next=head;
            head.prev=newNode;
            newNode=head;
        }
    }

    public void traverseForward(){
        doublyLinkedListNode current=head;
        while(current!=null){
            System.out.print(current.data+",");
            current=current.next;
        }
    }
    public void traverseBackward(){
        doublyLinkedListNode current=tail;
        while (current!=null){
            System.out.println(current.data+",");
            current=current.prev;
        }
    }
    public void insertEnd(int data){
        doublyLinkedListNode newNode=new doublyLinkedListNode(data);
        if(tail==null){
            head=newNode;
            tail=newNode;
        }else {
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }
    public void insertAtPosition(int data,int position) {
        doublyLinkedListNode newNode = new doublyLinkedListNode(data);
        if (position == 1) {
            insertAtBeginning(data);
        } else {
            doublyLinkedListNode current = head;
            int currentPosition = 1;
            while (current != null && currentPosition < position) {//current!=null array limit eka ikmawa position eka labadunnot ena error eka avoid karnn
                current = current.next; //current ekat watenne enyer karana postion node ekam ,example pos 3 -->node 3
                currentPosition++;
            }
            if (current == null) {
                insertEnd(data);
            } else {
                newNode.next = current;
                newNode.prev = current.prev;
                current.prev = newNode;
                doublyLinkedListNode frontNode = current.prev;
                frontNode.next = newNode;

            }

        }
    }
    public void deleteAtBeginning()
    {
        if (head == null) {
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        doublyLinkedListNode temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;
    }

    public void deleteAtEnd()
    {
        if (tail == null) {
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        doublyLinkedListNode  temp = tail;
        tail = tail.prev;
        tail.next = null;
        temp.prev = null;
    }

    public void delete(int pos)
    {
        if (head == null) {
            return;
        }

        if (pos == 1) {
            deleteAtBeginning();
            return;
        }

        doublyLinkedListNode current = head;
        int count = 1;

        while (current != null && count != pos) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Position wrong");
            return;
        }

        if (current == tail) {
            deleteAtEnd();
            return;
        }

        current.prev.next = current.next;
        current.next.prev = current.prev;
        current.prev = null;
        current.next = null;
    }



}
