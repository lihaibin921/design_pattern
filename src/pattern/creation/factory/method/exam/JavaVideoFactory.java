package pattern.creation.factory.method.exam;

/**
 * @author: haibin li
 * @date: 2019/10/31
 * @description: 具体工厂类
 */
public class JavaVideoFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
