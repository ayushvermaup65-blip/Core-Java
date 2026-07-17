package OOPs.Inheritence.Transport;

public class Main {
    static void main() {
//        Car c = new Car("Maruti", "800", 4,5,"Auto");{
//            c.startEngine();
//            c.startAC();
//            c.stopEngine();
//        }
        MotorCycle m = new MotorCycle("Splender", " XLine",2, "U", "soft");
        m.startEngine();
        m.wheelie();
        m.stopEngine();

    }
}
