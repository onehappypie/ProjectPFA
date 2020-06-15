package com.SiteECommerce.ProjectPFA.bean;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String ref;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateCommande;
    private Double montantCommande;
    private int delaiLivraisonCommande;
    private String etatCommande;
    private String lieuLivraisonCommande;
    private String modeLivraison;
    private float prixTotalLivraison;
    private String modePaiement;
    @OneToOne
    private SortieStock sortieStock;
    @OneToMany(mappedBy = "commande")
    private List<Produit> produits;
    @OneToOne
    private Facture facture;

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

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public Double getMontantCommande() {
        return montantCommande;
    }

    public void setMontantCommande(Double montantCommande) {
        this.montantCommande = montantCommande;
    }

    public int getDelaiLivraisonCommande() {
        return delaiLivraisonCommande;
    }

    public void setDelaiLivraisonCommande(int delaiLivraisonCommande) {
        this.delaiLivraisonCommande = delaiLivraisonCommande;
    }

    public String getEtatCommande() {
        return etatCommande;
    }

    public void setEtatCommande(String etatCommande) {
        this.etatCommande = etatCommande;
    }

    public String getLieuLivraisonCommande() {
        return lieuLivraisonCommande;
    }

    public void setLieuLivraisonCommande(String lieuLivraisonCommande) {
        this.lieuLivraisonCommande = lieuLivraisonCommande;
    }

    public String getModeLivraison() {
        return modeLivraison;
    }

    public void setModeLivraison(String modeLivraison) {
        this.modeLivraison = modeLivraison;
    }

    public float getPrixTotalLivraison() {
        return prixTotalLivraison;
    }

    public void setPrixTotalLivraison(float prixTotalLivraison) {
        this.prixTotalLivraison = prixTotalLivraison;
    }

    public String getModePaiement() {
        return modePaiement;
    }

    public void setModePaiement(String modePaiement) {
        this.modePaiement = modePaiement;
    }

    public SortieStock getSortieStock() {
        return sortieStock;
    }

    public void setSortieStock(SortieStock sortieStock) {
        this.sortieStock = sortieStock;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    public Facture getFacture() {
        return facture;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }
}
