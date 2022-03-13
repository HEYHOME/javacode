package com.queue;

import java.util.Scanner;

/**
 * @author hey
 * @creat 2020-04-15-23:36
 */
public class CircleArrayQueue {
    public static void main(String[] args) {
        //创建一个队列
        CircleArray queue = new CircleArray(4);
        char key = ' ';
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("s(show): 显示队列");
            System.out.println("e(exit): 退出程序");
            System.out.println("a(add): 添加数据到队列");
            System.out.println("g(get): 从队列取出数据");
            System.out.println("h(head): 查看队列头的数据");
            key = scanner.next().charAt(0);
            switch (key) {
                case 's':
                    queue.showQueue();
                    break;
                case 'a':
                    System.out.println("输出一个数");
                    int value = scanner.nextInt();
                    queue.addQueue(value);
                    break;
                case 'g':
                    try {
                        int res = queue.getQueue();
                        System.out.println("取出的数据是:" + res);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                    try {
                        int res = queue.headQueue();
                        System.out.println("队列头的数据是:"+res);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e':
                    scanner.close();
                    loop = false;
                    break;
                default:
                    break;
            }
        }
        System.out.println("程序退出");
    }
}

class CircleArray{
    private int maxSize;// 表示数组的最大容量
    //front 变量的含义:front指向队列的第一个元素
    //front=0
    private int front;// 队列头
    //rear 变量的含义:rear指向队列的最后一个元素的后一个位置
    //rear=0
    private int rear;// 队列尾
    private int[] arr;// 该数据用于存放数据,模拟队列

    public CircleArray(int arrMaxSize){
        maxSize = arrMaxSize;
        arr = new int[maxSize];
    }
    // 判断队列是否满
    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }
    // 判断队列是否为空
    public boolean isEmpty() {
        return rear == front;
    }
    //添加数据到队列
    public void addQueue(int n) {
        //判断队列是否满
        if (isFull()) {
            System.out.println("队列满,不能加入数据");
            return;
        }
        arr[rear] = n;
        rear = (rear + 1) % maxSize;
    }
    // 获取队列的数据
    public int getQueue() {
        // 判断是否为空
        if (isEmpty()) {
            // 通过抛出异常处理
            throw new RuntimeException("队列空,不能取数据");
        }
        int value = arr[front];
        front = (front + 1) % maxSize;
        return value;
    }
    // 显示队列的所有数据
    public void showQueue() {
        // 遍历
        if (isEmpty()) {
            System.out.println("队列空,没有数据");
            return;
        }
        //从front开始遍历
        for (int i = front; i < front + size(); i++) {
            System.out.println("arr[" + i % maxSize + "] = " + arr[i % maxSize]);
        }
    }
    //求出当前队列的有效数据的个数
    public int size(){
        return (rear + maxSize - front) % maxSize;
    }
    // 显示队列的头数据,注意不是取出数据
    public int headQueue() {
        //判断
        if (isEmpty()) {
            throw new RuntimeException("队列空,没有数据");
        }
        return arr[front];
    }
}