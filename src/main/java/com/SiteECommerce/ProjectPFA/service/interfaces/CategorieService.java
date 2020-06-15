package com.SiteECommerce.ProjectPFA.service.interfaces;

import com.SiteECommerce.ProjectPFA.bean.Admin;
import com.SiteECommerce.ProjectPFA.bean.Categorie;

import java.util.List;

public interface CategorieService {
    public Categorie findById(Long id);
    public List<Categorie> findAll();
    public Categorie save(Categorie categorie);
    public Categorie update(Long id);
    public int delete(Long id);
}
