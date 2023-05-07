package menufact.plats;

public class PlatChoisi {
    private PlatAuMenu plat;
    private PlatEtat etat;
    private int quantite;

    public PlatChoisi(PlatAuMenu plat, int quantite) {
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

    public PlatAuMenu getPlat() {
        return plat;
    }
    public PlatEtat getEtat() {
        return etat;
    }

    public void changeState(PlatEtat nouvelEtat) {
        this.etat = nouvelEtat;
    }


}