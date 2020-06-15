package com.SiteECommerce.ProjectPFA.bean;

import javax.persistence.*;

@Entity
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String ref;
    private String nom;
    private String adresse;
    private String email;
    private String tel;
    @ManyToOne
    private LigneProduit ligneProduit;

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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public LigneProduit getLigneProduit() {
        return ligneProduit;
    }

    public void setLigneProduit(LigneProduit ligneProduit) {
        this.ligneProduit = ligneProduit;
    }
}
