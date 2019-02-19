package FactoryMethod;

/**
 * @Author: cuizhe
 * @Date: 2019/2/19 18:27
 */
public class Circle implements Shape {

    public Circle(){
        System.out.println("Circle");
    }

    @Override
    public void draw() {
        System.out.println("Draw a Circle");
    }
}
