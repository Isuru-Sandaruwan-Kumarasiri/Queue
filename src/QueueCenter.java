public class QueueCenter {
    Vehicle front;
    Vehicle rear;

    public QueueCenter() {
        this.front =this.rear=null ;
    }
    public void inLine(String vehicleNumber){
        if(this.front==null){
            System.out.println("No Vehicles");
        }else{
            Vehicle temp_vehicle=this.front;
            int i=0;
            while(temp_vehicle!=null){
                if(temp_vehicle.vehicleNumber==vehicleNumber){
                    System.out.println("Number of Vehicles :"+i);
                    return;
                }
                temp_vehicle=temp_vehicle.next;
                i++;
            }
        }
    }
    public void enterForService(String number,String type,String service){
        Vehicle vehicle=new Vehicle(number,type,service);
        if(this.front==null){
            this.front=vehicle;
            this.rear=vehicle;
        }else {
            this.rear.next=vehicle;
            this.rear=vehicle;
        }
    }
    public void exitService(){

    }


}
