package pattern.struct.flyweight.exam;

/**
 * @author: haibin li
 * @date: 2019/11/1
 * @description: 享元抽象类
 */
public abstract class FlyWeight {

    /** 内部状态 同一个享元对象内部状态不能变化*/
    private String intrinsic;

    public FlyWeight(String intrinsic) {
        this.intrinsic = intrinsic;
    }

    /** 定义业务操作 extrinsic 为外部状态, 可以改变*/
    public abstract void operate(int extrinsic);

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }

}
