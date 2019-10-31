package pattern.creation.factory.method.exam;

/**
 * @author: haibin li
 * @date: 2019/10/31
 * @description: 具体产品类
 */
public class JavaVideo extends Video {

    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
