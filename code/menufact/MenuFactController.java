package menufact;

import ingredients.QuantiteIngredient;
import ingredients.exceptions.IngredientException;
import inventaire.Inventaire;
import menufact.exceptions.MenuException;
import menufact.facture.Facture;
import menufact.facture.exceptions.FactureException;
import menufact.plats.EventListener;
import menufact.plats.IPlat;
import menufact.plats.PlatAuMenu;
import menufact.plats.PlatChoisi;

public class MenuFactController implements EventListener {

    private final MenuFact menuFact;

    private final MenuFactView menuFactView;

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

    public void ajouterPlat(IPlat plat){
        menuFact.menuCourant().ajoute(plat);
    }

    public void positionPlat(int position){
        menuFact.menuCourant().position(position);
    }

    /****************************
    --Fonction sur les menus
     ***************************/
    public void ajouterMenu(Menu menu){
        menuFact.ajouteMenu(menu);
    }

    public void afficherMenuCourant(){
        menuFactView.afficherMenu(menuFact.menuCourant());
    }

    public void menuSuivant() throws MenuException {
        try {
            menuFact.positionSuivanteMenu();
        }
        catch (MenuException me){
            throw me;
        }
    }

    public Menu getMenuCourant(){
        return menuFact.menuCourant();
    }

    public void menuPrecedent() throws MenuException {
        try {
            menuFact.positionPrecedenteMenu();
        }
        catch (MenuException me){
            throw me;
        }
    }
    public void positionMenu(int position){
        menuFact.positionMenu(position);
    }

    /****************************
    --Fonction sur les factures
     ***************************/
    public void ajouterPlatFacture(PlatChoisi plat) throws FactureException{
        try {
            menuFact.FactureCourant().ajoutePlat(plat);
        }
        catch(FactureException fe){
            throw fe;
        }
    }

    public void ajouterFacture(Facture facture){
        facture.setSuscriber(this);
        menuFact.ajouteFacture(facture);

    }

    public void afficherFactureCourant(){
        menuFactView.afficherFacture(menuFact.FactureCourant());
    }

    public void factureSuivant() throws FactureException {
        try {
            menuFact.positionSuivanteFacture();
        }
        catch (FactureException fe){
            throw fe;
        }
    }

    public void facturePrecedent() throws FactureException {
        try {
            menuFact.positionPrecedenteFacture();
        }
        catch (FactureException fe){
            throw fe;
        }
    }
    public void positionFacture(int position){
        menuFact.positionFacture(position);
    }

    public void payerFacture(){
        menuFact.FactureCourant().payer();
    }

    public void associerClient(Client client){
        menuFact.FactureCourant().associerClient(client);
    }

    public PlatChoisi getPlatFactureCourant(){
        return menuFact.getPlatFactureCourant();
    }

    public Facture getFactureCourant(){
        return menuFact.FactureCourant();
    }

    @Override
    public void update(String eventType, PlatChoisi zePlat, Inventaire inventaire) {
        String affichage = "";
        affichage += zePlat.getEtat().onPreparation();
        affichage += "\n";
        affichage += zePlat.getEtat().onTermine();
        affichage += "\n";
        affichage += zePlat.getEtat().onServi();
        affichage += "\n";
        menuFactView.afficherNotif(affichage);
    }

}
