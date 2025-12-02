import Enum.ShapeType;
import Shapes.Shape;
import SimpleFactory.ShapeFactory;

public class SimpleFactoryDemo {
    public static void main(String[] args) {
        System.out.println("==================== Simple Factory Demo");
        Shape shape =  ShapeFactory.CreateShapeInstance( ShapeType.CIRCLE);
        shape.computeArea();;
        shape.draw();
    }
}
