package pattern.struct.bridge.exam;

/**
 * @author: haibin li
 * @date: 2019/9/26
 * @description: 毛笔
 */
public abstract class Brush {

    protected Color color;

    public abstract void draw(String obj);

    public void setColor(Color color) {
        this.color = color;
    }
}
