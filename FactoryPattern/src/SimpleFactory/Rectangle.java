package SimpleFactory;

/**
 * @Author: cuizhe
 * @Date: 2019/2/19 14:56
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
