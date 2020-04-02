package pattern.creation.single;

/**
 * @author: haibin li
 * @date: 2020/4/2
 * @description: 懒汉模式(懒汉懒汉懒着吃饭) 要的时候在创建 线程不安全
 *              直接方法加锁的懒汉模式, 线程安全, 但是并发性能差
 */
public class LazyManSingleton {

    private static LazyManSingleton singleton;

    private LazyManSingleton(){}

    public static LazyManSingleton newInstance(){
        if (singleton == null){
            singleton = new LazyManSingleton();
        }
        return singleton;
    }

    public static synchronized LazyManSingleton newInstance2(){
        if (singleton == null){
            singleton = new LazyManSingleton();
        }
        return singleton;
    }

}
