package pattern.struct.flyweight.exam;

/**
 * @author: haibin li
 * @date: 2019/11/1
 * @description: 具体享元类
 */

public class ConcreteFlyweight extends FlyWeight {

    public ConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    /** 定义业务操作
     * @param extrinsic*/
    @Override
    public void operate(int extrinsic) {
        System.out.println("flyweight:" + extrinsic + " in:" + this.getIntrinsic());
    }
}
