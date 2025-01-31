package in.div.enums;

public enum TrafficLight {
    RED("stop"),GREEN("go"),YELLOW("ready");
    private final String action;

    TrafficLight(String action) {
        this.action = action;
    }
}
