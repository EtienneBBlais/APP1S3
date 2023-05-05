package ingredients;

public class Ingredient {

    /************************
    --Attributs
     ***********************/
    private String nom;
    private String description;
    private TypeIngredient typeIngredient;

    /************************
    --Constructeur
     ***********************/
    public Ingredient(String nom, String description, TypeIngredient type){
        this.nom = nom;
        this.description = description;
        this.typeIngredient = type;
    }

    public Ingredient(){
        this.nom = "Ingredient inconnu";
        this.description = " ";
        this.typeIngredient = null;
    }


    /************************
    --Getter/Setter
    ************************/

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TypeIngredient getTypeIngredient() {
        return typeIngredient;
    }

    public void setTypeIngredient(TypeIngredient typeIngredient) {
        this.typeIngredient = typeIngredient;
    }

    /**************************
    --Miscellaneous function
     *************************/
    @Override
    public String toString() {
        return "Ingredient=" + nom +
                ", description=" + description +
                ", Type=" + typeIngredient;
    }
}
