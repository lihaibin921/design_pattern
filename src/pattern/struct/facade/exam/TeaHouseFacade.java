package pattern.struct.facade.exam;

import pattern.struct.facade.nouse.KettleService;
import pattern.struct.facade.nouse.Man;
import pattern.struct.facade.nouse.TeaMakerService;
import pattern.struct.facade.nouse.TeaWater;
import pattern.struct.facade.nouse.Tealeaf;
import pattern.struct.facade.nouse.Water;

/**
 * @author: haibin li
 * @date: 2019/9/24
 * @description: 茶馆提供统一的门面 , 客户只需要选择套餐即可
 */
public class TeaHouseFacade {

    private Man waiter;

    private KettleService kettleService;

    private TeaMakerService teaMakerService;

    public TeaHouseFacade(Man waiter, KettleService kettleService,
            TeaMakerService teaMakerService) {
        this.waiter = waiter;
        this.kettleService = kettleService;
        this.teaMakerService = teaMakerService;
    }

    /** num 套餐编号 **/
    public TeaWater makeTea(int num) {
        TeaWater teaWater = new TeaWater();
        Water water = new Water();
        Tealeaf tealeaf;
        switch (num) {
            case 1:
                tealeaf = new Tealeaf("龙井");
                kettleService.waterBurning(waiter, water, 3);
                break;
            case 2:
                tealeaf = new Tealeaf("普洱");
                water.setCapacity(8);
                kettleService.waterBurning(waiter, water, 4);
                break;
            default:
                tealeaf = new Tealeaf("红茶");
                water.setCapacity(15);
                kettleService.waterBurning(waiter, water, 5);

        }
        teaWater = teaMakerService.makeTea(waiter, water, tealeaf);
        return teaWater;
    }
}
