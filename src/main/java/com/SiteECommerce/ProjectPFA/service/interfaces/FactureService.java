package com.SiteECommerce.ProjectPFA.service.interfaces;

import com.SiteECommerce.ProjectPFA.bean.Commande;
import com.SiteECommerce.ProjectPFA.bean.Facture;

import java.util.List;

public interface FactureService {
    public Facture findById(Long id);
    public List<Facture> findAll();
    public Facture save(Facture facture);
    public Facture update(Long id);
    public int delete(Long id);
}
