package SimpleFactory;

/**
 * @Author: cuizhe
 * @Date: 2019/2/19 15:13
 */
public class SimpleFactory2 {
    //利用反射解决简单工厂每次增加新了产品类都要修改产品工厂的弊端
    public static Object getClass(Class<? extends Shape> clazz){
        Object obj = null;
        try {
            obj = Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
