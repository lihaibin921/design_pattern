package pattern.creation.builder;

/**
 * @author: haibin li
 * @date: 2019/11/13
 * @description:
 */
public class ASUSComputerBuilder extends Builder {

    @Override
    public void buildBrand() {
        computer.setBrand("打人硕天下第一");
    }

    @Override
    public void buildCPU() {
        computer.setCpu("intel 9900ks");
    }

    @Override
    public void buildMainBoard() {
        computer.setMainBoard("z370");
    }

    @Override
    public void buildGPU() {
        computer.setGpu("2080Ti");
    }

    @Override
    public void buildHardDisk() {
        computer.setHardDisk("随便一块2T");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("黄家戟来4条");
    }

    @Override
    public void buildPower() {
        computer.setPower("这是一块666的电源");
    }
}
