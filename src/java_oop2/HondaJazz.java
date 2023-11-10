package java_oop2;

class HondaJazz extends Car{
    private int tankCapacity;

    public HondaJazz(int numberOfDoors, int tankCapacity) {
        super(4, numberOfDoors);
        this.tankCapacity = tankCapacity;
    }

    // Override method dari class Car
    @Override
    public void moveForward() {
        System.out.println("Honda Jazz is moving forward.");
    }

    // Method spesifik untuk class HondaJazz
    public void playMusic() {
        System.out.println("Playing music in Honda Jazz.");
    }
}
