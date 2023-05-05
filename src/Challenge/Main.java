package Challenge;

public class Main {
    public static void main(String[] args) {
        OutLander outlander = new OutLander(36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.accelerate(-42);
    }
}
