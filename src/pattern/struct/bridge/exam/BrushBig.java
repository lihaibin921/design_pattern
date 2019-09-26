package pattern.struct.bridge.exam;

/**
 * @author: haibin li
 * @date: 2019/9/26
 * @description:
 */
public class BrushBig extends Brush {

    @Override
    public void draw(String obj) {
        System.out.print("用大号毛笔画");
        color.paint();
        System.out.println(obj);
    }
}
