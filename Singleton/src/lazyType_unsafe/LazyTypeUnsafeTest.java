package lazyType_unsafe;

/**
 * @Author: cuizhe
 * @Date: 2019/2/18 21:43
 */
public class LazyTypeUnsafeTest {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        System.out.println("两次创建的对象是否相等:"+(singleton==singleton1));
    }

}
