//Tiar Saroha Simamora

package java_oop2;

public class Main {
    public static void main(String[] args) {
        HondaJazz jazz = new HondaJazz(5, 40);
        ToyotaFortuner fortuner = new ToyotaFortuner(5, true);
        SuzukiKatana katana = new SuzukiKatana(2, true);

        // Polymorphism: Menggunakan method yang dioverride dari class child
        jazz.moveForward();
        fortuner.turn();
        katana.moveForward();

        // Menggunakan method spesifik dari masing-masing child class
        jazz.playMusic();
        fortuner.engage4WD();
        katana.activateLaunchControl();
    }
}
