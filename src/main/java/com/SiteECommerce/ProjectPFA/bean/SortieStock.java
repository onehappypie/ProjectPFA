package com.SiteECommerce.ProjectPFA.bean;

import javax.persistence.*;
import java.util.Date;

@Entity

public class SortieStock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateSaisie;
    @ManyToOne
    private LigneSortie ligneSortie;
    @OneToOne
    private Commande commande;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateSaisie() {
        return dateSaisie;
    }

    public void setDateSaisie(Date dateSaisie) {
        this.dateSaisie = dateSaisie;
    }

    public LigneSortie getLigneSortie() {
        return ligneSortie;
    }

    public void setLigneSortie(LigneSortie ligneSortie) {
        this.ligneSortie = ligneSortie;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }
}
