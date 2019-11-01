package pattern.creation.factory.abstrac.exam.fact;

import pattern.creation.factory.abstrac.exam.fact.intr.CourseFactory;
import pattern.creation.factory.abstrac.exam.product.PythonArticle;
import pattern.creation.factory.abstrac.exam.product.PythonPicture;
import pattern.creation.factory.abstrac.exam.product.PythonVideo;
import pattern.creation.factory.abstrac.exam.product.intr.Article;
import pattern.creation.factory.abstrac.exam.product.intr.Picture;
import pattern.creation.factory.abstrac.exam.product.intr.Video;

/**
 * @author: haibin li
 * @date: 2019/10/31
 * @description:
 */
public class PythonCourseFactory implements CourseFactory {

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }

    @Override
    public Picture getPicture() {
        return new PythonPicture();
    }
}
