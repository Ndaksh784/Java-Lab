class CSthread extends Thread {
    public void run() {
        int count = 0;
        while (count < 5) {
            count++;
            System.out.println("Thread: " + getName() + ", Execution count: " + count);
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class ITthread extends Thread {
    public void run() {
        int count = 0;
        while (count < 5) {
            count++;
            System.out.println("Thread: " + getName() + ", Execution count: " + count);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class ques19 {
    public static void main(String[] args) {
        CSthread cs = new CSthread();
        ITthread it = new ITthread();

        cs.setName("CSthread");
        it.setName("ITthread");

        cs.start();
        it.start();
    }
}
