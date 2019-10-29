package pattern.behavior.responsibility.exam;

/**
 * @author: haibin li
 * @date: 2019/10/25
 * @description:
 */
public abstract class Handler {
    /** 处理者姓名 */
    protected String name;
    /** 下一个处理者 */
    protected Handler nextHandler;

    public Handler() {
    }

    public Handler(String name) {
        this.name = name;
    }

    public abstract boolean process(LeaveRequest leaveRequest);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
