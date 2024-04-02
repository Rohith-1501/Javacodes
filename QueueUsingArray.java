class QueueUsingArray {
    static final int Max = 30;
    static int[] a;
    int rear;

    QueueUsingArray() {
        a = new int[Max];
        rear = -1;
    }

    public void enqueue(int val) {
        if (rear == Max - 1) {
            System.out.println("The Queue is Full");
        } else {
            rear = rear + 1;
            a[rear] = val;
        }
    }

    public int dequeue() {
        if (rear == -1) {
            System.out.println("The Queue is Empty");
            return -1;
        }
        int temp = a[0];
        for (int i = 1; i <= rear; i++) {
            a[i - 1] = a[i];
        }
        a[rear] = 0;
        rear--;
        return temp;
    }

    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);

        System.out.print("Array before dequeuing: ");
        System.out.println();
        for (int i = 0; i <= q.rear; i++)
            System.out.print(a[i] + " ");
        System.out.println();

        System.out.println("The dequeued element: " + q.dequeue());
        System.out.println("The dequeued element: " + q.dequeue());

        System.out.println("Array after dequeue: ");
        for (int i = 0; i <= q.rear; i++)
            System.out.print(a[i] + " ");
        System.out.println();

        System.out.println("Enqueue again: ");
        q.enqueue(1);
        for (int i = 0; i <= q.rear; i++)
            System.out.print(a[i] + " ");
    }
}
