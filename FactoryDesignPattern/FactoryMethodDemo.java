import Enum.ShapeType;
import FactoryMethod.CircleCreator;
import FactoryMethod.RectangleCreator;
import FactoryMethod.SquareCreator;
import Shapes.*;

public class FactoryMethodDemo {

    public static void main(String[] args) {
        System.out.println("======== FactoryMethod Demo =============");
        Shape shape = getShapeInstance(ShapeType.RECTANGLE);
        shape.computeArea();
        shape.draw();
    }
    private static  Shape getShapeInstance(ShapeType shapeType){
        Shape shape = null;
        if(shapeType == null)
            return null;
        switch (shapeType) {
            case CIRCLE:
                CircleCreator circleCreator = new CircleCreator();
                shape = circleCreator.CreateShape();
            break;
            case RECTANGLE:
                 RectangleCreator  rectangleCreator = new RectangleCreator();
                shape = rectangleCreator.CreateShape();
            break;
            case SQUARE:
                SquareCreator  squareCreator = new SquareCreator();
                shape = squareCreator.CreateShape();
            break;
            default:
                throw new IllegalStateException("ShapeType is not valid!");
        }
        return shape;
    }
}
