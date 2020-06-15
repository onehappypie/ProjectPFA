package com.SiteECommerce.ProjectPFA.bean;

import javax.persistence.*;
import java.util.List;

@Entity
public class LigneEntree {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private Double quantite;
    private Double priwAchat;
    @OneToMany(mappedBy = "ligneEntree")
    private List<Produit> produit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getQuantite() {
        return quantite;
    }

    public void setQuantite(Double quantite) {
        this.quantite = quantite;
    }

    public Double getPriwAchat() {
        return priwAchat;
    }

    public void setPriwAchat(Double priwAchat) {
        this.priwAchat = priwAchat;
    }

    public List<Produit> getProduit() {
        return produit;
    }

    public void setProduit(List<Produit> produit) {
        this.produit = produit;
    }
}
