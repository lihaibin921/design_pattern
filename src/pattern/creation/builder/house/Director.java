package pattern.creation.builder.house;

/**
 * @author: haibin li
 * @date: 2019/11/14
 * @description: 指挥者
 */
public class Director {

    public Building direct(Builder builder){
        System.out.println("====工程项目启动====");
        builder.buildBasement();
        builder.buildWall();
        builder.buildRoof();
        System.out.println("====工程项目竣工====");
        return builder.getBuilding();
    }

}
