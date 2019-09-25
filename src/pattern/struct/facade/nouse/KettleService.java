package pattern.struct.facade.nouse;

/**
 * @author: haibin li
 * @date: 2019/9/24
 * @description: 水壶烧水的服务
 */
public class KettleService {

    public void waterBurning(Man man , Water water , int burnTime){
        //烧水计算水温
        int finalTemperature = Math.min(100 , burnTime * 20);
        water.setTemperature(finalTemperature);
        System.out.println(man.getName() + " 烧水" + burnTime + " 分钟 ，水温" + finalTemperature);
    }

}
