package menufact.plats;

import java.util.HashMap;
import java.util.Map;

public class PlatChoisiFactory {
    private final Map<Integer, PlatChoisi> platChoisiMap;

    public PlatChoisiFactory() {
        platChoisiMap = new HashMap<>();
    }

    public PlatChoisi getPlatChoisi(PlatAuMenu plat, int quantite) {
        PlatChoisi platChoisi = platChoisiMap.get(plat.getCode());

        if (platChoisi == null) {
            platChoisi = new PlatChoisi(plat, quantite);
            platChoisiMap.put(plat.getCode(), platChoisi);
        } else {
            platChoisi.setQuantite(platChoisi.getQuantite() + quantite);
        }

        return platChoisi;
    }
}
