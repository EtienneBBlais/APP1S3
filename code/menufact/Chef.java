package menufact;

import ingredients.QuantiteIngredient;
import inventaire.Inventaire;
import menufact.plats.EventListener; // Make sure to import the correct EventListener
import menufact.plats.PlatChoisi;

public class Chef implements EventListener {
    public Chef() {
    }

    @Override
    public void update(String eventType, PlatChoisi zePlat, Inventaire inventaire) {
        System.out.println("Chef: Merci de me notifier de la commande BOY");

        QuantiteIngredient ingredients[] = zePlat.getPlat().getRecette().getQuantiteIngredient();

        for (QuantiteIngredient ingredient : ingredients) {
            //ingredient.getQuantite() > inventaire.get
        }


        System.out.println(zePlat.getEtat().onPreparation());
        System.out.println(zePlat.getEtat().onTermine());
        System.out.println(zePlat.getEtat().onServi());
    }

    @Override
    public String toString() {
        return "chef";
    }
}
