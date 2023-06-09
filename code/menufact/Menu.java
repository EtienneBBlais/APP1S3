package menufact;

import menufact.exceptions.MenuException;
import menufact.plats.IPlat;
import menufact.plats.PlatAuMenu;

import java.util.ArrayList;

public class Menu {
    private String description;
    private int courant;
    private ArrayList<IPlat> plat = new ArrayList<IPlat>();

    public Menu(String description) {
        this.description = description;
    }

    void ajoute (IPlat p)
    {
        plat.add(p);
    }

    public void position(int i)
    {
        courant = i;
    }

    public IPlat platCourant()
    {
        return plat.get(courant);
    }

    public void positionSuivante() throws MenuException
    {
        if (courant+1 >= plat.size())
            throw new MenuException("On depasse le nombre maximale de plats.");
        else
            courant++;
    }

    public void positionPrecedente() throws MenuException
    {
        if (courant-1 < 0)
            throw new MenuException("On depasse le nombre minimale de plats");
        else
            courant--;
    }


    @Override
    public String toString() {
        return "menufact.Menu{" +
                "description='" + description + '\'' +
                ", courant=" + courant +
                ", plat=" + "\n" + plat +
                '}';
    }
}
