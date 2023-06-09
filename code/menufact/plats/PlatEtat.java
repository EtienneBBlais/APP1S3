package menufact.plats;

public abstract class PlatEtat {
    PlatChoisi platChoisi;

    PlatEtat(PlatChoisi platChoisi) {
        this.platChoisi = platChoisi;
    }

    public abstract String onCommande();
    public abstract String onPreparation();
    public abstract String onTermine();
    public abstract String onServi();
    public abstract String onPuDIngredient();

}



