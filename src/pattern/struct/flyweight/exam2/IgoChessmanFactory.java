package pattern.struct.flyweight.exam2;

import java.util.HashMap;

/**
 * @author: haibin li
 * @date: 2019/11/1
 * @description: 享元工厂类
 */
public class IgoChessmanFactory {

    /** 享元池 */
    private static HashMap<String , IgoChessman> ht;

    static {
        System.out.println("开始执行static块......");
        ht = new HashMap<>();
        IgoChessman white = new WhiteChessman();
        IgoChessman black = new BlackChessman();
        ht.put("白" , white);
        ht.put("黑" , black);
        System.out.println("结束执行static块......");
    }

    /** 工厂方法返回享元对象 */
    public static IgoChessman getIgoChessman(String name){
        return ht.get(name);
    }
}

