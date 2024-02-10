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

}
