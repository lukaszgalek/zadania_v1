package PSP;

public abstract class CombatDivision {
    protected String brigadeName;
    protected Dispatcher dispatcher;

    public CombatDivision(String brigadeName, Dispatcher dispatcher) {
        this.brigadeName = brigadeName;
        this.dispatcher = dispatcher;
    }

    public void addToQueueIfYouReady() {
        dispatcher.addReadyBrigade(this);
    }

    public abstract void newNotification(String date);
}
