package pattern.struct.proxy.dynamic;

/**
 * @author: haibin li
 * @date: 2020/4/23
 * @description:
 */
public class TargetImpl implements Target{

    @Override
    public void execute() {
        System.out.println("targetImpl execute");
    }
}
