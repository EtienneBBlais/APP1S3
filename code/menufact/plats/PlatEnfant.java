package menufact.plats;

public class PlatEnfant extends PlatDecorator {
    private double proportion;
    private Recette recette;

    public PlatEnfant(IPlat plat, double proportion) {
        super(plat);
        this.proportion = proportion;
        recette = new Recette();
    }

    public double getProportion() {
        return proportion;
    }

    @Override
    public String toString() {
        return "PlatEnfant{" +
                "proportion=" + proportion +
                "} " + super.toString();
    }

    @Override
    public int getCode() {
        return plat.getCode();
    }

    @Override
    public void setCode(int code) {
        plat.setCode(code);
    }

    @Override
    public String getDescription() {
        return plat.getDescription();
    }

    @Override
    public void setDescription(String description) {
        plat.setDescription(description);
    }

    @Override
    public double getPrix() {
        return plat.getPrix();
    }

    @Override
    public void setPrix(double prix) {
        plat.setPrix(prix);
    }

    @Override
    public Recette getRecette() {
        return recette;
    }
}
