package pattern.creation.factory.abstrac.exam.fact.intr;

import pattern.creation.factory.abstrac.exam.product.intr.Article;
import pattern.creation.factory.abstrac.exam.product.intr.Picture;
import pattern.creation.factory.abstrac.exam.product.intr.Video;

/**
 * @author: haibin li
 * @date: 2019/10/31
 * @description: 抽象工厂
 */
public interface CourseFactory {

    Video getVideo();

    Article getArticle();

    Picture getPicture();

}
