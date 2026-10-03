class NumberTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("NumberTask interrupted.");
            }
        }
    }
}

class CharacterTask implements Runnable {
    public void run() {
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println("Character: " + c);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("CharacterTask interrupted.");
            }
        }
    }
}

class MessageTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Message: Hello from Runnable " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("MessageTask interrupted.");
            }
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new NumberTask());
        Thread t2 = new Thread(new CharacterTask());
        Thread t3 = new Thread(new MessageTask());

        t1.start();
        t2.start();
        t3.start();
    }
}
