package pattern.struct.facade.nouse;

/**
 * @author: haibin li
 * @date: 2019/9/24
 * @description: 人
 */
public class Man {

    private String name;

    public void drink(TeaWater teaWater){
        System.out.println(name + " 喝了" + teaWater.getTealeaf().getTeaName());
    }

    public Man() {
    }

    public Man(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
