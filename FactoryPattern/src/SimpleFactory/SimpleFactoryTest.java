package SimpleFactory;

/**
 * @Author: cuizhe
 * @Date: 2019/2/19 15:08
 */
public class SimpleFactoryTest {

//    public static void main(String[] args) {
//        // 获取 Circle 的对象，并调用它的 draw 方法
//        Shape circle = SimpleFactory.getShape("Circle");
//        circle.draw();
//        // 获取 Rectangle 的对象，并调用它的 draw 方法
//        Shape rectangle = SimpleFactory.getShape("Rectangle");
//        rectangle.draw();
//        // 获取 Square 的对象，并调用它的 draw 方法
//        Shape square = SimpleFactory.getShape("Square");
//        square.draw();
//    }

    public static void main(String[] args) {
        /*
        这种方式的虽然符合了 开放-关闭原则 ，但是每一次传入的都是产品类的全部路径，这样比较麻烦。
        如果需要改善的话可以通过 反射+配置文件 的形式来改善，这种方式使用的也是比较多的。
         */
        Circle circle = (Circle) SimpleFactory2.getClass(Circle.class);
        circle.draw();
        Rectangle rectangle = (Rectangle) SimpleFactory2.getClass(Rectangle.class);
        rectangle.draw();
        Square square = (Square) SimpleFactory2.getClass(Square.class);
        square.draw();
    }
}
