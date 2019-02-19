package SimpleFactory;

/**
 * @Author: cuizhe
 * @Date: 2019/2/19 14:56
 */
public class Square implements Shape {

    public Square(){
        System.out.println("Square");
    }

    @Override
    public void draw() {
        System.out.println("Draw a Square");
    }
}
