package pattern.creation.builder.house;

/**
 * @author: haibin li
 * @date: 2019/11/14
 * @description: 具体建造者 公寓
 */
public class ApartmentBuilder implements Builder {

    private Building apartment;

    public ApartmentBuilder() {
        apartment = new Building();
    }

    @Override
    public void buildBasement() {
        System.out.println("深挖地基，修建地下车库，部署管道、线缆、风道。");
        apartment.setBasement("╚══════╝\n");
    }

    @Override
    public void buildWall() {
        System.out.println("搭建多层建筑框架，建造电梯井，钢筋混凝土浇灌。");
        // 此处假设固定8层
        for (int i = 0; i < 8; i++) {
            apartment.setWall("║ □ □ □ □ ║\n");
        }
    }

    @Override
    public void buildRoof() {
        System.out.println("封顶，部署通风井，做防水层，保温层。");
        apartment.setRoof("╔══════╗\n");
    }

    @Override
    public Building getBuilding() {
        return apartment;
    }
}
