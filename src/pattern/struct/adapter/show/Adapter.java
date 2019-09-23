package pattern.struct.adapter.show;

/**
 * @author: haibin li
 * @date: 2019/9/23
 * @description: 适配器
 */
//继承方式 类适配器
//public class Adapter extends Adaptee implements Target{
//
//    @Override
//    public void targetFunc() {
//        func();
//    }
//}

//组合方式 对象适配器
public class Adapter implements Target{

    @Override
    public void targetFunc() {
        Adaptee adaptee = new Adaptee();
        adaptee.func();
    }
}
