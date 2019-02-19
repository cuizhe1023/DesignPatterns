package AbstractFactory;

/**
 * @Author: cuizhe
 * @Date: 2019/2/19 19:55
 */
public class AK47 implements Gun {
    //具体产品类
    @Override
    public void shooting() {
        System.out.println("Shooting with AK47");
    }
}
