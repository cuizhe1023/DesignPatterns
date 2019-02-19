package AbstractFactory;

/**
 * @Author: cuizhe
 * @Date: 2019/2/19 20:01
 */
public class AK47_Factory implements Factory{
    //具体工厂类
    @Override
    public Gun getGun() {
        return new AK47();
    }

    @Override
    public Bullet getBullet() {
        return new AK47_Bullet();
    }
}
