package menufact;

import ingredients.*;
import ingredients.exceptions.IngredientException;
import inventaire.Inventaire;
import menufact.facture.exceptions.FactureException;
import menufact.exceptions.MenuException;
import menufact.facture.Facture;
import menufact.plats.*;

public class TestMenuFact03 {

    private final MenuFactController menuController;

    private final PlatAuMenu p1;
    private final PlatAuMenu p2;
    private final PlatAuMenu p3;
    private final PlatAuMenu p4;
    private final PlatAuMenu p5;
    private PlatSante ps1;
    private PlatSante ps2;
    private PlatSante ps3;
    private PlatSante ps4;
    private PlatSante ps5;

<<<<<<< HEAD
    private final FactoryIngredient factory = new FactoryIngredient();
=======
    private PlatEnfant pe1;
    private PlatEnfant pe2;
    private PlatEnfant pe3;

    private FactoryIngredient factory = new FactoryIngredient();
>>>>>>> 2411431b432c3ee0bbfd1eca7cafa612c80cf9e1
    private static Menu m1;
    private static Menu m2;


<<<<<<< HEAD


    private static final Facture f1 = new Facture("Ma facture");
=======
    private static Facture f1 = new Facture("Ma facture");
>>>>>>> 2411431b432c3ee0bbfd1eca7cafa612c80cf9e1

    private final Client c1;

    public TestMenuFact03(){
        menuController = new MenuFactController();

        p1 = new PlatAuMenu(0,"PlatAuMenu0",10);
        p2 = new PlatAuMenu(1,"PlatAuMenu1",20);
        p3 = new PlatAuMenu(2,"PlatAuMenu2",30);
        p4 = new PlatAuMenu(3,"PlatAuMenu3",40);
        p5 = new PlatAuMenu(4,"PlatAuMenu4",50);

        ps1 = new PlatSante(p1, 11, 11, 11);
        ps2 = new PlatSante(p2, 11, 11, 11);
        ps3 = new PlatSante(p3, 11, 11, 11);
        ps4 = new PlatSante(p4, 11, 11, 11);
        ps5 = new PlatSante(p5, 11, 11, 11);

        pe1 = new PlatEnfant(p1, .75);
        pe2 = new PlatEnfant(p2, .75);
        pe3 = new PlatEnfant(p3, .75);


        m1 = new Menu("Menu 1");
        m2 = new Menu("Menu 2");



        c1 = new Client(1,"Mr Client","1234567890");










    }
    public static void main(String[] args) {
        TestMenuFact03 t = new TestMenuFact03();

        t.test1_AffichePlatsAuMenu();
        t. test2_AffichePlatsSante();
        t.test3_AffichePlatEnfant();
        try {
            t.test4_AjoutMenu();
        } catch (MenuException e) {
            System.out.println(e.getMessage());
        }

        t.test5_AjoutPlatsAuMenu();


        try {
            t.test6_DeplacementMenuAvancer();
        } catch (MenuException e) {
            System.out.println(e.getMessage());
        }

        try {
            t.test7_DeplacementMenuReculer();
        } catch (MenuException e) {
            System.out.println(e.getMessage());
        }

        try {
            t.test8_CreerFacture();
        } catch (FactureException e) {
            System.out.println(e.getMessage());
        }


        t.test9_AjouterClientFacture();

        try {
            t.test13_Inventaire();
        } catch (IngredientException fe)
        {
            System.out.println(fe.getMessage());
        } catch (MenuException e) {
            System.out.println(e.getMessage());
        } catch (FactureException e) {
            throw new RuntimeException(e);
        }

        try {
            t.test10_AjouterPlatsFacture(1);
        } catch (FactureException fe)
        {
            System.out.println(fe.getMessage());
        }
        catch (MenuException me)
        {
            System.out.println(me);
        }

        t.test11_PayerFacture();

        try {
            t.test10_AjouterPlatsFacture(1);
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
            t.test12_AffichageRecette();
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
        t.afficherFacture();
        //menuController.genererFacture();
        //System.out.println(f1.genererFacture());


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

    private void test3_AffichePlatEnfant(){
        System.out.println("\n==================================");
        System.out.println("=== test3_AffichePlatEnfant");
        System.out.println("==================================");
        menuController.afficherPlat(pe1);
        menuController.afficherPlat(pe2);
        menuController.afficherPlat(pe3);
    }


    private void test4_AjoutMenu () throws MenuException
    {
        System.out.println("\n==================================");
        System.out.println("=== test4_AjoutMenu");
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


    private void test5_AjoutPlatsAuMenu()
    {
        System.out.println("\n==================================");
        System.out.println("=== test5_AjoutPlatsAuMenu");
        System.out.println("==================================");
        System.out.println("=== Ajout de plats au menu 1");
        menuController.positionMenu(0);
        menuController.ajouterPlat(p1);
        menuController.ajouterPlat(p2);
        menuController.ajouterPlat(ps1);
        menuController.ajouterPlat(pe2);


        System.out.println("=== Ajout de plats au menu 2");
        menuController.positionMenu(1);
        menuController.ajouterPlat(p3);
        menuController.ajouterPlat(ps3);
        menuController.ajouterPlat(pe3);

        menuController.positionMenu(0);
        menuController.afficherMenuCourant();
        menuController.positionMenu(1);
        menuController.afficherMenuCourant();

    }


    private void test6_DeplacementMenuAvancer() throws MenuException
    {
        System.out.println("\n==================================");
        System.out.println("=== test6_DeplacementMenuAvancer");
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


    private void test7_DeplacementMenuReculer() throws MenuException
    {
        System.out.println("\n==================================");
        System.out.println("===test7_DeplacementMenuReculer");
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

    private void test8_CreerFacture() throws FactureException
    {
        System.out.println("\n==================================");
        System.out.println("===test8_CreerFacture");
        System.out.println("==================================");

        menuController.ajouterFacture(f1);
        menuController.afficherFactureCourant();
    }


    private void test9_AjouterClientFacture() {
        System.out.println("\n==================================");
        System.out.println("===test9_AjouterClientFacture");
        System.out.println("==================================");
        menuController.associerClient(c1);
        menuController.afficherFactureCourant();
    }
    private void test10_AjouterPlatsFacture(int pos) throws MenuException,FactureException
    {
        System.out.println("\n==================================");
        System.out.println("===test10_AjouterPlatsFacture");
        System.out.println("==================================");

        menuController.getFactureCourant().setInventaire(Inventaire.getInstance());
        PlatChoisi platChoisi = new PlatChoisi(m1.platCourant(),5);
        try
        {
            menuController.ajouterPlatFacture(platChoisi);
        }
        catch (FactureException fe)
        {
            throw fe;
        }
        menuController.afficherFactureCourant();
    }

    private void test11_PayerFacture()
    {
        System.out.println("\n==================================");
        System.out.println("===test11_PayerFacture");
        System.out.println("==================================");

        System.out.println("Avant payer la facture");
        menuController.afficherFactureCourant();
        menuController.payerFacture();
        System.out.println("Apres avoir paye la facture");
        menuController.afficherFactureCourant();

    }

    private void test12_AffichageRecette() throws IngredientException, MenuException{
        System.out.println("\n==================================");
        System.out.println("===test12_AffichageRecette");
        System.out.println("==================================");

        FactoryIngredient factory = new FactoryIngredient();
        Ingredient i1 = factory.nouveauIngredient("Steak", "Angus", TypeIngredient.VIANDE);
        QuantiteIngredient l1;
        l1 = new QuantiteIngredient(i1, 100);

        Ingredient i2 = factory.nouveauIngredient("Brocoli", "Vert", TypeIngredient.LEGUME);
        QuantiteIngredient l2;
        l2 = new QuantiteIngredient(i2, 50);



        Recette r1 = new Recette();
        r1.ajouterIngredient(l1);
        r1.ajouterIngredient(l2);
        System.out.println(r1);


    }
    private void test13_Inventaire() throws IngredientException, MenuException, FactureException {

        Inventaire inventaire = Inventaire.getInstance();
        Ingredient brocoli = factory.nouveauIngredient("Brocoli", "Vert", TypeIngredient.LEGUME);
        Ingredient boeuf = factory.nouveauIngredient("Boeuf", "Angus", TypeIngredient.VIANDE);
        Legume legume = new Legume();
        QuantiteIngredient boeuf10 = null;
        QuantiteIngredient brocoli50 = null;
        try {
            boeuf10 = new QuantiteIngredient(boeuf, 10);
            brocoli50 = new QuantiteIngredient(brocoli, 50);

        }
        catch (IngredientException ingredientException){

        }
        inventaire.ajouter(boeuf10);
        inventaire.ajouter(brocoli50);




        System.out.println("\n==================================");
        System.out.println("===test13_Inventaire");
        System.out.println("==================================");

        FactoryIngredient factory = new FactoryIngredient();

        QuantiteIngredient boeuf1;
        boeuf1 = new QuantiteIngredient(boeuf, 1);


        QuantiteIngredient brocoli5;
        brocoli5 = new QuantiteIngredient(brocoli, 5);
        Chef chef = new Chef();




        Recette r1 = new Recette();
        r1.ajouterIngredient(boeuf1);
        r1.ajouterIngredient(brocoli5);

        System.out.println("=== Affichage de la recette");
        menuController.afficherRecette(r1);
        System.out.println("=== Affichage de l'inventaire");
        menuController.afficherInventaire();
        System.out.println("=== Ajout de 2 plat a la facture");

        IPlat iplat = new PlatAuMenu(2, "Steak au broco", 20);
        iplat.setRecette(r1);
        PlatChoisi platChoisi = new PlatChoisi(iplat, 2);

        Facture facture = new Facture("ceci est une facture");
        facture.setInventaire(inventaire);
        facture.setChef(chef);
        facture.ajoutePlat(platChoisi);
        System.out.println("=== Affichage de l'inventaire");
        menuController.afficherInventaire();




        //System.out.println(r1);


    }

    private void afficherFacture(){
        menuController.genererFacture();
    }
}
