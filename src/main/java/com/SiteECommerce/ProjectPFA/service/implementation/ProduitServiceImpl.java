package com.SiteECommerce.ProjectPFA.service.implementation;

import com.SiteECommerce.ProjectPFA.bean.Fournisseur;
import com.SiteECommerce.ProjectPFA.bean.Produit;
import com.SiteECommerce.ProjectPFA.dao.ProduitDao;
import com.SiteECommerce.ProjectPFA.service.interfaces.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitServiceImpl implements ProduitService {
    @Autowired
    ProduitDao produitDao;

    @Override
    public Produit findById(Long id) {
        return produitDao.getOne(id);
    }

    @Override
    public List<Produit> findAll() {
        return null;
    }

    @Override
    public Produit save(Produit produit) {
        return produitDao.save(produit);
    }

    @Override
    public Produit update(Long id) {
        // this is not a mandatory service since the save can easly update if you pass down the id with it

        return null;
    }

    @Override
    public int delete(Long id) {
        produitDao.delete(produitDao.getOne(id));
        return 0;
    }
}
