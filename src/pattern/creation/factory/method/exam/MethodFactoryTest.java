package pattern.creation.factory.method.exam;

/**
 * @author: haibin li
 * @date: 2019/10/31
 * @description:
 */
public class MethodFactoryTest {

    public static void main(String[] args) {
        VideoFactory javaFactory = new JavaVideoFactory();
        VideoFactory pythonFactory = new PythonVideoFactory();

        Video javaVideo = javaFactory.getVideo();
        javaVideo.produce();

        Video pythonVideo = pythonFactory.getVideo();
        pythonVideo.produce();


    }

}
