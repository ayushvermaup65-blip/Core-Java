package OOPs.Polymorphism;

public class Circle extends Shape{

    @Override // Works as a comment -> used to show that draw method is also defined in parent class(Shape.java). It is not compulsory to write.
    public void draw(){
        System.out.println("Circle is drawing.");
    }
}
