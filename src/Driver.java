
//  S/20/426
public class Driver {
    public static void main(String[] args) {


        Queue list=new Queue();
        list.enqueu(7);
        list.enqueu(5);
        list.enqueu(3);
        list.enqueu(8);
        list.enqueu(44);
        list.enqueu(73);
        list.enqueu(105);
        list.enqueu(225);
        list.enqueu(515);

        System.out.println("2)");
        list.peek();

        System.out.println();
        list.enqueu(30);
        list.enqueu(10);

        System.out.println("4)");
        list.dequeue();
        list.peek();

        list.enqueu(838);
        list.enqueu(586);


        System.out.println("5)");
        list.display();
    }
}
