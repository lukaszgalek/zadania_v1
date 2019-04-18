package Kawa;

public abstract class CoffeMaker {

    public final Coffe makeCoffe() {
        Coffe coffe = new Coffe();
        coffe.name = coffeName();
        coffe.milk = withMilk();
        coffe.liqueur = withLiquer();
        coffe.otherAdditives = withOtherAdditives();

        return coffe;
    }


    public abstract String coffeName();

    public abstract String withMilk();

    public abstract String withLiquer();

    public abstract String withOtherAdditives();


}
