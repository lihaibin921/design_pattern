package pattern.creation.factory.abstrac.exam.fact;

import pattern.creation.factory.abstrac.exam.fact.intr.CourseFactory;
import pattern.creation.factory.abstrac.exam.product.JavaArticle;
import pattern.creation.factory.abstrac.exam.product.JavaPicture;
import pattern.creation.factory.abstrac.exam.product.JavaVideo;
import pattern.creation.factory.abstrac.exam.product.intr.Article;
import pattern.creation.factory.abstrac.exam.product.intr.Picture;
import pattern.creation.factory.abstrac.exam.product.intr.Video;

/**
 * @author: haibin li
 * @date: 2019/10/31
 * @description: 具体工厂
 */
public class JavaCourseFactory implements CourseFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }

    @Override
    public Picture getPicture() {
        return new JavaPicture();
    }
}
