package pattern.creation.builder;

/**
 * @author: haibin li
 * @date: 2019/11/13
 * @description:
 */
public class Test {

    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();
        Computer asusComputer = director.construct(new ASUSComputerBuilder());

        Computer dellComputer = director.construct(new DellComputerBuilder());
        System.out.println(asusComputer);
        System.out.println(dellComputer);
    }

}
