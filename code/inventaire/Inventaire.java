package inventaire;

import ingredients.Ingredient;
import ingredients.ListeIngredient;

import java.util.ArrayList;

public class Inventaire {

    /*************************
    --Attributs
     ************************/
    private static Inventaire instance;
    private ArrayList<ListeIngredient> lesIngredients = new ArrayList<ListeIngredient>();

    /**************************
    --Constructeur
     *************************/
    private Inventaire(){

    }

    public void ajouter (ListeIngredient ingredient)
    {
        lesIngredients.add(ingredient);
    }

    public static Inventaire getInstance(){
        if(instance == null){
            instance = new Inventaire();
        }
        return instance;
    }

}
