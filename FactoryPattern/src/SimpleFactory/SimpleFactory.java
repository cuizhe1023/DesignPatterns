package SimpleFactory;

/**
 * @Author: cuizhe
 * @Date: 2019/2/19 15:02
 */
public class SimpleFactory {
    //这样的实现有个问题，如果我们新增产品类的话，就需要修改工厂类中的getShape（）方法，这很明显不符合 开放-封闭 原则。
    public static Shape getShape(String shapeType){

        if (shapeType==null){
            return null;
        }

        if ("Circle".equalsIgnoreCase(shapeType)){
            return new Circle();
        }else if ("Rectangle".equalsIgnoreCase(shapeType)){
            return new Rectangle();
        }else if("Square".equalsIgnoreCase(shapeType)){
            return new Square();
        }
        return null;
    }
}
