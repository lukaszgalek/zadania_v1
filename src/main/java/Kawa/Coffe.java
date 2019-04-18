package Kawa;

public class Coffe {

    public String name;
    public String milk;
    public String liqueur;
    public String otherAdditives;

    @Override
    public String toString() {
        return "Kawa - " + name
                + ", "
                + milk + ", "
                + liqueur + ", "
                + otherAdditives
                + "."
                ;
    }
}
