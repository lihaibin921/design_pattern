package pattern.behavior.responsibility.exam;

import java.util.Random;

/**
 * @author: haibin li
 * @date: 2019/10/25
 * @description: 主管处理者
 */
public class Director extends Handler{

    public Director(String name) {
        super(name);
    }

    /**
     * 小于三天假 主管可以直接审批通过
     * 否则需要请示上级经理
     */
    @Override
    public boolean process(LeaveRequest leaveRequest) {
        int day = 3;

        //模拟审批操作
        boolean result = (new Random().nextInt(10)) > 3;
        System.out.println("主管:" + name + " 审批 " + leaveRequest.getName() + " 请假 " +
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
