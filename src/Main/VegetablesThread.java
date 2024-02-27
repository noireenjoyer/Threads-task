package Main;

public class VegetablesThread extends Thread {

    public void run() {
        String[] vegetables = {"Carrot", "Broccoli", "Tomato", "Cucumber", "Spinach"};

        for (String vegetable : vegetables) {
            System.out.println("Vegetable: " + vegetable);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
