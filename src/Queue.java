
//  S/20/426
public class Queue {

    QueueNode front;
    QueueNode rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void dequeue(){
        if (this.front==null){
            return;
        }
        QueueNode temp=this.front;
        this.front=this.front.next;

        if (this.front==null){
            this.rear=null;
        }
    }
    public void enqueu(int data){
        QueueNode temp=new QueueNode(data);
        if(this.front==null){
            this.front =temp;
            this.rear=temp;
        }else{
            this.rear.next=temp;
            this.rear=temp;
        }

    }
    public void display(){
        QueueNode temp=this.front;
        while(temp!=null){
            System.out.print(temp.data+",");
            temp=temp.next;
        }
    }

    public void peek(){
        if(this.front!=null){
            System.out.println("front_element="+this.front.data);
        }else{
            System.out.println("Empty");
        }
    }
}
