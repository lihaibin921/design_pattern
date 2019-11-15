package pattern.creation.builder;

/**
 * @author: haibin li
 * @date: 2019/11/13
 * @description: 抽象建造者
 */
public abstract class Builder {

    protected Computer computer = new Computer();

    public Computer createComputer(){
        return computer;
    }

    public abstract void buildBrand();

    public abstract void buildCPU();

    public abstract void buildMainBoard();

    public abstract void buildGPU();

    public abstract void buildHardDisk();

    public abstract void buildMemory();

    public abstract void buildPower();

}
