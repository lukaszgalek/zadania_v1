package Kawa;

public class BlackCoffe extends CoffeMaker {

    @Override
    public String coffeName() {
        return "Black Coffe";
    }

    @Override
    public String withMilk() {
        return " with milk ";
    }

    @Override
    public String withLiquer() {
        return " without a liqueur ";
    }

    @Override
    public String withOtherAdditives() {
        return "without a other additives";
    }
}
