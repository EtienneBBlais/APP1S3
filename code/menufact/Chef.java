package menufact;

import menufact.plats.CommanderEtat;
import menufact.plats.EventListener; // Make sure to import the correct EventListener
import menufact.plats.PlatChoisi;
import menufact.plats.PreparationEtat;

public class Chef implements EventListener {
    public Chef() {
    }

    @Override
    public void update(String eventType, PlatChoisi zePlat) {
        System.out.println("Chef: A new plat has been added to the facture. Let's prepare it!");
        System.out.println(zePlat.getEtat().onPreparation());
        System.out.println(zePlat.getEtat().onTermine());
        System.out.println(zePlat.getEtat().onServi());
    }

    @Override
    public String toString() {
        return "chef";
    }
}
