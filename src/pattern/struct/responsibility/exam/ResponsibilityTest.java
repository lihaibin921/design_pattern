package pattern.struct.responsibility.exam;

/**
 * @author: haibin li
 * @date: 2019/10/25
 * @description:
 */
public class ResponsibilityTest {

    /**
     * 请假审批流程
     */
    public static void main(String[] args) {

        Handler zhangsan = new Director("老张");
        Handler lisi = new Manager("老李");
        Handler mayi = new TopManager("老马");

        //创建责任链
        zhangsan.nextHandler = lisi;
        lisi.nextHandler = mayi;

        LeaveRequest li = new LeaveRequest("小李" , 2 , "感冒");
        LeaveRequest zhao = new LeaveRequest("小赵" , 5 , "结婚");
        LeaveRequest shi = new LeaveRequest("小石" , 9 , "旅游");

        boolean result1 = zhangsan.process(li);
        System.out.println("小李假条审批结果:" + result1);

        boolean result2 = zhangsan.process(zhao);
        System.out.println("小赵假条审批结果:" + result2);

        boolean result3 = zhangsan.process(shi);
        System.out.println("小石假条审批结果:" + result3);

        /**
         * 主管:老张 审批 小李 请假 2 天 , 原因: 感冒 审批结果: true
         * 小李假条审批结果:true
         * 主管:老张 审批 小赵 请假 5 天 , 原因: 结婚 审批结果: true
         * 经理:老李 审批 小赵 请假 5 天 , 原因: 结婚 审批结果: true
         * 小赵假条审批结果:true
         * 主管:老张 审批 小石 请假 9 天 , 原因: 旅游 审批结果: true
         * 经理:老李 审批 小石 请假 9 天 , 原因: 旅游 审批结果: true
         * 总经理:老马 审批 小石 请假 9 天 , 原因: 旅游 审批结果: false
         * 小石假条审批结果:false
         *
         * 小石 你请什么假?
         */
    }

}
