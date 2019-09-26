package pattern.struct.bridge.exam;

/**
 * @author: haibin li
 * @date: 2019/9/26
 * @description:
 */
public class BrushMiddle extends Brush {

    @Override
    public void draw(String obj) {
        System.out.print("用中号毛笔画");
        color.paint();
        System.out.println(obj);
    }
}
