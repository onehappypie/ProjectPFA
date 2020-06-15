package com.SiteECommerce.ProjectPFA.bean;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class LigneProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private int quantiteFourni;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateFournisseur;
    @OneToMany(mappedBy = "ligneProduit")
    private List<Produit> produits;
    @OneToMany(mappedBy = "ligneProduit")
    private List<Fournisseur> fournisseur;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantiteFourni() {
        return quantiteFourni;
    }

    public void setQuantiteFourni(int quantiteFourni) {
        this.quantiteFourni = quantiteFourni;
    }

    public Date getDateFournisseur() {
        return dateFournisseur;
    }

    public void setDateFournisseur(Date dateFournisseur) {
        this.dateFournisseur = dateFournisseur;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    public List<Fournisseur> getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(List<Fournisseur> fournisseur) {
        this.fournisseur = fournisseur;
    }
}
