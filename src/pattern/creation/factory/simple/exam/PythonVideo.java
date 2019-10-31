package pattern.creation.factory.simple.exam;

/**
 * @author: haibin li
 * @date: 2019/10/31
 * @description: 具体产品类
 */
public class PythonVideo extends Video {

    @Override
    public void produce() {
        System.out.println("录制python课程视频");
    }
}
