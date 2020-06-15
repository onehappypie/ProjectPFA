package com.SiteECommerce.ProjectPFA.service.interfaces;

import com.SiteECommerce.ProjectPFA.bean.LigneProduit;
import com.SiteECommerce.ProjectPFA.bean.LigneSortie;

import java.util.List;

public interface LigneSortieService {
    public LigneSortie findById(Long id);
    public List<LigneSortie> findAll();
    public LigneSortie save(LigneSortie ligneSortie);
    public LigneSortie update(Long id);
    public int delete(Long id);
}
