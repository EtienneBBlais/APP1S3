package menufact;

import inventaire.Inventaire;
import menufact.exceptions.MenuException;
import menufact.facture.exceptions.FactureException;
import menufact.facture.Facture;
import menufact.plats.PlatChoisi;


import java.util.ArrayList;

public class MenuFact {
    /************************
    --Attributs
     ***********************/

    private Inventaire inventaire;

    private Chef chef = new Chef();

    private ArrayList<Menu> menu = new ArrayList<Menu>();

    private ArrayList<Facture> factures = new ArrayList<Facture>();
    //private Menu menu;

    private int courantMenu;

    private int courantFacture;
    /************************
    --Constructeur
     ***********************/
    public MenuFact(){
        courantMenu = 0;
        courantFacture = 0;
        inventaire = Inventaire.getInstance();
    }

    /*************************
    --Fonction menu
     ************************/

    public void ajouteMenu (Menu m)
    {
        menu.add(m);
    }

    public void positionMenu(int i)
    {
        courantMenu = i;
    }

    public Menu menuCourant()
    {
        return menu.get(courantMenu);
    }

    public void positionSuivanteMenu() throws MenuException
    {
        if (courantMenu+1 >= menu.size())
            throw new MenuException("On depasse le nombre maximale de menus.");
        else
            courantMenu++;
    }

    public void positionPrecedenteMenu() throws MenuException
    {
        if (courantMenu-1 < 0)
            throw new MenuException("On depasse le nombre minimale de menu");
        else
            courantMenu--;
    }

    /****************************
    --Fonction Facture
     ***************************/

    public void ajouteFacture (Facture f)
    {
        f.setChef(chef);
        factures.add(f);
    }

    public void positionFacture(int i)
    {
        courantFacture = i;
    }

    public Facture FactureCourant()
    {
        return factures.get(courantFacture);
    }

    public void positionSuivanteFacture() throws FactureException
    {
        if (courantFacture+1 >= factures.size())
            throw new FactureException("On depasse le nombre maximale de facture.");
        else
            courantFacture++;
    }

    public void positionPrecedenteFacture() throws FactureException
    {
        if (courantFacture-1 < 0)
            throw new FactureException("On depasse le nombre minimale de facture");
        else
            courantFacture--;
    }

    public PlatChoisi getPlatFactureCourant(){
        return factures.get(courantFacture).getPlatCourant();
    }
}
