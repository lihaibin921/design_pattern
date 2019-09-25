package pattern.struct.facade.nouse;

/**
 * @author: haibin li
 * @date: 2019/9/24
 * @description: 茶水
 */
public class TeaWater extends Water{

    private Tealeaf tealeaf;

    public TeaWater() {
    }

    public TeaWater(Water water , Tealeaf tealeaf){
        super(water.getTemperature() , water.getCapacity());
        this.tealeaf = tealeaf;
    }

    @Override
    public String toString() {
        return "一壶容量:" + getCapacity() +
                ",温度:" + getTemperature() +
                " 的" + tealeaf.getTeaName();
    }

    public Tealeaf getTealeaf() {
        return tealeaf;
    }

    public void setTealeaf(Tealeaf tealeaf) {
        this.tealeaf = tealeaf;
    }
}
