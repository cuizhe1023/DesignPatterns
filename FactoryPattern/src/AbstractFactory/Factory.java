package AbstractFactory;

/**
 * @Author: cuizhe
 * @Date: 2019/2/19 19:53
 */
public interface Factory {
    //抽象工厂类
    public Gun getGun();
    public Bullet getBullet();
}
