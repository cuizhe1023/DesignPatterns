package AbstractFactory;

/**
 * @Author: cuizhe
 * @Date: 2019/2/19 19:44
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        Factory factory;
        Gun gun;
        Bullet bullet;

        factory = new AK47_Factory();
        bullet = factory.getBullet();
        bullet.load();
        gun = factory.getGun();
        gun.shooting();

        factory = new M4A1_Factory();
        bullet = factory.getBullet();
        bullet.load();
        gun = factory.getGun();
        gun.shooting();
    }

}
