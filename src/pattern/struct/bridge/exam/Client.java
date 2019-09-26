package pattern.struct.bridge.exam;

/**
 * @author: haibin li
 * @date: 2019/9/26
 * @description: 测试
 */
public class Client {

    public static void main(String[] args) {
        Brush bigBrush = new BrushBig();
        bigBrush.setColor(new ColorBlue());

        Brush middleBrush = new BrushMiddle();
        middleBrush.setColor(new ColorRed());

        Brush smallBrush = new BrushSmall();
        smallBrush.setColor(new ColorGreen());

        bigBrush.draw("天空");
        middleBrush.draw("太阳");
        smallBrush.draw("草地");
    }

}
