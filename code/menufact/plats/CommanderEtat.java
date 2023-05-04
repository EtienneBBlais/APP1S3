package menufact.plats;

public class CommanderEtat extends Chef {

    CommanderEtat(PlatChoisi platChoisi) {
        super(platChoisi);
    }

    @Override
    public String onCommande() {
        return "Deja en Commande";
    }

    @Override
    public String onPreparation() {
        platChoisi.changeState(new PreparationEtat(platChoisi));
        return "de commande a preparation";
    }

    @Override
    public String onTermine() {
        return "Doit preparer avant!";
    }

    @Override
    public String onServi() {
        return "Doit preparer avant!";
    }

    @Override
    public String onPuDIngredient() {
        platChoisi.changeState(new IngrédientInsuffisantEtat(platChoisi));
        return "puDIngredients";
    }
}
