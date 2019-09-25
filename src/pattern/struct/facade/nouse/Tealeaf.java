package pattern.struct.facade.nouse;

/**
 * @author: haibin li
 * @date: 2019/9/24
 * @description: 茶叶
 */
public class Tealeaf {

    private String teaName;

    //...

    public Tealeaf() {
    }

    public Tealeaf(String teaName) {
        this.teaName = teaName;
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }
}
