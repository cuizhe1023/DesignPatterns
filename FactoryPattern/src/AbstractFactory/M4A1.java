package AbstractFactory;

/**
 * @Author: cuizhe
 * @Date: 2019/2/19 19:54
 */
public class M4A1 implements Gun {
    //具体产品类
    @Override
    public void shooting() {
        System.out.println("Shooting with M4A1");
    }
}
