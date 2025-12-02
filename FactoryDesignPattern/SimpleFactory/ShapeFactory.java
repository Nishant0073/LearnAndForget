package SimpleFactory;

import Enum.ShapeType;
import Shapes.Circle;
import Shapes.Rectangle;
import Shapes.Shape;
import Shapes.Square;

public class ShapeFactory {
    public static Shape CreateShapeInstance(ShapeType shapeType){
        if(shapeType==null)
            return null;
        return switch (shapeType) {
            case CIRCLE -> new Circle();
            case RECTANGLE -> new Rectangle();
            case SQUARE -> new Square();
            default -> throw new IllegalStateException("ShapeType doesn't exist!");
        };
    }
}
