package com.homework;

import java.math.BigInteger;
import java.util.*;
import java.util.LinkedList;

/**
 * @description:
 * @create: 2020-10-11-21:31
 * @author: Hey
 */
public class GradeSort02 {
    public static void main(String[] args) {
        LinkedList<Stu> list = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String s = in.next();
            String ss = in.next();
            BigInteger score = new BigInteger(ss);
            list.add(new Stu(s,score));
        }
        Collections.sort(list, new Comparator<Stu>() {
            @Override
            public int compare(Stu o1, Stu o2) {
                if (o1.score.compareTo(o2.score) == 0) {
                    return o1.name.compareTo(o2.name);
                }
                return o2.score.compareTo(o1.score);
            }
        });

        /*while (list.size() > 1) {
            Stu e = list.pop();
            System.out.println(e.name+" "+e.score);
        }
        Stu e = list.pop();
        System.out.print(e.name+" "+e.score);*/
    }
}

class Stu {
    String name;
    BigInteger score;

    Stu(String name, BigInteger score) {
        this.name = name;
        this.score=score;
    }

    @Override
    public String toString() {
        return name+" "+score;
    }
}
