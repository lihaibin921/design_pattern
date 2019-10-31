package pattern.creation.factory.simple.exam;

/**
 * @author: haibin li
 * @date: 2019/10/31
 * @description:
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        Video java = VideoFactory.getVideo("java");
        if (java != null) {
            java.produce();
        }

        Video video = VideoFactory.getVideo(PythonVideo.class);
        if (video != null) {
            video.produce();
        }
    }

}
