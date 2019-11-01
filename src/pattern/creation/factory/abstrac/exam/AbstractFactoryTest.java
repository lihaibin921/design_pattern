package pattern.creation.factory.abstrac.exam;

import pattern.creation.factory.abstrac.exam.fact.GoCourseFactory;
import pattern.creation.factory.abstrac.exam.fact.JavaCourseFactory;
import pattern.creation.factory.abstrac.exam.fact.PythonCourseFactory;
import pattern.creation.factory.abstrac.exam.fact.intr.CourseFactory;
import pattern.creation.factory.abstrac.exam.product.intr.Article;
import pattern.creation.factory.abstrac.exam.product.intr.Picture;
import pattern.creation.factory.abstrac.exam.product.intr.Video;

/**
 * @author: haibin li
 * @date: 2019/10/31
 * @description:
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        Picture picture = courseFactory.getPicture();
        video.produce();
        article.produce();
        picture.produce();

        courseFactory = new PythonCourseFactory();
        video = courseFactory.getVideo();
        article = courseFactory.getArticle();
        picture = courseFactory.getPicture();
        video.produce();
        article.produce();
        picture.produce();

        courseFactory = new GoCourseFactory();
        video = courseFactory.getVideo();
        article = courseFactory.getArticle();
        picture = courseFactory.getPicture();
        video.produce();
        article.produce();
        picture.produce();
    }

}
