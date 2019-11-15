package pattern.creation.builder.house;

/**
 * @author: haibin li
 * @date: 2019/11/14
 * @description: 抽象建造者
 */
public interface Builder {

    void buildBasement();

    void buildWall();

    void buildRoof();

    Building getBuilding();

}
