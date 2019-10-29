package pattern.struct.decorator.exam;

/**
 * @author: haibin li
 * @date: 2019/10/29
 * @description:煎饼类(具体构件 继承抽象构件)
 */
public class Battercake extends ABattercake{

    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
