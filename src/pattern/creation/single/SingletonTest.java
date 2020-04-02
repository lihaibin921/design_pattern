package pattern.creation.single;

import org.junit.Test;

/**
 * @author: haibin li
 * @date: 2020/4/2
 * @description:
 */
public class SingletonTest {

    @Test
    public void testSingleton(){
        Singleton singleton = Singleton.newInstance();
        Singleton singleton2 = Singleton.newInstance();
        System.out.println(singleton == singleton2);
    }

    @Test
    public void testInnerClassSingleton(){
        InnerClassSingleton.normalFunc();

        InnerClassSingleton singleton1 = InnerClassSingleton.newInstance();
        InnerClassSingleton singleton2 = InnerClassSingleton.newInstance();

        System.out.println(singleton1 == singleton2);
    }

}
