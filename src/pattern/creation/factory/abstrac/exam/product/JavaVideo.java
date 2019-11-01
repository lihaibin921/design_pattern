package pattern.creation.factory.abstrac.exam.product;

import pattern.creation.factory.abstrac.exam.product.intr.Video;

/**
 * @author: haibin li
 * @date: 2019/10/31
 * @description:
 */
public class JavaVideo extends Video {

    @Override
    public void produce() {
        System.out.println("录制java教程视频");
    }
}
