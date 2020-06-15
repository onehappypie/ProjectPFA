package com.SiteECommerce.ProjectPFA.service.interfaces;

import com.SiteECommerce.ProjectPFA.bean.Commande;
import com.SiteECommerce.ProjectPFA.bean.Fournisseur;
import com.SiteECommerce.ProjectPFA.bean.LigneEntree;

import java.util.List;

public interface LigneEntreeService {
    public LigneEntree findById(Long id);
    public List<LigneEntree> findAll();
    public LigneEntree save(LigneEntree ligneEntree);
    public LigneEntree update(Long id);
    public int delete(Long id);
}
