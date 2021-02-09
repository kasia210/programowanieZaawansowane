package zadania.zadnie1;

public class Samochod {
    private double speed;
    private boolean swiatla;

    public void przyspiesz() {
        if (speed <= 110) {
            speed += 10;
        }
        System.out.println("przyspieszam do " + speed + " km/h.");
    }

    public void wlaczSwiatła() {
        swiatla = true;
    }

    public void czySwiatlaWlaczone(boolean swiatla) {
        if (swiatla != true) {
            System.out.println("Swiatła wyłącznone");
        } else {
            System.out.println("Swiatła włączone");
        }


    }

}
