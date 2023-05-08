package menufact;

import ingredients.QuantiteIngredient;
import ingredients.exceptions.IngredientException;
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

        try {
            for (QuantiteIngredient ingredientInventaire : inventaire.getQuantiteIngredient()) {
                for (QuantiteIngredient ingredientRecette : ingredients) {
                    if (ingredientRecette.getIngredient() == ingredientInventaire.getIngredient()) {
                        if (ingredientRecette.getQuantite() <= ingredientInventaire.getQuantite() ) {
                            ingredientInventaire.setQuantite(ingredientInventaire.getQuantite() - ingredientRecette.getQuantite());
                            System.out.println("\nOn enleve des aliments de linventiareeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee\n");
                        }
                        else {
                            System.out.println(zePlat.getEtat().onPuDIngredient());
                            break;
                        }
                    }
                }
            }
        } catch (IngredientException ie) {
            // Gérer l'exception ici, par exemple en affichant un message d'erreur
            System.err.println("Erreur lors de la mise à jour des ingrédients: " + ie.getMessage());
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
