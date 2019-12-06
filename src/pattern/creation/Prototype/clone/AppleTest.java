package pattern.creation.Prototype.clone;

/**
 * @author: haibin li
 * @date: 2019/11/27
 * @description:
 */
public class AppleTest {

    public static void main(String[] args) throws Exception{
        Apple apple = new Apple();
        apple.setColor("red");
        apple.setName("富士");
        apple.setSize(300);
        apple.setPrice(2);
        Apple cloneApple = (Apple)apple.clone();
        System.out.println(apple);
        System.out.println(cloneApple);
        System.out.println(apple == cloneApple);
        System.out.println(apple.equals(cloneApple));

        cloneApple.setName("花牛");
        System.out.println(apple);
        System.out.println(cloneApple);
    }

}
