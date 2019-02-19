package AbstractFactory;

/**
 * @Author: cuizhe
 * @Date: 2019/2/19 19:58
 */
public class M4A1_Bullet implements Bullet {
    //具体产品类
    @Override
    public void load() {
        System.out.println("load bullet with M4A1");
    }
}
