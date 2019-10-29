package pattern.struct.responsibility.exam;

import java.util.Date;
import java.util.Random;

/**
 * @author: haibin li
 * @date: 2019/10/25
 * @description: 经理处理者
 */
public class Manager extends Handler{

    public Manager(String name) {
        super(name);
    }

    /**
     * 小于七天假 经理可以直接审批通过
     * 否则需要请示上级经理
     */
    @Override
    public boolean process(LeaveRequest leaveRequest) {
        int day = 7;

        //模拟审批操作
        boolean result = (new Random().nextInt(10)) > 3;
        System.out.println("经理:" + name + " 审批 " + leaveRequest.getName() + " 请假 " +
                leaveRequest.getNum() + " 天 , 原因: " + leaveRequest.getReason() +
                " 审批结果: " + result);

        if (!result){
            return false;
        }else if (leaveRequest.getNum() <= day){
            return true;
        }else {
            return nextHandler.process(leaveRequest);
        }
    }
}
