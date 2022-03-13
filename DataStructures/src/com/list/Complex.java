package com.list;

import java.util.Scanner;

/**
 * @description:
 * @create: 2020-09-23-14:15
 * @author: Hey
 */
public class Complex {
    double real;
    double image;
    Scanner in = new Scanner(System.in);
    Complex(){
        double real = in.nextDouble();
        double image = in.nextDouble();
        this.real = real;
        this.image = image;
    }

    public Complex(double real, double image) {
        this.real = real;
        this.image=image;
    }
    private Complex add(Complex a) {
        double real2 = a.real;
        double image2 = a.image;
        double newReal = this.real+real2;
        double newImage = this.image+image2;
        Complex res = new Complex(newReal,newImage);
        return res;
    }
    private Complex sub(Complex a) {
        double real2 = a.real;
        double image2 = a.image;
        double newReal = this.real-real2;
        double newImage = this.image-image2;
        Complex res = new Complex(newReal,newImage);
        return res;
    }

    private Complex mul(Complex a) {
        double real2 = a.real;
        double image2 = a.image;
        double newReal = this.real*real2-this.image*image2;
        double newImage = this.image*real2+this.real*image2;
        Complex res = new Complex(newReal,newImage);
        return res;
    }

    private Complex div(Complex a) {
        double real2 = a.real;
        double image2 = a.image;
        double newReal =
                (this.real*real2+this.image*image2)/(real2*real2+image2*image2);
        double newImage =
                (this.image*real2-this.real*image2)/(real2*real2+image2*image2);
        Complex res = new Complex(newReal,newImage);
        return res;
    }
    private void print(){
        if (image > 0) {
            System.out.println(real+"+"+image+"i");
        } else if (image < 0) {
            System.out.println(real+""+image+"i");
        }else{
            System.out.println(real);
        }
    }

    public static void main(String[] args) {
        Complex a = new Complex();
        Complex b =new Complex();
        Complex addRes = a.add(b);
        Complex subRes = a.sub(b);
        Complex mulRes = a.mul(b);
        Complex divRes = a.div(b);
        addRes.print();
        subRes.print();
        mulRes.print();
        divRes.print();
    }
}