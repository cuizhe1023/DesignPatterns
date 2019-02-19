package FactoryMethod;

/**
 * @Author: cuizhe
 * @Date: 2019/2/19 18:25
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        Factory circleFactory = new CircleFactory();
        Shape circle = circleFactory.getShape();
        circle.draw();

        Factory rectangleFactory = new RectangleFactory();
        Shape rectangle = rectangleFactory.getShape();
        rectangle.draw();

        Factory squareFactory = new SquareFactory();
        Shape square = squareFactory.getShape();
        square.draw();
    }
}
