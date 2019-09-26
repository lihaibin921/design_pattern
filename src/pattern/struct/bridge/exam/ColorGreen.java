package pattern.struct.bridge.exam;

/**
 * @author: haibin li
 * @date: 2019/9/26
 * @description:
 */
public class ColorGreen implements Color{

    @Override
    public void paint() {
        System.out.print(" 绿色的 ");
    }
}
