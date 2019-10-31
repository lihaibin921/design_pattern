package pattern.creation.factory.simple.exam;

/**
 * @author: haibin li
 * @date: 2019/10/31
 * @description: 简单工厂类
 */
public class VideoFactory {

    /**
     * if-else判断 创建对应对象
     */
    public static Video getVideo(String type) {
        if ("java".equals(type)) {
            return new JavaVideo();
        } else if ("python".equals(type)) {
            return new PythonVideo();
        }
        return null;
    }

    /**
     * 使用反射创建对象
     */
    public static Video getVideo(Class c) {
        Video video = null;
        try {
            if (c != null) {
                video = (Video) c.newInstance();
            }
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return video;
    }

}
