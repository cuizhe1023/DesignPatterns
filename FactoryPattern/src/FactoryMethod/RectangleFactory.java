package FactoryMethod;

/**
 * @Author: cuizhe
 * @Date: 2019/2/19 18:25
 */
public class RectangleFactory implements Factory {
    @Override
    public Shape getShape() {
        return new Rectangle();
    }
}
