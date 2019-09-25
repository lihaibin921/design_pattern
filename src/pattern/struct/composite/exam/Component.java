package pattern.struct.composite.exam;

/**
 * @author: haibin li
 * @date: 2019/9/25
 * @description: 抽象构建类
 */
public abstract class Component {

    public String getName(){
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

    public void add(Component component){
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void remove(Component component){
        throw new UnsupportedOperationException("不支持移除操作");
    }

    public void print(){
        throw new UnsupportedOperationException("不支持打印操作");
    }

    public String getContent(){
        throw new UnsupportedOperationException("不支持获取内容操作");
    }

}
