package com.SiteECommerce.ProjectPFA.bean;

import javax.persistence.*;
import java.util.List;

@Entity
public class LigneSortie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private Double quantiteSortie;
    private Double prixDeVente;
    @OneToMany(mappedBy = "ligneSortie")
    private List<Produit> produits;
    @OneToMany(mappedBy = "ligneSortie")
    private List<SortieStock> sortieStocks;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getQuantiteSortie() {
        return quantiteSortie;
    }

    public void setQuantiteSortie(Double quantiteSortie) {
        this.quantiteSortie = quantiteSortie;
    }

    public Double getPrixDeVente() {
        return prixDeVente;
    }

    public void setPrixDeVente(Double prixDeVente) {
        this.prixDeVente = prixDeVente;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    public List<SortieStock> getSortieStocks() {
        return sortieStocks;
    }

    public void setSortieStocks(List<SortieStock> sortieStocks) {
        this.sortieStocks = sortieStocks;
    }
}
