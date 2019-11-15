package pattern.creation.builder;

/**
 * @author: haibin li
 * @date: 2019/11/13
 * @description: 产品角色
 */
public class Computer {

    //品牌
    private String brand;
    //cpu
    private String cpu;
    //主板
    private String mainBoard;
    //显卡
    private String gpu;
    //硬盘
    private String hardDisk;
    //内存
    private String memory;
    //电源
    private String power;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMainBoard() {
        return mainBoard;
    }

    public void setMainBoard(String mainBoard) {
        this.mainBoard = mainBoard;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", cpu='" + cpu + '\'' +
                ", mainBoard='" + mainBoard + '\'' +
                ", gpu='" + gpu + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                ", memory='" + memory + '\'' +
                ", power='" + power + '\'' +
                '}';
    }
}
