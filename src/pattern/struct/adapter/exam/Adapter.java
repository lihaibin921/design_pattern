package pattern.struct.adapter.exam;

/**
 * @author: haibin li
 * @date: 2019/9/17
 * @description: 适配器
 */
public class Adapter extends Volt220 implements Volt110 {

    @Override
    public Integer getVolt110() {
        Integer volt = super.getVolt220();
        //----------将220V -> 110V 的适配过程
        return volt / 2;
    }
}
