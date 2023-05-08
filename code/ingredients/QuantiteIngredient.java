package ingredients;

import ingredients.exceptions.IngredientException;
public class QuantiteIngredient {

    /*******************************
    --Attribut
     ******************************/
    private int quantite; //La quantite est mesure en g
    private Ingredient ingredient;

    /********************************
    --Constructeur
     *******************************/
    public QuantiteIngredient(Ingredient ing, int quantite) throws IngredientException{
        ingredient = ing;
        if (quantite < 0)
            throw new IngredientException("Il n'est pas possible d'avoir une quantité negative");
        else
            this.quantite = quantite;
    }

    /**********************************
    --Getter/Setter
     *********************************/
    public Ingredient getIngredient() {
        return ingredient;
    }
    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public int getQuantite(){
        return quantite;
    }
    public void setQuantite(int quantite) throws IngredientException{
        if (quantite < 0)
            throw new IngredientException("Il n'est pas possible d'avoir une quantité negative");
        else
            this.quantite = quantite;
    }

    /******************************
    -- Miscellaneous Function
     *****************************/

    @Override
    public String toString() {
        return ingredient +
                ", quantite=" + quantite;
    }



}
