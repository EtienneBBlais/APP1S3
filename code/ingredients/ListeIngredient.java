package ingredients;

public class ListeIngredient {

    /*******************************
    --Attribut
     ******************************/
    private int quantite; //La quantite est mesure en g
    private Ingredient ingredient;

    /********************************
    --Constructeur
     *******************************/
    public ListeIngredient(Ingredient ing, int qt){
        ingredient = ing;
        quantite = qt;
    }

    /**********************************
    --Getter/Setter
     *********************************/
    public Ingredient getIngredient() {
        return ingredient;
    }
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    public int getQuantite(){
        return quantite;
    }
    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

}
