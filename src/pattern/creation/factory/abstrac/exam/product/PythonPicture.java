package pattern.creation.factory.abstrac.exam.product;

import pattern.creation.factory.abstrac.exam.product.intr.Picture;

/**
 * @author: haibin li
 * @date: 2019/11/1
 * @description:
 */
public class PythonPicture extends Picture {

    @Override
    public void produce() {
        System.out.println("截取一张python代码图片");
    }
}
