package menufact.plats;

public class PlatAuMenu implements IPlat {

    /************************************
    --Attribut
     ***********************************/
    private int code;
    private String description;
    private double prix;

    private Recette recette;

    /***********************************
    --Constructeur
     **********************************/
    public PlatAuMenu(int code, String description, double prix) {
        this.code = code;
        this.description = description;
        this.prix = prix;
        recette = new Recette();
    }

    public PlatAuMenu() {
    }

    /**********************************
    --Affichage
     *********************************/
    @Override
    public String toString() {
        return "menufact.plats.PlatAuMenu{" +
                "code=" + code +
                ", description='" + description + '\'' +
                ", prix=" + prix +
                "}\n";
    }

    /***************************************
    --Getter/Setter
     **************************************/
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    public Recette getRecette() {
        return recette;
    }
}
