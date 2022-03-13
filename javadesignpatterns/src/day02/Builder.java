package day02;

/**
 * @description:
 * @create: 2020-11-14-16:23
 * @author: Hey
 */
//抽象建造者
public abstract class Builder {
    protected Player player = new Player();
    public abstract void buildFullPtn();
    public abstract void buildTidyPtn();
    public abstract void buildMemoryPtn();
    public Player getResult(){
        return player;
    }
}
