package pattern.struct.proxy.cglib;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @author: haibin li
 * @date: 2020/4/23
 * @description:
 */
public class MyMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy)
            throws Throwable {

        System.out.println("begin proxy");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("end proxy");

        return result;
    }
}
