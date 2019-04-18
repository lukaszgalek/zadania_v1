package Kawa;

public class CaffeLatte extends CoffeMaker {
    @Override
    public String coffeName() {
        return " Caffe Latte ";
    }

    @Override
    public String withMilk() {
        return " with milk ";
    }

    @Override
    public String withLiquer() {
        return " with a liquer";
    }

    @Override
    public String withOtherAdditives() {
        return " with sugar ";
    }
}
