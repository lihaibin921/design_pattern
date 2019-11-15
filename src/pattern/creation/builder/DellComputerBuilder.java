package pattern.creation.builder;

/**
 * @author: haibin li
 * @date: 2019/11/13
 * @description: 具体建造者 戴尔电脑
 */
public class DellComputerBuilder extends Builder {

    @Override
    public void buildBrand() {
        computer.setBrand("戴尔天下第n");
    }

    @Override
    public void buildCPU() {
        computer.setCpu("一块AMD好吧 , AMD3900X");
    }

    @Override
    public void buildMainBoard() {
        computer.setMainBoard("主板必须X570啊");
    }

    @Override
    public void buildGPU() {
        computer.setGpu("AMD全家桶, 给我来一块5700");
    }

    @Override
    public void buildHardDisk() {
        computer.setHardDisk("西数黑盘1个T好吧");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("皇亲国戚戟天下第一");
    }

    @Override
    public void buildPower() {
        computer.setPower("随便来一块电源");
    }
}
