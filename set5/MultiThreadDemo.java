class NumberThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("NumberThread interrupted.");
            }
        }
    }
}

class CharacterThread extends Thread {
    public void run() {
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println("Character: " + c);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("CharacterThread interrupted.");
            }
        }
    }
}

class MessageThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Message: Hello from thread " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("MessageThread interrupted.");
            }
        }
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        NumberThread t1 = new NumberThread();
        CharacterThread t2 = new CharacterThread();
        MessageThread t3 = new MessageThread();

        t1.start();
        t2.start();
        t3.start();
    }
}
