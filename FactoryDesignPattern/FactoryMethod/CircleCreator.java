package FactoryMethod;

import Shapes.*;

public class CircleCreator  implements ShapeFactory{

    @Override
    public Shape CreateShape() {
        return new Circle();
    }
}
