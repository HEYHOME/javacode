package recursion;

/**
 * @description: 八皇后
 * @create: 2020-11-18-21:48
 * @author: Hey
 */
/*
    思路:
        每下一个皇后都要保证与该行之前的所有行不冲突,
        即该行之前的每一列每一个对角线没有出现皇后.
        不需要判断每一行,因为该代码每一行只能放一个.
        用queen数组来存储每一个皇后的坐标,
        queen[x]=y:表示在第x行第y列有一个皇后.

        1.使用for循环遍历每一列,在每一次遍历中递归每一行.
        每一次递归结束都必须重置皇后的位置
        2.在for循环遍历中判断当前的皇后是否与之前放置的皇后出现冲突,
        若出现冲突,则继续判断放在下一列会不会出现冲突;若未出现冲突,
        则当遍历到最后一行时统计摆法,并重置皇后的位置.
 */
public class EightQueen {
    int[] queen = new int[8];
    private static int count=0;

    public static void main(String[] args) {
        EightQueen eq = new EightQueen();
        eq.eightQueen(0);
        System.out.println(count);
    }

    public void eightQueen(int row){
        for (int col = 0; col < 8; col++) {
            if (check(row,col)){
                queen[row] = col;  // 不冲突,以行为下标的数组记录列数
                // 如果最后一行不冲突,则有了一个正确的摆法
                if (row == 7) {
                    count++;  // 统计摆法
                    queen[row] = 0;
                    return;
                }
                // 继续判断下一个皇后的摆法,递归
                eightQueen(row+1);
                // 不管成功还是失败,该位置都要重新置0,以便重复使用
                queen[row] = 0;
            }
        }
    }

    private boolean check(int row, int col) {
        // 遍历该行之前的所有行
        for (int index = 0; index < row; index++) {
            int data = queen[index];
            // 如果在同一列,出现冲突
            if (data == col) {
                return false;
            }
            // 如果当前位置的右上方有皇后,出现冲突
            if (index + data == row + col) {
                return false;
            }
            // 如果当前位置的左上方有皇后,出现冲突
            if (index - data == row - col) {
                return false;
            }
        }
        return true;
    }
}
