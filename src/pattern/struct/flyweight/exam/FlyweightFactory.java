package pattern.struct.flyweight.exam;

import java.util.HashMap;

/**
 * @author: haibin li
 * @date: 2019/11/1
 * @description: 享元工厂类
 */
public class FlyweightFactory {

    private static HashMap<String , FlyWeight> pool = new HashMap<>();

    public static FlyWeight getFlyweight(String key){
        FlyWeight flyWeight;

        if (pool.containsKey(key)){
            flyWeight = pool.get(key);
            System.out.println("池中有:" + key + " 直接取出");
        }else {
            flyWeight = new ConcreteFlyweight(key);
            pool.put(key , flyWeight);
            System.out.println("池中无:" + key + " 创建一个");
        }
        return flyWeight;
    }

}
