package com.SiteECommerce.ProjectPFA.bean;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String ref;
    private String libele;
    private String description;
    private String devise;
    private Double prixProduit;
    private Double soldeProduit;
    private Double quantiteDispoProduit;
    private String imageProduit;
    private boolean nouveauteProduit;
    private Double taxe;
    private float prixLivre;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateSaisie;
    @ManyToOne
    private Categorie categorie;
    @ManyToOne
    private LigneSortie ligneSortie;
    @ManyToOne
    private LigneProduit ligneProduit;
    @ManyToOne
    private LigneEntree ligneEntree;
    @ManyToOne
    private Marque marque;
    @ManyToOne
    private Utilisateur utilisateur;
    @ManyToOne
    private Commande commande;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getLibele() {
        return libele;
    }

    public void setLibele(String libele) {
        this.libele = libele;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDevise() {
        return devise;
    }

    public void setDevise(String devise) {
        this.devise = devise;
    }

    public Double getPrixProduit() {
        return prixProduit;
    }

    public void setPrixProduit(Double prixProduit) {
        this.prixProduit = prixProduit;
    }

    public Double getSoldeProduit() {
        return soldeProduit;
    }

    public void setSoldeProduit(Double soldeProduit) {
        this.soldeProduit = soldeProduit;
    }

    public Double getQuantiteDispoProduit() {
        return quantiteDispoProduit;
    }

    public void setQuantiteDispoProduit(Double quantiteDispoProduit) {
        this.quantiteDispoProduit = quantiteDispoProduit;
    }

    public String getImageProduit() {
        return imageProduit;
    }

    public void setImageProduit(String imageProduit) {
        this.imageProduit = imageProduit;
    }

    public boolean isNouveauteProduit() {
        return nouveauteProduit;
    }

    public void setNouveauteProduit(boolean nouveauteProduit) {
        this.nouveauteProduit = nouveauteProduit;
    }

    public Double getTaxe() {
        return taxe;
    }

    public void setTaxe(Double taxe) {
        this.taxe = taxe;
    }

    public float getPrixLivre() {
        return prixLivre;
    }

    public void setPrixLivre(float prixLivre) {
        this.prixLivre = prixLivre;
    }

    public Date getDateSaisie() {
        return dateSaisie;
    }

    public void setDateSaisie(Date dateSaisie) {
        this.dateSaisie = dateSaisie;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public LigneSortie getLigneSortie() {
        return ligneSortie;
    }

    public void setLigneSortie(LigneSortie ligneSortie) {
        this.ligneSortie = ligneSortie;
    }

    public LigneProduit getLigneProduit() {
        return ligneProduit;
    }

    public void setLigneProduit(LigneProduit ligneProduit) {
        this.ligneProduit = ligneProduit;
    }

    public LigneEntree getLigneEntree() {
        return ligneEntree;
    }

    public void setLigneEntree(LigneEntree ligneEntree) {
        this.ligneEntree = ligneEntree;
    }

    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }
}