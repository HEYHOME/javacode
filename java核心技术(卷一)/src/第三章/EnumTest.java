package 第三章;

import java.util.Scanner;

/**
 * @author hey
 * @description enum类型
 * @create 2020-05-24-15:01
 */
public class EnumTest {
    public static  void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a size:(SMALL,MEDIUM,LARGE,EXTRA_LARGE):");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class,input);
        System.out.println("在enum的位置:"+size.ordinal());
        System.out.println("size="+size);
        System.out.println("abbreviation="+size.getAbbreviation());
        if (size == Size.EXTRA_LARGE) {
            System.out.println("Good job--you paid attention to the _.");
        }

    }
}
enum Size {
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
    private String abbreviation;

    private Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}