package menufact.plats;

import inventaire.Inventaire;

import java.io.File;

public interface EventListener {
    void update(String eventType, PlatChoisi zePlat, Inventaire inventaire);
}