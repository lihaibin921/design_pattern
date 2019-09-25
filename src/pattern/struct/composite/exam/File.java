package pattern.struct.composite.exam;

/**
 * @author: haibin li
 * @date: 2019/9/25
 * @description: 文件类
 */
public class File extends Component{

    private String name;

    private String content;

    public File() {
    }

    public File(String name, String content) {
        this.name = name;
        this.content = content;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(this.name);
    }

    @Override
    public String getContent() {
        return this.content;
    }
}
