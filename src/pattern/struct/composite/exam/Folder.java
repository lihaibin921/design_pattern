package pattern.struct.composite.exam;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: haibin li
 * @date: 2019/9/25
 * @description: 文件夹类
 */
public class Folder extends Component{

    private String name;

    private List<Component> componentList = new ArrayList<>();

    private Integer level;

    public Folder() {
    }

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void add(Component component) {
        this.componentList.add(component);
    }

    @Override
    public void remove(Component component) {
        this.componentList.remove(component);
    }

    @Override
    public void print() {
        System.out.println(this.name);
        if (this.level == null){
            this.level = 1;
        }

        String prefix = "";
        for (int i = 0; i < this.level; i ++){
            prefix += "\t- ";
        }

        for (Component component: this.componentList){
            if (component instanceof Folder){
                ((Folder) component).level = this.level + 1;
            }
            System.out.print(prefix);
            component.print();
        }
        this.level = null;
    }
}
