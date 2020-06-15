package com.SiteECommerce.ProjectPFA.service.interfaces;

import com.SiteECommerce.ProjectPFA.bean.Fournisseur;
import com.SiteECommerce.ProjectPFA.bean.ProduitPersonnalise;

import java.util.List;

public interface ProduitPersonaliseService {
    public ProduitPersonnalise findById(Long id);
    public List<ProduitPersonnalise> findAll();
    public ProduitPersonnalise save(ProduitPersonnalise produitPersonnalise);
    public ProduitPersonnalise update(Long id);
    public int delete(Long id);
}
