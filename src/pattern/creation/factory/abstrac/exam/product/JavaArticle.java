package pattern.creation.factory.abstrac.exam.product;

import pattern.creation.factory.abstrac.exam.product.intr.Article;

/**
 * @author: haibin li
 * @date: 2019/10/31
 * @description: 具体产品类
 */
public class JavaArticle  extends Article {

    @Override
    public void produce() {
        System.out.println("编写java教程文章");
    }
}
