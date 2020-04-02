package pattern.creation.single;

/**
 * @author: haibin li
 * @date: 2020/4/2
 * @description: 对直接方法加锁的懒汉模式的升级
 */
public class DoubleLockSingleton {

    //实例必须加关键字volatile
    private static volatile DoubleLockSingleton singleton;

    private DoubleLockSingleton(){}

    public static DoubleLockSingleton newInstance(){
        //检验1 如果已经有实例, 就不需要获取锁, 提高并发量
        if (singleton == null){
            synchronized (DoubleLockSingleton.class){
                //检验2 没有检验2时 , 多个线程通过检验1 , 会产生多个实力
                if (singleton == null){
                    //实例加volatile作用: new操作并非原子操作, jvm会优化指令排序
                    //该语句分3步 分配内存->初始化->引用指向对象 2,3步存在重排序可能
                    //可能导值赋值发生在实例化前 , volatile防止指令重排序
                    singleton = new DoubleLockSingleton();
                }
            }
        }
        return singleton;
    }
}
