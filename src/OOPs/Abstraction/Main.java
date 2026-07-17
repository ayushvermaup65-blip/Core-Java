//package OOPs.Abstraction;
//
//abstract class Bird{
//
//    // Abstract methods
//    abstract void fly(); // this is interface
//    abstract void eat(); // this is interface
//
//    // Concrete methods
//    public void sleep(){
//        System.out.println("Bird sleeping");
//    }
//}
//
//class Sparrow extends Bird {
//    @Override
//    void fly() { // here is the implementation of the interface
//        System.out.println("Sparrow flying alag way se");
//    }
//    @Override
//    void eat(){ // here is the implementation of the interface
//        System.out.println("Sparrow eating");
//    }
//}
//
//class Crow extends Bird{
//    @Override
//    void fly(){ // here is the implementation of the interface
//        System.out.println("Crow flying");
//    }
//    @Override
//    void eat(){ // here is the implementation of the interface
//        System.out.println("Crow eating alag way se");
//    }
//}
//
//
//public class Main {
//
//    public static void doBirdStuff(Bird b){
//        b.eat();
//        b.fly();
//        b.eat();
//        b.fly();
//        b.eat();
//        b.fly();
//        b.eat();
//        b.fly();
//        b.eat();
//        b.fly();
//        b.eat();
//        b.fly();
//        b.eat();
//        b.fly();
//    }
//    static void main() {
//       doBirdStuff(new Sparrow());
//        doBirdStuff(new Crow());
//    }
//}


   // Interface // this is new java technique to make interfaces
package OOPs.Abstraction;
//
interface Bird{

    // Abstract methods
    void fly(); // This is Interface
    void eat(); // This is Interface

//     Concrete method
    default void sleep(){ // Interface with implementation
        System.out.println("Bird sleeping");
    }

    void walk();
}

class Crow implements Bird{
    @Override
    public void fly(){ // here is the implementation of the interface
        System.out.println("Crow flying");
    }
    @Override
    public void eat(){ // here is the implementation of the interface
        System.out.println("Crow eating");
    }
    @Override
    public void walk(){ System.out.println("Crow walking"); }
}


class Sparrow implements Bird {

    @Override
    public void fly() { // here is the implementation of the interface
        System.out.println("Sparrow flying");
    }

    @Override
    public void eat() { // here is the implementation of the interface
        System.out.println("Sparrow eating");
    }

    @Override
    public void walk() {
        System.out.println("Sparrow walking");
    }
}

class Pigeon implements Bird {
    @Override
    public void fly(){
        System.out.println("Pigeon flying");
    }
    @Override
    public void eat(){
        System.out.println("Pigeon eating");
    }
    @Override
    public void walk(){
        System.out.println("Pigeon walking");
    }
    @Override
    public void sleep(){
        System.out.println("Pigeon sleeping");
    }
}




public class Main {

    public static void doBirdStuff(Bird b){
        b.eat();
        b.fly();
        b.walk();
        b.sleep();


    }
    static void main() {
        doBirdStuff(new Pigeon());
        doBirdStuff(new Sparrow());
        doBirdStuff(new Crow());

    }
}

