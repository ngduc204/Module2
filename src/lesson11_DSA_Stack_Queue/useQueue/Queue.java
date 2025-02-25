package lesson11_DSA_Stack_Queue.useQueue;

class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(data + " đã được thêm vào hàng đợi.");
    }

    public void dequeue() {
        if (front == null) {
            System.out.println("Hàng đợi rỗng. Không thể xóa phần tử.");
            return;
        }
        int data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        System.out.println(data + " đã được xóa khỏi hàng đợi.");
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int peek() {
        if (front == null) {
            System.out.println("Hàng đợi rỗng.");
            return -1;
        }
        return front.data;
    }
}