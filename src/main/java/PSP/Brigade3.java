package PSP;

public class Brigade3 extends CombatDivision {

    public Brigade3(String brigadeName, Dispatcher dispatcher) {
        super(brigadeName, dispatcher);
    }

    @Override
    public void newNotification(String date) {
        System.out.println("FireFighter: " + brigadeName + " ruszają do zgłoszenia: " + date);

    }
}
