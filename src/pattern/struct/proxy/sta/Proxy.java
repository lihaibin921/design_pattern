package pattern.struct.proxy.sta;

/**
 * @author: haibin li
 * @date: 2020/4/23
 * @description:
 */
public class Proxy implements Target {

    private Target target;

    public Proxy(Target target) {
        this.target = target;
    }

    @Override
    public void execute() {
        System.out.println("proxy begin");

        target.execute();

        System.out.println("proxy end");
    }
}
