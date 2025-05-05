public class TrafficLight {

    private String color;
    private int duration; // in seconds

    public TrafficLight(String color, int duration){
        this.color = color;
        this.duration = duration;
    }

    public void changeColor(String newColor, int newDuration) {
        this.color = newColor;
        this.duration = newDuration;
        System.out.println("Changed to " + color + " for " + duration + " seconds.");
    }

    // Check if the light is red
    public boolean isRed() {
        return color.equalsIgnoreCase("red");
    }

    // Check if the light is green
    public boolean isGreen() {
        return color.equalsIgnoreCase("green");
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Getter for duration
    public int getDuration() {
        return duration;
    }

    public static void main(String[] args) {
        // Write a program to create class called "TrafficLight" with attributes for color and duration, and methods to change the color and check for red or green

        TrafficLight light = new TrafficLight("red", 30);
        System.out.println("Current color: " + light.getColor());
        System.out.println("Is red? " + light.isRed());
        System.out.println("Is green? " + light.isGreen());

        light.changeColor("green", 45);
        System.out.println("Current color: " + light.getColor());
        System.out.println("Is red? " + light.isRed());
        System.out.println("Is green? " + light.isGreen());
    }
}

