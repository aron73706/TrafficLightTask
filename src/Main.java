public class Main {
    public static void main(String[] args) {

        TrafficLightSimulator simulator =
                new TrafficLightSimulator(TrafficLight.RED);

        while (true) {
            System.out.println(simulator.toString());
            simulator.changeColor();

            try {
                Thread.sleep(1000); // 1 second delay
            } catch (InterruptedException e) {
                System.out.println("Timer interrupted");
            }
        }
    }
}