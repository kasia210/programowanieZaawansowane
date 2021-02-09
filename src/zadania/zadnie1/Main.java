package zadania.zadnie1;

public class Main {
    public static void main(String[] args) {
        Samochod samochod = new Samochod();
        Kabriolet kabriolet = new Kabriolet();

        kabriolet.czySwiatlaWlaczone(kabriolet.swiatla);
        kabriolet.wlaczSwiatła();
        kabriolet.czySwiatlaWlaczone(kabriolet.swiatla);

        kabriolet.czyDachSchowany(kabriolet.dach);
        kabriolet.schowajDach();
        kabriolet.czyDachSchowany(kabriolet.dach);

        samochod.przyspiesz();
        samochod.przyspiesz();
    }
}
