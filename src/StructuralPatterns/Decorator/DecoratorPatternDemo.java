package StructuralPatterns.Decorator;

public class DecoratorPatternDemo {
    public static void main (String[] args) {
        Shape circle = new Circle(); //regular circle

        Shape redCircle = new RedShapeDecorator(new Circle()); //this new shape has added functionality 

        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle with red border");
        redCircle.draw();

        System.out.println("\nRectangle with red border");
        redRectangle.draw();
    }
}
