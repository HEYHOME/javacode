package DFS;

import java.util.Scanner;

/**
 * @description:
 * @create: 2020-07-27-23:00
 * @author: Hey
 */
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int height = in.nextInt();
        int width = in.nextInt();
        char c = in.next().charAt(0);
        int flag = in.nextInt();
        Test t= new Test();
        t.draw(height,width,c,flag);
    }

    private void draw(int height, int width, char c, int flag) {
        char[][] map = new char[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                map[i][j] = c;
            }
        }
        if (flag==0){
            for (int i = 1; i <= height-2; i++) {
                for (int j = 1; j <= width-2; j++) {
                    map[i][j]=' ';
                }
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }

}
