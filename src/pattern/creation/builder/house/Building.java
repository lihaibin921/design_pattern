package pattern.creation.builder.house;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: haibin li
 * @date: 2019/11/14
 * @description: 产品: 房子
 */
public class Building {
    //简单模拟房子有的各个成员
    private List<String> buildingComponents = new ArrayList<>();

    //地基
    public void setBasement(String basement){
        this.buildingComponents.add(basement);
    }

    //墙体
    public void setWall(String wall){
        this.buildingComponents.add(wall);
    }

    //房顶
    public void setRoof(String roof){
        this.buildingComponents.add(roof);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = buildingComponents.size() - 1 ; i >= 0; i--){
            str.append(buildingComponents.get(i));
        }
        return str.toString();
    }
}
