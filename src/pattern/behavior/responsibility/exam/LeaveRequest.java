package pattern.behavior.responsibility.exam;

/**
 * @author: haibin li
 * @date: 2019/10/25
 * @description: 请假请求
 */
public class LeaveRequest {

    //谁
    private String name;
    //请几天
    private int num;
    //原因
    private String reason;

    public LeaveRequest() {
    }

    public LeaveRequest(String name, int num, String reason) {
        this.name = name;
        this.num = num;
        this.reason = reason;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
