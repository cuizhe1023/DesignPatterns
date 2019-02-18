package hungryType;

/**
 * @Author: cuizhe
 * @Date: 2019/2/18 21:28
 */
public class HungryTypeTest {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        System.out.println("两次创建的对象是否相等:"+(singleton==singleton1));
    }

}
