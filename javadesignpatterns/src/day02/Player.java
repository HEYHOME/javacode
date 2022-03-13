package day02;

/**
 * @description:
 * @create: 2020-11-14-16:20
 * @author: Hey
 */
public class Player {
    private String fullPattern;
    private String tidyPattern;
    private String memoryPattern;

    public void setFullPattern(String fullPattern) {
        this.fullPattern = fullPattern;
    }

    public void setTidyPattern(String tidyPattern) {
        this.tidyPattern = tidyPattern;
    }

    public void setMemoryPattern(String memoryPattern) {
        this.memoryPattern = memoryPattern;
    }

    public void show() {
        System.out.println("完整模式='" + fullPattern + '\'' +
                ", 精简模式='" + tidyPattern + '\'' +
                ", 记忆模式='" + memoryPattern+'\'');
    }
}
