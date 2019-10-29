package pattern.behavior.responsibility.exam;

import java.util.Random;

/**
 * @author: haibin li
 * @date: 2019/10/25
 * @description: 总经理处理者
 */
public class TopManager extends Handler {

    public TopManager(String name) {
        super(name);
    }

    @Override
    public boolean process(LeaveRequest leaveRequest) {

        //模拟审批操作
        boolean result = (new Random().nextInt(10)) > 3;
        System.out.println("总经理:" + name + " 审批 " + leaveRequest.getName() + " 请假 " +
                leaveRequest.getNum() + " 天 , 原因: " + leaveRequest.getReason() +
                " 审批结果: " + result);

        //总经理说的算
        return result;
    }
}
