package PSP;

public class Brigade1 extends CombatDivision {



    public Brigade1(String brigadeName, Dispatcher dispatcher) {
        super(brigadeName, dispatcher);
    }

    @Override
    public void newNotification(String date) {
        System.out.println("FireFighter: " + brigadeName + " ruszają do zgłoszenia: " + date);
    }
}
