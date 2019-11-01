package pattern.struct.flyweight.exam;

/**
 * @author: haibin li
 * @date: 2019/11/1
 * @description:
 */
public class ExamTest {

    public static void main(String[] args) {
        int extrinsic = 22;
        FlyWeight flyweightX = FlyweightFactory.getFlyweight("X");
        flyweightX.operate(++ extrinsic);

        FlyWeight flyweightY = FlyweightFactory.getFlyweight("Y");
        flyweightY.operate(++ extrinsic);

        FlyWeight flyweightZ = FlyweightFactory.getFlyweight("Z");
        flyweightZ.operate(++ extrinsic);

        FlyWeight flyweightReX = FlyweightFactory.getFlyweight("X");
        flyweightReX.operate(++ extrinsic);
        System.out.println(flyweightX == flyweightReX);

        FlyWeight unsharedFlyweight = new UnsharedConcreteFlyweight("X");
        unsharedFlyweight.operate(++ extrinsic);
    }

}
