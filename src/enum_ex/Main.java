package enum_ex;

public class Main {
    public static void main(String[] args) {
        makeDrivingDecision(TrafficLightColor.GREEN);
        makeDrivingDecision(TrafficLightColor.YELLOW);
        makeDrivingDecision(TrafficLightColor.RED);
    }
    public static void makeDrivingDecision(TrafficLightColor color) {
        switch (color) {
            case GREEN:
                System.out.println("Green means Go!!!");
                break;
            case YELLOW:
                System.out.println("Proceed with caution!!!");
                break;
            case RED:
                System.out.println("STAHP!!!");
                break;
        }
    }
}
