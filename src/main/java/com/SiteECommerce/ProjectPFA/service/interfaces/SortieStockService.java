package com.SiteECommerce.ProjectPFA.service.interfaces;

import com.SiteECommerce.ProjectPFA.bean.Fournisseur;
import com.SiteECommerce.ProjectPFA.bean.Produit;
import com.SiteECommerce.ProjectPFA.bean.SortieStock;

import java.util.List;

public interface SortieStockService {
    public SortieStock findById(Long id);
    public List<SortieStock> findAll();
    public SortieStock save(SortieStock sortieStock);
    public SortieStock update(Long id);
    public int delete(Long id);
}
