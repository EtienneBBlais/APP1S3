package menufact.plats;

public class TerminerEtat extends PlatEtat {

    TerminerEtat(PlatChoisi platChoisi) {
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
        return "deja termine";
    }

    @Override
    public String onServi() {
        platChoisi.changeState(new ServiEtat(platChoisi));
        return "On sert!!";
    }

    @Override
    public String onPuDIngredient() {
        platChoisi.changeState(new IngrédientInsuffisantEtat(platChoisi));
        return "Pu d'ingredient :(";
    }
}
