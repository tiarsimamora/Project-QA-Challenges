package java_oop2;

class SuzukiKatana extends Car{
    private boolean sportMode;

    public SuzukiKatana(int numberOfDoors, boolean sportMode) {
        super(2, numberOfDoors);
        this.sportMode = sportMode;
    }

    // Override method dari class Car
    @Override
    public void moveForward() {
        System.out.println("Suzuki Katana is moving forward with speed.");
    }

    // Method spesifik untuk class SuzukiKatana
    public void activateLaunchControl() {
        System.out.println("Activating Launch Control in Suzuki Katana.");
    }
}
