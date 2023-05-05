package menufact.plats;

public class PreparationEtat extends PlatEtat {

    PreparationEtat(PlatChoisi platChoisi) {
        super(platChoisi);
    }

    @Override
    public String onCommande() {
        return "deja Commande";
    }

    @Override
    public String onPreparation() {
        return "deja prepare";
    }

    @Override
    public String onTermine() {
        platChoisi.changeState(new TerminerEtat(platChoisi));
        return "Plat termine";
    }

    @Override
    public String onServi() {
        return "plat pas encore Termine";
    }

    @Override
    public String onPuDIngredient() {
        platChoisi.changeState(new IngrédientInsuffisantEtat(platChoisi));
        return "Pu d'ingredient";
    }
}