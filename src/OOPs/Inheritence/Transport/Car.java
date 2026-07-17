package OOPs.Inheritence.Transport;

public class Car extends Vehicle{
        public int noOfDoors;
        public String transmissionType;

        Car(String name, String model, int noOfTyres, int noOfDoors, String transmissionType){
                super(name, model, noOfTyres); // super(parameters) ==> isse parent class ke constructor call honge
                this.noOfDoors = noOfDoors;
                this.transmissionType = transmissionType;
//                super.startEngine(); // super. ==> isse super class ke methods call honge
//                super.stopEngine();  // super. ==> isse super class ke methods call honge
        }
        public void startAC(){
            System.out.println("AC started of " + name);
        }
}
