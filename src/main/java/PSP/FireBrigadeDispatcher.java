package PSP;

import java.util.LinkedList;
import java.util.Queue;

public class FireBrigadeDispatcher implements Dispatcher {


    private Queue<CombatDivision> readyBrigade = new LinkedList<>();


    @Override
    public void newNotification(String date) {
        if (!readyBrigade.isEmpty()) {

            CombatDivision combatDivision = readyBrigade.poll();
            combatDivision.newNotification(date);
        } else {
            System.out.println(" wszystkie wozy na akcji ");
        }
    }

    @Override
    public void addReadyBrigade(CombatDivision combatDivision) {

        readyBrigade.add(combatDivision);
    }
}
