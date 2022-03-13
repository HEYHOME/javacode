package com.homework;

import java.util.*;

/**
 * @description:
 * @create: 2020-09-25-15:24
 * @author: Hey
 */
public class GradeSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Student[] s = new Student[n];
        for (int i = 0; i < n; i++) {
            s[i] = new Student(in.next(), in.nextInt());
        }
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (s[i].score < s[j].score) {
                    maxIndex = s[j].score > s[maxIndex].score ? j : maxIndex;
                }
            }
            swap(s, i, maxIndex);
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (s[i].score == s[j].score && s[i].name.compareTo(s[j].name)>0) {
                    String temp = s[i].name;
                    s[i].name = s[j].name;
                    s[j].name = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(s[i].name + " " + s[i].score);
        }
    }

    private static void swap(Student[] s, int i, int maxIndex) {
        int temp1 = s[i].score;
        s[i].score = s[maxIndex].score;
        s[maxIndex].score = temp1;
        String temp2 = s[i].name;
        s[i].name = s[maxIndex].name;
        s[maxIndex].name = temp2;
    }


}

class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}