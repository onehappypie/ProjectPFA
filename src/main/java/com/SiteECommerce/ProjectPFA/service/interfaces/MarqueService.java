package com.SiteECommerce.ProjectPFA.service.interfaces;

import com.SiteECommerce.ProjectPFA.bean.Fournisseur;
import com.SiteECommerce.ProjectPFA.bean.Marque;

import java.util.List;

public interface MarqueService {
    public Marque findById(Long id);
    public List<Marque> findAll();
    public Marque save(Marque marque);
    public Marque update(Long id);
    public int delete(Long id);
}
