package menufact.plats;



public class NouveauPlatListener implements EventListener {
    private String plat;

    public NouveauPlatListener(String plat) {
        this.plat = plat;
    }

    @Override
    public void update(String eventType) {
        System.out.println("nouveau plat Chef!:" + plat);
    }
}
