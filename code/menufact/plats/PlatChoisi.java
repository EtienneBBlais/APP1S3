package menufact.plats;

public class PlatChoisi {
    private IPlat plat;
    private PlatEtat etat;
    private int quantite;

    public PlatChoisi(IPlat plat, int quantite) {
        this.plat = plat;
        this.quantite = quantite;
        etat = new CommanderEtat(this);
    }

    @Override
    public String toString() {
        return "menufact.plats.PlatChoisi{" +
                "quantite=" + quantite +
                ", plat=" + plat +
                '}';
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public IPlat getPlat() {
        return plat;
    }
    public PlatEtat getEtat() {
        return etat;
    }

    public void changeState(PlatEtat nouvelEtat) {
        this.etat = nouvelEtat;
    }


}