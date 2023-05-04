package menufact.plats;

import ingredients.ListeIngredient;
import menufact.exceptions.MenuException;

public class Recette{
    private final int quantiteIngredient = 5;
    private ListeIngredient[] liste;

    public Recette(){
        liste = new ListeIngredient[quantiteIngredient];
    }

    public void ajouterIngredient(ListeIngredient ingredient) throws MenuException{
        if(liste.length >= quantiteIngredient){
            throw new MenuException("On depasse le nombre maximal d'ingredients");
        }
        else{
            liste[liste.length -1] = ingredient;
        }
    }

    public ListeIngredient[] getListeIngredient() {
        return liste;
    }
}
