package Kawa;

/**
 * Zadanie 1 !!!
 * 1. Napisz aplikację realizującą metodę szablonową dla przykładu parzenia kawy w barze. Każda kawa powinien mieć informację na temat:
 * - wybranej kawy
 * - użytego mleka
 * - wybranego syropu
 * - inne dotaki
 * Metoda szablonowa powinna przygotowywać kawać i zwracać go ją jako parametr zwracany.
 * public class Coffe {
 * typeOfCoffe;
 * milk;
 * ram;
 * liqueur;
 * otherAdditives;
 * }
 * Musi mieć:
 * - Klasę abstrakcyjną: CoffeMaker z realizacją metody szablonowej
 * - Dwie klasy konkretne dziedziczące po CoffeMaker
 * - Klasę modelową Coffe
 */
public class App {
    public static void main(String[] args) {

        CoffeMaker firtCoffe = new CaffeLatte();
        CoffeMaker secondCoffe = new BlackCoffe();


        System.out.println(firtCoffe.makeCoffe());
        System.out.println();
        System.out.println(secondCoffe.makeCoffe());
    }
}
