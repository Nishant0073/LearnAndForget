package FactoryMethod;

import Shapes.*;

public class RectangleCreator implements ShapeFactory{

    @Override
    public Shape CreateShape() {
        return  new Rectangle();
    }
}
