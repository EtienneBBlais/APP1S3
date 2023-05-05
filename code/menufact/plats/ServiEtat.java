package menufact.plats;

public class ServiEtat extends PlatEtat {

    ServiEtat(PlatChoisi platChoisi) {
        super(platChoisi);
    }

    @Override
    public String onCommande() {
        return "dejaServi";
    }

    @Override
    public String onPreparation() {
        return "dejaServi";
    }

    @Override
    public String onTermine() {
        return "dejaServi";
    }

    @Override
    public String onServi() {
        return "dejaServi";
    }

    @Override
    public String onPuDIngredient() {
        return "dejaServi";
    }
}
