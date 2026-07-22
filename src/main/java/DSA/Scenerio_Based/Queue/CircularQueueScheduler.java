package main.java.DSA.Scenerio_Based.Queue;

public class CircularQueueScheduler {

    int queue[];
    int front;
    int rear;
    int size;
    int capacity;

    CircularQueueScheduler(int capacity){

        this.capacity=capacity;

        queue=new int[capacity];

        front=0;
        rear=-1;
        size=0;
    }

    public boolean isFull(){

        return size==capacity;
    }

    public boolean isEmpty(){

        return size==0;
    }

    public void enqueue(int process){

        if(isFull()){

            System.out.println("Queue Full");
            return;
        }

        rear=(rear+1)%capacity;

        queue[rear]=process;

        size++;
    }

    public void dequeue(){

        if(isEmpty()){

            System.out.println("Queue Empty");
            return;
        }

        System.out.println("Executing Process : "
                +queue[front]);

        front=(front+1)%capacity;

        size--;
    }

    public static void main(String[] args){

        CircularQueueScheduler cpu=
                new CircularQueueScheduler(5);

        cpu.enqueue(101);
        cpu.enqueue(102);
        cpu.enqueue(103);

        cpu.dequeue();
        cpu.dequeue();

        cpu.enqueue(104);
        cpu.enqueue(105);
        cpu.enqueue(106);

        while(!cpu.isEmpty())
            cpu.dequeue();

    }
}