package menufact.plats;

public abstract class PlatDecorator implements IPlat {
    protected IPlat plat;

    public PlatDecorator(IPlat plat) {
        this.plat = plat;
    }

    @Override
    public String toString(){
        return plat.toString();
    }
}
