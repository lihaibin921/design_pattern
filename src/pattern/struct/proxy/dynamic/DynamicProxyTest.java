package pattern.struct.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author: haibin li
 * @date: 2020/4/23
 * @description:
 */
public class DynamicProxyTest {

    public static void main(String[] args) {
        Target target = new TargetImpl();
        target.execute();

        System.out.println("-----------");

        DynamicProxyHandler handler = new DynamicProxyHandler(target);
        Target proxyTarget = (Target) Proxy.newProxyInstance(TargetImpl.class.getClassLoader(),
                TargetImpl.class.getInterfaces(), handler);
        proxyTarget.execute();

        System.out.println("-----------");

        Target2 target2 = new Target2Impl();
        target2.run();

        System.out.println("-----------");
        InvocationHandler handler2 = new DynamicProxyHandler(target2);
        Target2 proxyTarget2 = (Target2) Proxy.newProxyInstance(target2.getClass().getClassLoader() , target2.getClass().getInterfaces() , handler2);
        proxyTarget2.run();
    }

}
