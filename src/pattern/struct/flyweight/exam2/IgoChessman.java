package pattern.struct.flyweight.exam2;

/**
 * @author: haibin li
 * @date: 2019/11/1
 * @description: 享元抽象类
 */
public abstract class IgoChessman {

    public abstract String chessColor();

    public void display(){
        System.out.println("棋子:" + this.chessColor());
    }

}
