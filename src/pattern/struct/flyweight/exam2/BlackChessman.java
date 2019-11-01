package pattern.struct.flyweight.exam2;

/**
 * @author: haibin li
 * @date: 2019/11/1
 * @description: 具体享元类, 黑棋
 */
public class BlackChessman extends IgoChessman {

    @Override
    public String chessColor() {
        return "黑色";
    }
}
