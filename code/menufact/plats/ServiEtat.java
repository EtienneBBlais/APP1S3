package menufact.plats;

public class ServiEtat extends Chef {

    ServiEtat(PlatChoisi platChoisi) {
        super(platChoisi);
    }

    @Override
    public String onCommande() {
        return "Cannot execute onCommande in IngrédientInsuffisantEtat";
    }

    @Override
    public String onPreparation() {
        return "Cannot execute onPreparation in IngrédientInsuffisantEtat";
    }

    @Override
    public String onTermine() {
        return "Cannot execute onTermine in IngrédientInsuffisantEtat";
    }

    @Override
    public String onServi() {
        return "Cannot execute onServi in IngrédientInsuffisantEtat";
    }

    @Override
    public String onPuDIngredient() {
        return "Cannot execute onPuDIngredient in IngrédientInsuffisantEtat";
    }
}
