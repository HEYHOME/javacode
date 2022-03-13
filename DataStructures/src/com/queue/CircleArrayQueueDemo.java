package com.queue;

/**
 * @author hey
 * @creat 2020-04-16-15:10
 */
public class CircleArrayQueueDemo {
    public static void main(String[] args) {

    }
}
class CircleArrayDemo{
    private int maxSize;
    private int front;
    private int rear;
    private int[] arr;

    public CircleArrayDemo(int arrMaxSize){
        maxSize = arrMaxSize;
        arr = new int[maxSize];
    }
    public boolean isFull(){
        return (rear + 1) % maxSize == front;
    }
    public boolean isEmpty(){
        return rear == front;
    }
    public void addQueue(int n){
        if(isFull()){
            System.out.println("队列已满,不能再加入数据");
            return;
        }
        arr[rear] = n;
        rear = (rear + 1) % maxSize;
    }
    public int getQueue(){
        if(isEmpty()){
            System.out.println("队列空,没有数据");
        }
        int value = arr[front];
        front = (front + 1) % maxSize;
        return value;
    }
    public void showQueue(){
        if (isEmpty()) {
            System.out.println("队列空,没有数据");
            return;
        }
        for (int i = front; i < front + size(); i++) {
            System.out.println("arr[" + i % maxSize + "] = " + arr[i % maxSize]);
        }
    }
    public int size(){
        return (rear + maxSize - front) % maxSize;
    }
    public int headQueue(){
        if (isEmpty()) {
            throw new RuntimeException("队列空,没有数据");
        }
        return arr[front];
    }
}












