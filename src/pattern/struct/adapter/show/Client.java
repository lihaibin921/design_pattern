package pattern.struct.adapter.show;

/**
 * @author: haibin li
 * @date: 2019/9/23
 * @description: 客户端使用过程
 */
public class Client {

    /**
     * 这里演示 t
     * 客户需要一个实现Target接口 , 并完成Adaptee功能的类 ,这个类就是Adapter
     * 所以Adapter 继承 Adaptee 类 实现 Target 接口即可
     * 也可以不继承Adaptee类, 而采用组合的方式, 在Adapter中引入Adaptee
     */
    public static void main(String[] args) {
        Target target = new Adapter();
        target.targetFunc();
    }

}
