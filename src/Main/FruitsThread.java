package Main;

public class FruitsThread extends Thread {

    public void run() {
        String[] fruits = {"Apple", "Banana", "Orange", "Grapes", "Mango"};

        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

