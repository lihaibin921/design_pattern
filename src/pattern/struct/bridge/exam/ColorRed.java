package pattern.struct.bridge.exam;

/**
 * @author: haibin li
 * @date: 2019/9/26
 * @description:
 */
public class ColorRed implements Color {

    @Override
    public void paint() {
        System.out.print(" 红色的 ");
    }
}
