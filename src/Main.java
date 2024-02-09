//  S/20/426
public class Main {
    public static void main(String[] args) {
       QueueCenter line=new QueueCenter();
       line.enterForService("0001","car",": Full Service");
        line.enterForService("0002","jeep","Body wash only");
        line.enterForService("0003","SUV","Interior Cleaning" );
        line.enterForService("0004","Van","Oil Change only");

        line.showQueue();
        line.inLine("0004");

        line.exitService("0001");

        line.showQueue();
    }
}