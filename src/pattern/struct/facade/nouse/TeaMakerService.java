package pattern.struct.facade.nouse;

/**
 * @author: haibin li
 * @date: 2019/9/24
 * @description: 泡茶服务
 */
public class TeaMakerService {

    public TeaWater makeTea(Man man , Water water , Tealeaf tealeaf){
        TeaWater teaWater = new TeaWater(water , tealeaf);
        System.out.println(man.getName() + " 泡了" + teaWater);
        return teaWater;
    }

}
