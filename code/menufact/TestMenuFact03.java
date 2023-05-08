package menufact;

import ingredients.*;
import ingredients.exceptions.IngredientException;
import menufact.facture.exceptions.FactureException;
import menufact.exceptions.MenuException;
import menufact.facture.Facture;
import menufact.plats.PlatAuMenu;
import menufact.plats.PlatChoisi;
import menufact.plats.PlatSante;
import menufact.plats.Recette;

public class TestMenuFact03 {

    private MenuFactController menuController;

    private PlatAuMenu p1;
    private PlatAuMenu p2;
    private PlatAuMenu p3;
    private PlatAuMenu p4;
    private PlatAuMenu p5;
    private PlatSante ps1;
    private PlatSante ps2;
    private PlatSante ps3;
    private PlatSante ps4;
    private PlatSante ps5;


    private static Menu m1;
    private static Menu m2;

    private static Facture f1 = new Facture("Ma facture");

    private Client c1;

    public TestMenuFact03(){
        menuController = new MenuFactController();

        p1 = new PlatAuMenu(0,"PlatAuMenu0",10);
        p2 = new PlatAuMenu(1,"PlatAuMenu1",20);
        p3 = new PlatAuMenu(2,"PlatAuMenu2",30);
        p4 = new PlatAuMenu(3,"PlatAuMenu3",40);
        p5 = new PlatAuMenu(4,"PlatAuMenu4",50);


        ps1 = new PlatSante(10,"PlatSante0",10,11,11,11);
        ps2 = new PlatSante(11,"PlatSante1",20,11,11,11);
        ps3 = new PlatSante(12,"PlatSante2",30,11,11,11);
        ps4 = new PlatSante(13,"PlatSante3",40,11,11,11);
        ps5 = new PlatSante(14,"PlatSante4",50,11,11,11);


        m1 = new Menu("menufact.Menu 1");
        m2 = new Menu("menufact.Menu 2");



        c1 = new Client(1,"Mr Client","1234567890");
    }
    public static void main(String[] args) {
        TestMenuFact03 t = new TestMenuFact03();







        t.test1_AffichePlatsAuMenu();
        t. test2_AffichePlatsSante();
        try {
            t.test3_AjoutMenu();
        } catch (MenuException e) {
            System.out.println(e.getMessage());
        }

        t.test4_AjoutPlatsAuMenu();


        try {
            t.test5_DeplacementMenuAvancer();
        } catch (MenuException e) {
            System.out.println(e.getMessage());
        }

        try {
            t.test6_DeplacementMenuReculer();
        } catch (MenuException e) {
            System.out.println(e.getMessage());
        }

        try {
            t.test7_CreerFacture();
        } catch (FactureException e) {
            System.out.println(e.getMessage());
        }


        t.test8_AjouterClientFacture();

        try {
            t.test8_AjouterPlatsFacture(1);
        } catch (FactureException fe)
        {
            System.out.println(fe.getMessage());
        }
        catch (MenuException me)
        {
            System.out.println(me);
        }

        t.test9_PayerFacture();

        try {
            t.test8_AjouterPlatsFacture(1);
        } catch (FactureException fe)
        {
            System.out.println(fe.getMessage());
        }
        catch (MenuException me)
        {
            System.out.println(me);
        }

        try {
            f1.ouvrir();
        } catch (FactureException fe)
        {
            System.out.println(fe.getMessage());
        }

        try {
            t.test10_AffichageRecette();
        }
        catch (IngredientException ie)
        {
            System.out.println(ie.getMessage());
        }
        catch (MenuException me)
        {
            System.out.println(me.getMessage());
        }





        System.out.println("FIN DE TOUS LES TESTS...");

        System.out.println(f1.genererFacture());
    }

    private void test1_AffichePlatsAuMenu()
    {
        System.out.println("\n==================================");
        System.out.println("=== test1_AffichePlatsAuMenu");
        System.out.println("==================================");

        menuController.afficherPlat(p1);
        menuController.afficherPlat(p2);
        menuController.afficherPlat(p3);
        menuController.afficherPlat(p4);
        menuController.afficherPlat(p5);

    }


    private void test2_AffichePlatsSante()
    {
        System.out.println("\n==================================");
        System.out.println("=== test2_AffichePlatsSante");
        System.out.println("==================================");
        menuController.afficherPlat(ps1);
        menuController.afficherPlat(ps2);
        menuController.afficherPlat(ps3);
        menuController.afficherPlat(ps4);
        menuController.afficherPlat(ps5);
    }


    private void test3_AjoutMenu () throws MenuException
    {
        System.out.println("\n==================================");
        System.out.println("=== test3_AjoutMenu");
        System.out.println("==================================");
        menuController.ajouterMenu(m1);
        menuController.ajouterMenu(m2);
        menuController.afficherMenuCourant();
        try{
            menuController.menuSuivant();
        }
        catch (MenuException me){
            throw me;
        }
        menuController.afficherMenuCourant();
    }


    private void test4_AjoutPlatsAuMenu()
    {
        System.out.println("\n==================================");
        System.out.println("=== test4_AjoutPlatsAuMenu");
        System.out.println("==================================");
        System.out.println("=== Ajout de plats au menu 1");
        m1.ajoute(p1);
        m1.ajoute(p2);
        m1.ajoute(ps1);
        m1.ajoute(ps2);


        System.out.println("=== Ajout de plats au menu 2");
        m2.ajoute(p3);
        m2.ajoute(p4);
        m2.ajoute(ps3);
        m2.ajoute(ps4);

        System.out.println(m1);
        System.out.println(m2);

    }


    private void test5_DeplacementMenuAvancer() throws MenuException
    {
        System.out.println("\n==================================");
        System.out.println("=== test5_DeplacementMenuAvancer");
        System.out.println("==================================");

        System.out.println("===Selectionner un plat du menu 0");
        menuController.positionMenu(0);
        menuController.positionPlat(0);

        System.out.println("=== Afficher le plat courant");
        menuController.afficherPlatCourant();
        try {

            System.out.println("=== Avancer le plat courant");
            System.out.println("1.");
            menuController.platSuivant();
            System.out.println("2.");
            menuController.platSuivant();
            System.out.println("3.");
            menuController.platSuivant();
            System.out.println("4.");
            menuController.platSuivant();
            System.out.println("5.");
            menuController.platSuivant();
        }
        catch (MenuException me)
        {
            throw me;
        }
    }


    private void test6_DeplacementMenuReculer() throws MenuException
    {
        System.out.println("\n==================================");
        System.out.println("===test6_DeplacementMenuReculer");
        System.out.println("==================================");

        System.out.println("===Selectionner un plat du menu 3");
        menuController.positionPlat(3);

        System.out.println("=== Afficher le plat courant");
        menuController.afficherPlatCourant();

        try {

            System.out.println("=== Reculer le plat courant");
            System.out.println("2.");
            menuController.platPrecedent();
            System.out.println("1.");
            menuController.platPrecedent();
            System.out.println("0.");
            menuController.platPrecedent();
            System.out.println("-1.");
            menuController.platPrecedent();
            System.out.println("-2.");
            menuController.platPrecedent();
        }
        catch (MenuException me)
        {
            throw me;
        }
    }

    private void test7_CreerFacture() throws FactureException
    {
        System.out.println("\n==================================");
        System.out.println("===test7_CreerFacture");
        System.out.println("==================================");

        PlatChoisi platChoisi = new PlatChoisi(menuController.getPlatCourant(),5);
//        try
//        {
//            f1.ajoutePlat(platChoisi);
//        }
//        catch (FactureException fe)
//        {
//            throw fe;
//        }
        System.out.println(f1);
    }


    private void test8_AjouterClientFacture() {
        System.out.println("\n==================================");
        System.out.println("===test8_AjouterClientFacture");
        System.out.println("==================================");
        f1.associerClient(c1);
        System.out.println(f1);
    }
    private void test8_AjouterPlatsFacture(int pos) throws MenuException,FactureException
    {
        System.out.println("\n==================================");
        System.out.println("===test8_AjouterPlatsFacture");
        System.out.println("==================================");

        try{
            for (int i=0; i< pos; i++)
                m1.positionSuivante();
        }
        catch (MenuException me)
        {
            throw me;
        }

//        PlatChoisi platChoisi = new PlatChoisi(m1.platCourant(),5);
//        try
//        {
//            f1.ajoutePlat(platChoisi);
//        }
//        catch (FactureException fe)
//        {
//            throw fe;
//        }
        System.out.println(f1);
    }

    private void test9_PayerFacture()
    {
        System.out.println("\n==================================");
        System.out.println("===test9_PayerFacture");
        System.out.println("==================================");

        System.out.println("Avant payer la facture");
        System.out.println(f1);
        f1.payer();
        System.out.println("Apres avoir paye la facture");
        System.out.println(f1);
    }

    private void test10_AffichageRecette() throws IngredientException, MenuException{
        System.out.println("\n==================================");
        System.out.println("===test10_AffichageRecette");
        System.out.println("==================================");

        FactoryIngredient factory = new FactoryIngredient();
        Ingredient i1 = factory.nouveauIngredient("Steak", "Angus", TypeIngredient.VIANDE);
        ListeIngredient l1;
        l1 = new ListeIngredient(i1, 100);

        Ingredient i2 = factory.nouveauIngredient("Brocoli", "Vert", TypeIngredient.LEGUME);
        ListeIngredient l2;
        l2 = new ListeIngredient(i2, 50);



        Recette r1 = new Recette();
        r1.ajouterIngredient(l1);
        r1.ajouterIngredient(l2);
        System.out.println(r1);
    }
}