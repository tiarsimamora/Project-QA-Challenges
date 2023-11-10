package java_oop2;

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(int wheels, int numberOfDoors) {
        super(wheels);
        this.numberOfDoors = numberOfDoors;
    }

    // Override method dari class Vehicle
    @Override
    public void moveForward() {
        System.out.println("Car is moving forward.");
    }

    // Method spesifik untuk class Car
    public void changeTransmission() {
        System.out.println("Changing car transmission.");
    }

}
