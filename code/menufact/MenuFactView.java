package menufact;

import menufact.facture.Facture;
import menufact.plats.*;
import inventaire.Inventaire;
public class MenuFactView {

    /************************
    --Attributs
     ***********************/

    /*************************
    --Constructeur
     ************************/
    public MenuFactView(){

    }


    public void afficherMenu(Menu menu){
        System.out.println(menu);
    }

    public void afficherFacture(Facture facture){System.out.println(facture);}

    public void afficherPlat(IPlat plat){
        System.out.println(plat);
    }

    public void afficherNotif(String notif){System.out.println(notif);}

    public void afficherFactureGenere(String facture){
        System.out.println(facture);
    }

    public void afficherRecette(Recette recette){
        System.out.println(recette);
    }

    public void afficherInventaire(Inventaire inventaire){
        System.out.println(inventaire);
    }
}
