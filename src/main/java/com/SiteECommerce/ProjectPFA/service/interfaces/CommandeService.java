package com.SiteECommerce.ProjectPFA.service.interfaces;

import com.SiteECommerce.ProjectPFA.bean.Categorie;
import com.SiteECommerce.ProjectPFA.bean.Commande;

import java.util.List;

public interface CommandeService {
    public Commande findById(Long id);
    public List<Commande> findAll();
    public Commande save(Commande commande);
    public Commande update(Long id);
    public int delete(Long id);
}
