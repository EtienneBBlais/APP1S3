package menufact.plats;

import menufact.plats.PlatAuMenu;

public class PlatChoisi {
    private PlatAuMenu plat;
    private Chef etat;
    private int quantite;

    public PlatChoisi(PlatAuMenu plat, int quantite) {
        this.plat = plat;
        this.quantite = quantite;
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

    public void changeState(Chef nouvelEtat) {
        this.etat = nouvelEtat;
    }
}
