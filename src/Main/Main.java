package Main;

public class Main {
    public static void main(String[] args) {
        FruitsThread fruitsThread = new FruitsThread();
        VegetablesThread vegetablesThread = new VegetablesThread();


        vegetablesThread.start();

        try {
            vegetablesThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        fruitsThread.start();
    }
}
