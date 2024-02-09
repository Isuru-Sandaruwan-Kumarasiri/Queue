
//  S/20/426

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
                if(temp_vehicle.vehicleNumber.equals(vehicleNumber)){
                    System.out.println("Number of Vehicles :"+(i-1));
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
    public void exitService(String number){
        Vehicle currentVehicle=this.front;
        if(currentVehicle!=null && currentVehicle.vehicleNumber.equals(number)){
            this.front=currentVehicle.next;
            System.out.println("success");

        }
        Vehicle temp=currentVehicle.next;
        while(temp!=null){
            if(temp.vehicleNumber.equals(number)){
                System.out.println("Vehicle with VIN " + number+ " exited the service center.");
            }
            temp=temp.next;
        }
    }

    public void showQueue(){
        Vehicle vehicle=this.front;
        while(vehicle!=null){
            System.out.println("VIN-"+vehicle.vehicleNumber+"\n"+"Vehicle Type-"+vehicle.type+"\n"+"Service Type-"+vehicle.service+"\n");
            vehicle=vehicle.next;
        }
    }


}
