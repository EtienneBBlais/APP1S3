package menufact.plats;

public interface PlatAuMenuBuilder {
    PlatAuMenuBuilder setCode(int code);
    PlatAuMenuBuilder setDescription(String description);
    PlatAuMenuBuilder setPrix(double prix);
    PlatAuMenu build();
}