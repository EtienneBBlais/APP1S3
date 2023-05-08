package menufact;

import menufact.exceptions.MenuException;
import menufact.plats.IPlat;
import menufact.plats.PlatAuMenu;

public class MenuFactController {

    private MenuFact menuFact;

    private MenuFactView menuFactView;

    public MenuFactController(){
        menuFact = new MenuFact();
        menuFactView = new MenuFactView();
    }

    /****************************
    --Fonction sur les plats
     ***************************/

    public IPlat getPlatCourant(){
        return menuFact.menuCourant().platCourant();
    }
    public void afficherPlat(IPlat plat){
        menuFactView.afficherPlat(plat);
    }

    public void afficherPlatCourant(){
        menuFactView.afficherPlat(menuFact.menuCourant().platCourant());
    }

    public void platSuivant() throws MenuException{
        try{
            menuFact.menuCourant().positionSuivante();
        }
        catch(MenuException me){
            throw me;
        }
    }

    public void platPrecedent() throws MenuException{
        try{
            menuFact.menuCourant().positionPrecedente();
        }
        catch(MenuException me){
            throw me;
        }
    }

    public void ajouterPlat(PlatAuMenu plat){
        menuFact.menuCourant().ajoute(plat);
    }

    public void positionPlat(int position){
        menuFact.menuCourant().position(position);
    }

    public void ajouterMenu(Menu menu){
        menuFact.ajoute(menu);
    }

    public void afficherMenuCourant(){
        menuFactView.afficherMenu(menuFact.menuCourant());
    }

    public void menuSuivant() throws MenuException {
        try {
            menuFact.positionSuivante();
        }
        catch (MenuException me){
            throw me;
        }
    }

    public void menuPrecedent() throws MenuException {
        try {
            menuFact.positionPrecedente();
        }
        catch (MenuException me){
            throw me;
        }
    }

    public void positionMenu(int position){
        menuFact.position(position);
    }

    public void updateView(){

    }
}
