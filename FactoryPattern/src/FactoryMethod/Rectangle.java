package FactoryMethod;

/**
 * @Author: cuizhe
 * @Date: 2019/2/19 18:27
 */
public class Rectangle implements Shape {

    public Rectangle(){
        System.out.println("Rectangle");
    }

    @Override
    public void draw() {
        System.out.println("Draw a Rectangle");
    }
}
