package com.SiteECommerce.ProjectPFA.service.implementation;

import com.SiteECommerce.ProjectPFA.bean.Categorie;
import com.SiteECommerce.ProjectPFA.dao.CategorieDao;
import com.SiteECommerce.ProjectPFA.service.interfaces.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieServiceImpl implements CategorieService {
    @Autowired
    private CategorieDao categorieDao;

    @Override
    public Categorie findById(Long id) {
        return categorieDao.getOne(id);
    }

    @Override
    public List<Categorie> findAll() {
        return categorieDao.findAll();
    }

    @Override
    public Categorie save(Categorie categorie) {
        return categorieDao.save(categorie);
    }

    @Override
    public Categorie update(Long id) {
        // this is not a mandatory service since the save can easly update if you pass down the id with it

        return null;
    }

    @Override
    public int delete(Long id) {

        categorieDao.delete(categorieDao.getOne(id));
        return 1;
    }
}
