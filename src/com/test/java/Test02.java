package com.test.java;

/**
 * @author hey
 * @description
 * @create 2020-05-23-18:37
 */
class Test02 {
    public static void main(String[] args) {
       Size s = Size.EXTRA_LARGE;
        Size s1 = Enum.valueOf(Size.class,"SMALL") ;
        String string = Size.MEDIUM.toString();
        System.out.println(string);
        System.out.println(s1);
        System.out.println(s);
    }
}
enum Size{
    SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");
    private String abbreviation;

    private Size(String abbreviation) {
        this.abbreviation=abbreviation;
    }
    public String getAbbreviation(){
        return abbreviation;
    }
}