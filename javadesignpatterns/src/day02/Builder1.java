package day02;

/**
 * @description:
 * @create: 2020-11-14-16:25
 * @author: Hey
 */
public class Builder1 extends Builder {

    @Override
    public void buildFullPtn() {
        player.setFullPattern("显示菜单,播放列表,主窗口,控制条");
    }

    @Override
    public void buildTidyPtn() {
        player.setTidyPattern("主窗口和控制条");
    }

    @Override
    public void buildMemoryPtn() {
        player.setMemoryPattern("主窗口,控制条和收藏列表");
    }
}
