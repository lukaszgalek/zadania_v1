package PSP;

public class Brigade2 extends CombatDivision {

    public Brigade2(String brigadeName, Dispatcher dispatcher) {
        super(brigadeName, dispatcher);
    }

    @Override
    public void newNotification(String date) {
        System.out.println("FireFighter: " + brigadeName + " ruszają do zgłoszenia: " + date);

    }
}
