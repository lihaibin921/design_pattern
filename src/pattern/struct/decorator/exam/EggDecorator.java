package pattern.struct.decorator.exam;

/**
 * @author: haibin li
 * @date: 2019/10/29
 * @description: 具体装饰类
 */
public class EggDecorator extends AbstractDecorator {

    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}
