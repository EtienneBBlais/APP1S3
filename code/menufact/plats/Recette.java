package menufact.plats;

import ingredients.ListeIngredient;
import menufact.exceptions.MenuException;

public class Recette{

    /****************************
    --Attributs
     ***************************/
    private final int capaciteIngredient = 5;
    private int taille;
    private ListeIngredient[] liste;

    /****************************
    --Constructeur
     ***************************/
    public Recette(){
        liste = new ListeIngredient[capaciteIngredient];
        taille = 0;
    }

    /****************************
    --Miscellaneous  function
     ***************************/
    public void ajouterIngredient(ListeIngredient ingredient) throws MenuException{
        if(taille >= capaciteIngredient){
            throw new MenuException("On depasse le nombre maximal d'ingredients");
        }
        else{
            liste[taille] = ingredient;
            taille++;
        }
    }

    @Override
    public String toString() {
        String temp = "Recette:\n";
        for(int i = 0; i < taille; i++){
            temp += "\t";
            temp += liste[i].toString();
            temp += "\n";
        }
        return temp;
    }

    /****************************
    --Getter/Setter
     ***************************/
    public ListeIngredient[] getListeIngredient() {
        return liste;
    }
}
