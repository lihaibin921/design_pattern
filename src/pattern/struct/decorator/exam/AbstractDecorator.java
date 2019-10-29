package pattern.struct.decorator.exam;

/**
 * @author: haibin li
 * @date: 2019/10/29
 * @description: 抽象装饰类 继承抽象构件,包含一个抽象构件引用,以调用构件对象的方法并装饰
 */
public abstract class AbstractDecorator extends ABattercake {

    private ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    @Override
    protected String getDesc() {
        return this.aBattercake.getDesc();
    }

    @Override
    protected int cost() {
        return this.aBattercake.cost();
    }
}
