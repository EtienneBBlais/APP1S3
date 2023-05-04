package menufact.plats;

public class IngrédientInsuffisantEtat extends Chef {

    IngrédientInsuffisantEtat(PlatChoisi platChoisi) {
        super(platChoisi);
    }

    @Override
    public String onCommande() {
        platChoisi.changeState(new CommanderEtat(platChoisi));
        return "Essai de commande apres un manque d'ingredient";
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
        return "on savais deja qui manque des ingredients";
    }
}
