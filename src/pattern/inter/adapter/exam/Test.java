package pattern.inter.adapter.exam;

/**
 * @author: haibin li
 * @date: 2019/9/19
 * @description:
 */
public class Test {

    public static void main(String[] args) {
        Volt110 volt110 = new Adapter();
        System.out.println(volt110.getVolt110());
    }
}
