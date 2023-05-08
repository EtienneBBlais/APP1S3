package menufact;

import inventaire.Inventaire;
import menufact.exceptions.MenuException;
import menufact.plats.PlatAuMenu;

import java.util.ArrayList;

public class MenuFact {
    /************************
    --Attributs
     ***********************/

    private Inventaire inventaire;

    private ArrayList<Menu> menu = new ArrayList<Menu>();
    //private Menu menu;

    private int courant;

    void ajoute (Menu m)
    {
        menu.add(m);
    }

    public void position(int i)
    {
        courant = i;
    }

    public Menu menuCourant()
    {
        return menu.get(courant);
    }

    public void positionSuivante() throws MenuException
    {
        if (courant+1 >= menu.size())
            throw new MenuException("On depasse le nombre maximale de menus.");
        else
            courant++;
    }

    public void positionPrecedente() throws MenuException
    {
        if (courant-1 < 0)
            throw new MenuException("On depasse le nombre minimale de menu");
        else
            courant--;
    }
}
