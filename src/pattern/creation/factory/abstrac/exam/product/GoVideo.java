package pattern.creation.factory.abstrac.exam.product;

import pattern.creation.factory.abstrac.exam.product.intr.Video;

/**
 * @author: haibin li
 * @date: 2019/11/1
 * @description:
 */
public class GoVideo extends Video {

    @Override
    public void produce() {
        System.out.println("录制Go教程视频");
    }
}
