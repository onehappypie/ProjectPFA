package com.SiteECommerce.ProjectPFA.service.interfaces;

import com.SiteECommerce.ProjectPFA.bean.Fournisseur;
import com.SiteECommerce.ProjectPFA.bean.Produit;

import java.util.List;

public interface ProduitService {
    public Produit findById(Long id);
    public List<Produit> findAll();
    public Produit save(Produit produit);
    public Produit update(Long id);
    public int delete(Long id);
}
