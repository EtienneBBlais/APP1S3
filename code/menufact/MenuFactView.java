package menufact;

import menufact.facture.Facture;
import menufact.plats.*;
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
}
