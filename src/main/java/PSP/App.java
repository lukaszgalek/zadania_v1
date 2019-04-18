package PSP;

/**
 * . Napisz aplikację realizującą funkcjonalność wzorca projektowego mediator na przykładzie dyspozytora straży pożarnej.
 * - dyspozytor powinien wysyłać informację wszystkim strażą pożarnym o planowanej akcji ratunkowej
 * - w kolejnym etapie zaprojektuj mechanizm kolejki oraz stosu, gdzie dyspozytor będzie wysyłać informację o akcji
 * tylko do jednej wybranej karetki pogotowania. Jeśli straż pożarna jest w trakcie innej akcji ratunkowej powinna
 * być nie uwzględniana przez dyspozytora.
 **/
public class App {

    public static void main(String[] args) {

        Dispatcher dispatcher = new FireBrigadeDispatcher();

        CombatDivision brigade1 = new Brigade1("GCBA", dispatcher);
        CombatDivision brigade2 = new Brigade2("GCBA2", dispatcher);
        CombatDivision brigade3 = new Brigade3("GBA", dispatcher);


        dispatcher.addReadyBrigade(brigade1);
        dispatcher.addReadyBrigade(brigade2);
        dispatcher.addReadyBrigade(brigade3);

        dispatcher.newNotification("pożar mieszkania, tu i tam ");
        dispatcher.newNotification("pożar mieszkania, tam i tu ");
        dispatcher.newNotification("wypadek, gdzieś tam  ");
        dispatcher.newNotification("pożar poszycia, las");
        brigade1.addToQueueIfYouReady();
        dispatcher.newNotification("pożar poszycia, las");


    }
}
