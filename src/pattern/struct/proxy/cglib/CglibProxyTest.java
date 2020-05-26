package pattern.struct.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author: haibin li
 * @date: 2020/4/23
 * @description:
 */
public class CglibProxyTest {

    public static void main(String[] args) {
        Target target = new Target();
        Target proxyTarget = (Target)CglibProxyTest.createProxy(Target.class);

        target.execute();
        System.out.println("------------");
        proxyTarget.execute();

    }

    private static Object createProxy(Class targetClass){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(targetClass);
        enhancer.setCallback(new MyMethodInterceptor());
        return enhancer.create();
    }

}
