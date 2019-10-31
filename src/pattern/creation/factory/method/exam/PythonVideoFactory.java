package pattern.creation.factory.method.exam;

/**
 * @author: haibin li
 * @date: 2019/10/31
 * @description:
 */
public class PythonVideoFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
