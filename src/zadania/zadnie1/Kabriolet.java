package zadania.zadnie1;

public class Kabriolet extends Samochod {
    boolean dach=false;

    public boolean schowajDach() {
        System.out.println("Chowam dach");
        dach = true;
        return dach;
    }
    public void czyDachSchowany(boolean dach){
        if (dach == true){
            System.out.println("Dach schowany");
        } else {
            System.out.println("Dach nie jest schowany");
        }

    }
}
