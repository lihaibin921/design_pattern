package pattern.creation.factory.abstrac.exam.product;

import pattern.creation.factory.abstrac.exam.product.intr.Article;

/**
 * @author: haibin li
 * @date: 2019/10/31
 * @description:
 */
public class PythonArticle extends Article {

    @Override
    public void produce() {
        System.out.println("编写python教程文章");
    }
}
