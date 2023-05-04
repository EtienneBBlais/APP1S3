package ingredients;

public class FactoryIngredient {

    public Ingredient nouveauIngredient(String nom, String description, TypeIngredient type){
        Ingredient produit;
        switch (type){
            case VIANDE:
                produit = new Viande();
                break;

            case FRUIT:
                produit = new Fruit();
                break;

            case LEGUME:
                produit = new Legume();
                break;

            case EPICE:
                produit = new Epice();
                break;

            case LAITIER:
                produit = new Laitier();
                break;

            default:
                produit = new Ingredient();
                produit.setTypeIngredient(null);
        }
        produit.setNom(nom);
        produit.setDescription(description);
        return produit;
    }
}
