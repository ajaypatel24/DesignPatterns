package CreationalPatterns.AbstractFactory;

public class AbstractFactoryPatternDemo {
    public static void main (String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();

        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);

        Shape shape1Round = roundedShapeFactory.getShape("RECTANGLE");
        shape1Round.draw();

        Shape shape2Round = roundedShapeFactory.getShape("SQUARE");
        shape2Round.draw();

        
    }
}
