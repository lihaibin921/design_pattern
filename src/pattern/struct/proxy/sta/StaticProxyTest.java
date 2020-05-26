package pattern.struct.proxy.sta;

/**
 * @author: haibin li
 * @date: 2020/4/23
 * @description:
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        Target target = new TargetImpl();
        target.execute();

        System.out.println("-------------");

        Proxy proxy = new Proxy(target);
        proxy.execute();
    }

}
