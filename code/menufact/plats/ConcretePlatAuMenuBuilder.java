package menufact.plats;

public class ConcretePlatAuMenuBuilder implements PlatAuMenuBuilder {
    private int code;
    private String description;
    private double prix;
    private boolean isSpecial;

    @Override
    public PlatAuMenuBuilder setCode(int code) {
        this.code = code;
        return this;
    }

    @Override
    public PlatAuMenuBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public PlatAuMenuBuilder setPrix(double prix) {
        this.prix = prix;
        return this;
    }



    @Override
    public PlatAuMenu build() {
        PlatAuMenu plat = new PlatAuMenu(code, description, prix);
        return plat;
    }
}
