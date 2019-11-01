package pattern.creation.factory.abstrac.exam.fact;

import pattern.creation.factory.abstrac.exam.fact.intr.CourseFactory;
import pattern.creation.factory.abstrac.exam.product.GoArticle;
import pattern.creation.factory.abstrac.exam.product.GoPicture;
import pattern.creation.factory.abstrac.exam.product.GoVideo;
import pattern.creation.factory.abstrac.exam.product.intr.Article;
import pattern.creation.factory.abstrac.exam.product.intr.Picture;
import pattern.creation.factory.abstrac.exam.product.intr.Video;

/**
 * @author: haibin li
 * @date: 2019/11/1
 * @description:
 */
public class GoCourseFactory implements CourseFactory {

    @Override
    public Video getVideo() {
        return new GoVideo();
    }

    @Override
    public Article getArticle() {
        return new GoArticle();
    }

    @Override
    public Picture getPicture() {
        return new GoPicture();
    }
}
