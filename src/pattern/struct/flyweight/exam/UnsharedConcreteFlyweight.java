package pattern.struct.flyweight.exam;

/**
 * @author: haibin li
 * @date: 2019/11/1
 * @description: 非共享具体享元类
 */
public class UnsharedConcreteFlyweight extends FlyWeight {

    public UnsharedConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    /** 定义业务操作
     * @param extrinsic*/
    @Override
    public void operate(int extrinsic) {
        System.out.println("unshared flyweight:" + extrinsic + " in:" + this.getIntrinsic());
    }
}
