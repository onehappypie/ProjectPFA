package com.SiteECommerce.ProjectPFA.service.interfaces;

import com.SiteECommerce.ProjectPFA.bean.Commande;
import com.SiteECommerce.ProjectPFA.bean.EntreeStock;

import java.util.List;

public interface EntreeStockService {
    public EntreeStock findById(Long id);
    public List<EntreeStock> findAll();
    public EntreeStock save(EntreeStock entreeStock);
    public EntreeStock update(Long id);
    public int delete(Long id);
}
