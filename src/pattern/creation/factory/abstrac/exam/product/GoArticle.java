package pattern.creation.factory.abstrac.exam.product;

import pattern.creation.factory.abstrac.exam.product.intr.Article;

/**
 * @author: haibin li
 * @date: 2019/11/1
 * @description:
 */
public class GoArticle extends Article {

    @Override
    public void produce() {
        System.out.println("编写一篇Go语言教程");
    }
}
