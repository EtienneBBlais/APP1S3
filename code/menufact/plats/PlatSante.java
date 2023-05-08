package menufact.plats;

public class PlatSante extends PlatDecorator {
    private double kcal;
    private double chol;
    private double gras;
    private Recette recette;

    public PlatSante(IPlat plat, double kcal, double chol, double gras) {
        super(plat);
        this.kcal = kcal;
        this.chol = chol;
        this.gras = gras;
        recette = new Recette();
    }



    @Override
    public String toString() {
        return "menufact.plats.PlatSante{" +
                "kcal=" + kcal +
                ", chol=" + chol +
                ", gras=" + gras +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o != this) {
            return false;
        }
        if (!(o instanceof PlatSante)) {
            return false;
        }
        PlatSante c = (PlatSante) o;
        if (c.getCode() != this.getCode()) {
            return false;
        }
        if (c.getPrix() != this.getPrix()) {
            return false;
        }
        if (c.getDescription() != this.getDescription()) {
            return false;
        }
        if(c.getChol() != this.chol){
            return false;
        }
        if(c.getGras() != this.gras){
            return false;
        }
        if(c.getKcal() != this.kcal){
            return false;
        }
        return true;
    }

    public double getKcal() {
        return kcal;
    }

    public double getChol() {
        return chol;
    }

    public double getGras() {
        return gras;
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

    @Override
    public void setRecette(Recette recette) {
        this.recette = recette;
    }
}
