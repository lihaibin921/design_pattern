package pattern.creation.builder.house;

/**
 * @author: haibin li
 * @date: 2019/11/14
 * @description: 具体建造者
 */
public class VillaBuilder implements Builder{

    private Building villa;

    public VillaBuilder() {
        villa = new Building();
    }

    @Override
    public void buildBasement() {
        System.out.println("挖地基，部署管道、线缆，水泥加固，搭建围墙、花园。");
        villa.setBasement("╬╬╬╬╬╬\n");
    }

    @Override
    public void buildWall() {
        System.out.println("搭建木质框架，石膏板封墙并粉饰内外墙。");
        villa.setWall("｜田｜田 田|\n");
    }

    @Override
    public void buildRoof() {
        System.out.println("建造木质屋顶、阁楼，安装烟囱，做好防水。");
        villa.setRoof("╱◥███◣\n");
    }

    @Override
    public Building getBuilding() {
        return villa;
    }
}
