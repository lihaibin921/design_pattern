package pattern.struct.decorator.exam;

import org.junit.Test;

/**
 * @author: haibin li
 * @date: 2019/10/29
 * @description:
 */
public class DecoratorTest {

    /** 未装饰 */
    public static void main(String[] args) {
        ABattercake aBattercake = new Battercake();
        System.out.println(aBattercake.getDesc() + " ,价格:" + aBattercake.cost());
    }

    @Test
    public void decorateEgg(){
        ABattercake aBattercake = new Battercake();
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);
        System.out.println(aBattercake.getDesc() + " ,价格:" + aBattercake.cost());
    }

}
