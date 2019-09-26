package pattern.struct.bridge.exam;

/**
 * @author: haibin li
 * @date: 2019/9/26
 * @description:
 */
public class BrushSmall extends Brush {

    @Override
    public void draw(String obj) {
        System.out.print("用小号毛笔画");
        color.paint();
        System.out.println(obj);
    }
}
