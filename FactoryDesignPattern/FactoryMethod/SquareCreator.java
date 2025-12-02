package FactoryMethod;

import Shapes.*;

public class SquareCreator implements  ShapeFactory {

    @Override
    public Shape CreateShape() {
        return new Square();
    }
    
}
