package com.SiteECommerce.ProjectPFA.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class ProduitPersonnalise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String ref;
    private String type;
    private Double minProduit;
    private String Couleur;
    private String logo;
    private Double prixUniPerso;
    private Double totalPrixPerso;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getMinProduit() {
        return minProduit;
    }

    public void setMinProduit(Double minProduit) {
        this.minProduit = minProduit;
    }

    public String getCouleur() {
        return Couleur;
    }

    public void setCouleur(String couleur) {
        Couleur = couleur;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Double getPrixUniPerso() {
        return prixUniPerso;
    }

    public void setPrixUniPerso(Double prixUniPerso) {
        this.prixUniPerso = prixUniPerso;
    }

    public Double getTotalPrixPerso() {
        return totalPrixPerso;
    }

    public void setTotalPrixPerso(Double totalPrixPerso) {
        this.totalPrixPerso = totalPrixPerso;
    }
}
