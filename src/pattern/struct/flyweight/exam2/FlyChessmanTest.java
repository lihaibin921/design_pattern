package pattern.struct.flyweight.exam2;

/**
 * @author: haibin li
 * @date: 2019/11/1
 * @description:
 */
public class FlyChessmanTest {

    public static void main(String[] args) {
        IgoChessman w1 , w2 , b1, b2;
        w1 = IgoChessmanFactory.getIgoChessman("白");
        w2 = IgoChessmanFactory.getIgoChessman("白");
        w1.display();
        w2.display();
        System.out.println(w1 == w2);

        b1 = IgoChessmanFactory.getIgoChessman("黑");
        b2 = IgoChessmanFactory.getIgoChessman("黑");
        b1.display();
        b2.display();
        System.out.println(b1 == b2);
    }

}
