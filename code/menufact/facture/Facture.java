package menufact.facture;

import ingredients.Ingredient;
import inventaire.Inventaire;
import menufact.Chef;
import menufact.Client;
import menufact.facture.exceptions.FactureException;
import menufact.plats.EventListener;
import menufact.plats.EventManager;
//import menufact.plats.NouveauPlatListener;
import menufact.plats.PlatChoisi;
import menufact.plats.PlatChoisiFactory;

import java.util.ArrayList;
import java.util.Date;

/**
 * Une facture du systeme Menufact
 * @author Domingo Palao Munoz
 * @version 1.0
 */
public class Facture {
    public EventManager events;
    private final PlatChoisiFactory platChoisiFactory;
    private final Date date;
    private final String description;
    private FactureEtat etat;
    private final ArrayList<PlatChoisi> platchoisi = new ArrayList<PlatChoisi>();
    private int courant = 0;
    private Client client;

    private Inventaire inventaire;


    /**********************Constantes ************/
    private final double TPS = 0.05;
    private final double TVQ = 0.095;

    /**
     *
     * @param client le client de la facture
     */
    public void associerClient (Client client)
    {
        this.client = client;
    }

    /**
     * Calcul du sous total de la facture
     * @return le sous total
     */
    public double sousTotal()
    {
        double soustotal=0;
        for (PlatChoisi p : platchoisi)
            soustotal += p.getQuantite() * p.getPlat().getPrix();
        return soustotal;
    }

    /**
     *
     * @return le total de la facture
     */
    public double total(){
        return sousTotal()+tps()+tvq();
    }

    /**
     *
     * @return la valeur de la TPS
     */
    private double tps(){
        return TPS*sousTotal();
    }

    /**
     *
     * @return la valeur de la TVQ
     */
    private  double tvq(){
        return TVQ*(TPS+1)*sousTotal();
    }

    /**
     * Permet de chager l'état de la facture à PAYEE
     */
    public void payer()
    {
        etat = FactureEtat.PAYEE;
    }
    /**
     * Permet de chager l'état de la facture à FERMEE
     */
    public void fermer()
    {
        etat = FactureEtat.FERMEE;
    }

    /**
     * Permet de changer l'état de la facture à OUVERTE
     * @throws FactureException en cas que la facture soit PAYEE
     */
    public void ouvrir() throws FactureException
    {
        if (etat == FactureEtat.PAYEE)
            throw new FactureException("La facture ne peut pas être reouverte.");
        else
            etat = FactureEtat.OUVERTE;
    }

    /**
     *
     * @return l'état de la facture
     */
    public FactureEtat getEtat()
    {
        return etat;
    }

    /**
     *
     * @param description la description de la Facture
     */
    public Facture(String description) {
        platChoisiFactory = new PlatChoisiFactory();
        date = new Date();
        etat = FactureEtat.OUVERTE;
        courant = 0;
        this.description = description;
        events = new EventManager("nouveauPlat");
    }

    /**
     *
     * @param p un plat choisi
     * @throws FactureException Seulement si la facture est OUVERTE
     */
    public void ajoutePlat(PlatChoisi p) throws FactureException {
        if (etat == FactureEtat.OUVERTE) {
            //events.subscribe("nouveauPlat", new NouveauPlatListener(platchoisi.toString()));
            events.notify("nouveauPlat", p, inventaire);
            boolean platExists = false;

            for (PlatChoisi existingPlat : platchoisi) {
                if (existingPlat.getPlat().equals(p.getPlat())) {
                    existingPlat.setQuantite(existingPlat.getQuantite() + p.getQuantite());
                    platExists = true;
                    break;
                }
            }

            if (!platExists) {
                platchoisi.add(p);
            }


        } else {
            throw new FactureException("On peut ajouter un plat seulement sur une facture OUVERTE.");
        }
    }

    public void setChef(Chef chef) {
        events.subscribe("nouveauPlat", chef);
    }

    public void setSuscriber(EventListener suscriber) {
        events.subscribe("nouveauPlat", suscriber);
    }

    /**
     *
     * @return le contenu de la facture en chaîne de caracteres
     */
    @Override
    public String toString() {

        return "Facture\n{" +
                "date=" + date +
                ", description='" + description + '\'' +
                ", etat=" + etat +
                ", platchoisi=" + platchoisi +
                ", courant=" + courant +
                ", client=" + client +
                ", TPS=" + TPS +
                ", TVQ=" + TVQ +
                '}';


    }

    /**
     *
     * @return une chaîne de caractères avec la facture à imprimer
     */
    public String genererFacture()
    {
        String lesPlats = "";
        String factureGenere = "";

        int i =1;


        factureGenere =   "Facture generee.\n" +
                "Date:" + date + "\n" +
                "Description: " + description + "\n" +
                "Client:" + client.getNom() + "\n" +
                "Les plats commandes:" + "\n" + lesPlats;

        factureGenere += "Seq   Plat         Prix   Quantite\n";
        for (PlatChoisi plat : platchoisi)
        {
            factureGenere +=  i + "     " + plat.getPlat().getDescription() +  "  " + plat.getPlat().getPrix() +  "      " + plat.getQuantite() + "\n";
            i++;
        }

        factureGenere += "          TPS:               " + tps() + "\n";
        factureGenere += "          TVQ:               " + tvq() + "\n";
        factureGenere += "          Le total est de:   " + total() + "\n";

        return factureGenere;
    }

    public void setInventaire(Inventaire inventaire){
        this.inventaire = inventaire;
    }

    public Inventaire getInventaire(){
        return inventaire;
    }

    public PlatChoisi getPlatCourant(){
        return platchoisi.get(courant);
    }

    public Client getClient(){
        return client;
    }
}


