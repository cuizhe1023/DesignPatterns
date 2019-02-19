package AbstractFactory;

/**
 * @Author: cuizhe
 * @Date: 2019/2/19 19:59
 */
public class AK47_Bullet implements Bullet {
    //具体工厂类
    @Override
    public void load() {
        System.out.println("load bullet with AK47");
    }
}
