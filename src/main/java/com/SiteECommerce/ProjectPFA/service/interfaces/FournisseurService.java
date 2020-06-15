package com.SiteECommerce.ProjectPFA.service.interfaces;

import com.SiteECommerce.ProjectPFA.bean.Commande;
import com.SiteECommerce.ProjectPFA.bean.Fournisseur;

import java.util.List;

public interface FournisseurService {
    public Fournisseur findById(Long id);
    public List<Fournisseur> findAll();
    public Fournisseur save(Fournisseur fournisseur);
    public Fournisseur update(Long id);
    public int delete(Long id);
}
