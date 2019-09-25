package pattern.struct.composite.exam;

/**
 * @author: haibin li
 * @date: 2019/9/25
 * @description:
 */
public class CompositeTest {

    /**
     * 这里是简单模拟一个文件树 , 包含文件(叶子节点)和文件夹(枝干节点)
     * 与传统树的实现不同, 叶子节点和枝干节继承了相同的抽象类(或接口) ,
     * 这使得客户端调用时不需要对叶子和枝干区别对待, 一致性处理就可以 , 使程序变得简单
     * 这里用的是透明组合模式
     */
    public static void main(String[] args) {
        Folder dsFolder = new Folder("设计模式资料");
        File node1 = new File("组合模式笔记.md" , "组合模式组合多个对象形成树形结构以表示具有 \"整体—部分\" 关系的层次结构");
        File node2 = new File("工厂方法模式.md", "工厂方法模式定义一个用于创建对象的接口，让子类决定将哪一个类实例化。");
        dsFolder.add(node1);
        dsFolder.add(node2);

        Folder codeFolder = new Folder("样例代码");
        File readme = new File("README.md", "# 设计模式示例代码项目");
        Folder srcFolder = new Folder("src");
        File code1 = new File("组合模式示例.java", "这是组合模式的示例代码");

        srcFolder.add(code1);
        codeFolder.add(readme);
        codeFolder.add(srcFolder);
        dsFolder.add(codeFolder);

        dsFolder.print();
    }

}
