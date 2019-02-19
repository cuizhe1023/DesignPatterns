package AbstractFactory;

/**
 * @Author: cuizhe
 * @Date: 2019/2/19 20:01
 */
public class M4A1_Factory implements Factory {
    //具体工厂类
    @Override
    public Gun getGun() {
        return new M4A1();
    }

    @Override
    public Bullet getBullet() {
        return new M4A1_Bullet();
    }
}
