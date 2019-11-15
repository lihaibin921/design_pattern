package pattern.creation.builder;

/**
 * @author: haibin li
 * @date: 2019/11/13
 * @description: 指挥者
 */
public class ComputerDirector {

    public Computer construct(Builder builder){
        //逐步构建复杂的计算机对象
        Computer computer;
        builder.buildBrand();
        builder.buildCPU();
        builder.buildMainBoard();
        builder.buildGPU();
        builder.buildHardDisk();
        builder.buildMemory();
        builder.buildPower();
        computer = builder.createComputer();
        return computer;
    }
}
