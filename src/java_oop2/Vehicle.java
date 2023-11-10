package java_oop2;

class Vehicle {
    private int wheels;

    public Vehicle(int wheels) {
        this.wheels = wheels;
    }

    public void moveForward() {
        System.out.println("Vehicle is moving forward.");
    }

    public void turn() {
        System.out.println("Vehicle is turning.");
    }
}
