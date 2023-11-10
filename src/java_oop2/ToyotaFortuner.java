package java_oop2;

class ToyotaFortuner extends Car{
    private boolean offRoadMode;

    public ToyotaFortuner(int numberOfDoors, boolean offRoadMode) {
        super(4, numberOfDoors);
        this.offRoadMode = offRoadMode;
    }

    // Override method dari class Car
    @Override
    public void turn() {
        System.out.println("Toyota Fortuner is turning with stability control.");
    }

    // Method spesifik untuk class ToyotaFortuner
    public void engage4WD() {
        System.out.println("Engaging 4-wheel drive in Toyota Fortuner.");
    }
}
