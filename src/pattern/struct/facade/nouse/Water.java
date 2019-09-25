package pattern.struct.facade.nouse;

/**
 * @author: haibin li
 * @date: 2019/9/24
 * @description: 泡茶需要的水
 */
public class Water {
    /** 水温 **/
    private int temperature;
    /** 体积 **/
    private int capacity;

    public Water() {
        this.temperature = 20;
        this.capacity = 10;
    }

    public Water(int temperature, int capacity) {
        this.temperature = temperature;
        this.capacity = capacity;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
