package com.SiteECommerce.ProjectPFA.bean;

import javax.persistence.*;
import java.util.Date;

@Entity
public class EntreeStock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String ref;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateEntree;

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

    public Date getDateEntree() {
        return dateEntree;
    }

    public void setDateEntree(Date dateEntree) {
        this.dateEntree = dateEntree;
    }
}
