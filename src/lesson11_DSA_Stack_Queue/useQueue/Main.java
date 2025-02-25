package lesson11_DSA_Stack_Queue.useQueue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Phần tử đầu hàng đợi: " + queue.peek());

        queue.dequeue();
        queue.dequeue();

        System.out.println("Phần tử đầu hàng đợi: " + queue.peek());

        queue.dequeue();
        queue.dequeue();
    }
}
