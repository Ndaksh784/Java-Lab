class ProducerConsumer {
    private int value;
    private boolean available = false;

    public synchronized void produce(int val) throws InterruptedException {
        while (available) {
            wait();
        }
        value = val;
        available = true;
        System.out.println("Produced: " + val);
        notify();
    }

    public synchronized int consume() throws InterruptedException {
        while (!available) {
            wait();
        }
        available = false;
        System.out.println("Consumed: " + value);
        notify();
        return value;
    }
}

class Producer implements Runnable {
    private ProducerConsumer pc;

    public Producer(ProducerConsumer pc) {
        this.pc = pc;
    }

    public void run() {
        int i = 0;
        try {
            while (true) {
                pc.produce(i++);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer implements Runnable {
    private ProducerConsumer pc;

    public Consumer(ProducerConsumer pc) {
        this.pc = pc;
    }

    public void run() {
        try {
            while (true) {
                pc.consume();
                Thread.sleep(700);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class ques20 {
    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();

        Thread producerThread = new Thread(new Producer(pc));
        Thread consumerThread = new Thread(new Consumer(pc));

        producerThread.start();
        consumerThread.start();
    }
}
