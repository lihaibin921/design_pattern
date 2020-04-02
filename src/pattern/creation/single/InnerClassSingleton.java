package pattern.creation.single;

/**
 * @author: haibin li
 * @date: 2020/4/2
 * @description: 静态内部类方式, 对饿汉模式升级, 静态内部类只有外部类调用时才加载
 */
public class InnerClassSingleton {

    static {
        System.out.println("singleton class loading");
    }

    private InnerClassSingleton(){}

    private static class Inner{
        static {
            System.out.println("singleton inner class loading");
        }

        private static final InnerClassSingleton SINGLETON = new InnerClassSingleton();
    }

    public static InnerClassSingleton newInstance(){
        return Inner.SINGLETON;
    }

    public static void normalFunc(){
        System.out.println("normal func");
    }


}
