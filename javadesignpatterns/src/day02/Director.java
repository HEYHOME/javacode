package day02;

/**
 * @description:
 * @create: 2020-11-14-16:27
 * @author: Hey
 */

//指挥者
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder=builder;
    }

    public Player construct(){
        builder.buildFullPtn();
        builder.buildTidyPtn();
        builder.buildMemoryPtn();
        return builder.getResult();
    }
}
