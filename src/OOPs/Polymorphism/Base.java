package OOPs.Polymorphism;

public class Base {
    static void main() {
//        Calculator c = new Calculator();
//        System.out.println(c.add(2,3));
//        System.out.println(c.add(2,3,4));
//        System.out.println(c.add(2,3,4,5.6));

//      Runtime Polymorphism
        Circle c = new Circle();
        doDrawingStuff(c);

        Rect r = new Rect();
        doDrawingStuff(r);
//
        Shape s = new Shape();
        doDrawingStuff(s);

        //Downcasting
//        Circle c = new Circle();
//        doDrawingStuff(c);

//        Rect r = new Rect();
//        doDrawingStuff(r);

    }

    public static void doDrawingStuff(Shape s){ //parameter me Shape ka object s likha hai jo apne saare childs ke objects ko hold karega
        s.draw(); //ye ek Polymorphic method hai
        //  iska meaning hai ki Shape class ka draw method call hona chahiye ,
        // par ye apne child class (Circle class ke draw method ko call kar rha hai)
        // so this is called Upcasting
//        Circle c = (Circle)s; // Downcasting
//        c.draw();
     }
}
