package pattern.struct.facade;

import org.junit.Test;
import pattern.struct.facade.exam.TeaHouseFacade;
import pattern.struct.facade.nouse.KettleService;
import pattern.struct.facade.nouse.Man;
import pattern.struct.facade.nouse.TeaMakerService;
import pattern.struct.facade.nouse.TeaWater;
import pattern.struct.facade.nouse.Tealeaf;
import pattern.struct.facade.nouse.Water;

/**
 * @author: haibin li
 * @date: 2019/9/24
 * @description:
 */
public class FacadeTest {

    /**
     * 这里演示未使用外观模式的场景
     * 张三自己烧水,泡茶,喝茶
     */
    public static void main(String[] args) {
        Man zhang = new Man("张三");
        KettleService kettleService = new KettleService();
        TeaMakerService teaMakerService = new TeaMakerService();

        //拿来水和茶叶
        Water water = new Water();
        Tealeaf tealeaf = new Tealeaf("龙井");
        //烧水
        kettleService.waterBurning(zhang , water , 5);
        //泡茶
        TeaWater teaWater = teaMakerService.makeTea(zhang, water, tealeaf);
        //喝茶
        zhang.drink(teaWater);

        //----------
        //以上就是整个流程, 再来李四要烧水泡茶喝茶也是一样的流程
    }

    /**
     * 这里演示使用外观模式的场景
     * 张三,李四,王二麻子只需要点茶就行
     * 烧水,泡茶的过程都由茶馆店小二完成, 顾客无需与诸如茶叶, 水等对象直接交互 ,
     * 只考虑跟茶馆这个外观类交互即可
     */
    @Test
    public void testFacade(){
        //茶馆开张
        Man waiter = new Man("店小二");
        KettleService kettleService = new KettleService();
        TeaMakerService teaMakerService = new TeaMakerService();
        TeaHouseFacade teaHouseFacade = new TeaHouseFacade(waiter , kettleService , teaMakerService);
        System.out.println("=================");

        //张三来喝1号套餐
        Man zhang = new Man("张三");
        TeaWater teaWater = teaHouseFacade.makeTea(1);
        zhang.drink(teaWater);
        System.out.println("------------------");

        //李四喝2号套餐
        Man li = new Man("李四");
        TeaWater teaWater2 = teaHouseFacade.makeTea(2);
        li.drink(teaWater2);
        System.out.println("------------------");

        //王二麻子要了个默认套餐
        Man wang = new Man("王二麻子");
        TeaWater teaWater3 = teaHouseFacade.makeTea(0);
        wang.drink(teaWater3);
        System.out.println("------------------");
    }

}
