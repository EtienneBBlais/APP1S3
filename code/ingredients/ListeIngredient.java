package ingredients;

public class ListeIngredient {
    private int quantite;
    private Ingredient ingredient;

    public ListeIngredient(Ingredient ing, int qt){
        ingredient = ing;
        quantite = qt;
    }

    //Getter function
    public Ingredient getIngredient() {
        return ingredient;
    }
    public int getQuantite(){
        return quantite;
    }

    //Setter function
    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}
