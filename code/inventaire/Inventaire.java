package inventaire;

import ingredients.QuantiteIngredient;

import java.util.ArrayList;

public class Inventaire {

    /*************************
    --Attributs
     ************************/
    private static Inventaire instance;
    private ArrayList<QuantiteIngredient> lesIngredients = new ArrayList<QuantiteIngredient>();

    /**************************
    --Constructeur
     *************************/
    private Inventaire(){

    }

    public void ajouter(QuantiteIngredient ingredient)
    {
        lesIngredients.add(ingredient);
    }

    public static Inventaire getInstance(){
        if(instance == null){
            instance = new Inventaire();
        }
        return instance;
    }

    //public get

}
