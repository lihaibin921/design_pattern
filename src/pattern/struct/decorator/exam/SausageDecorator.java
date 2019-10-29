package pattern.struct.decorator.exam;

/**
 * @author: haibin li
 * @date: 2019/10/29
 * @description: 香肠装饰类
 */
public class SausageDecorator extends AbstractDecorator{

    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加根肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
