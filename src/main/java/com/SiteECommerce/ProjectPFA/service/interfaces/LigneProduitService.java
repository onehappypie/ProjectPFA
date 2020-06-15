package com.SiteECommerce.ProjectPFA.service.interfaces;

import com.SiteECommerce.ProjectPFA.bean.LigneEntree;
import com.SiteECommerce.ProjectPFA.bean.LigneProduit;

import java.util.List;

public interface LigneProduitService {
    public LigneProduit findById(Long id);
    public List<LigneProduit> findAll();
    public LigneProduit save(LigneProduit ligneProduit);
    public LigneProduit update(Long id);
    public int delete(Long id);
}
