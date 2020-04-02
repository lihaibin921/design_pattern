package pattern.creation.single;

/**
 * @author: haibin li
 * @date: 2020/4/2
 * @description: 饿汉模式(饿汉饿汉上来就干) 类加载时就初始化 线程安全
 */
public class Singleton {

    private static final Singleton SINGLETON = new Singleton();

    private Singleton(){}

    public static Singleton newInstance(){
        return SINGLETON;
    }

}
