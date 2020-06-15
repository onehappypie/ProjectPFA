package com.SiteECommerce.ProjectPFA.service.implementation;

import com.SiteECommerce.ProjectPFA.bean.ProduitPersonnalise;
import com.SiteECommerce.ProjectPFA.dao.ProduitPersonaliseDao;
import com.SiteECommerce.ProjectPFA.service.interfaces.ProduitPersonaliseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitPersonaliseServiceImpl implements ProduitPersonaliseService {
    @Autowired
    ProduitPersonaliseDao produitPersonaliseDao;
    @Override
    public ProduitPersonnalise findById(Long id) {
        return produitPersonaliseDao.getOne(id);
    }

    @Override
    public List<ProduitPersonnalise> findAll() {
        return produitPersonaliseDao.findAll();
    }

    @Override
    public ProduitPersonnalise save(ProduitPersonnalise produitPersonnalise) {
        return produitPersonaliseDao.save(produitPersonnalise);
    }

    @Override
    public ProduitPersonnalise update(Long id) {
        // this is not a mandatory service since the save can easly update if you pass down the id with it

        return null;
    }

    @Override
    public int delete(Long id) {
        produitPersonaliseDao.delete(produitPersonaliseDao.getOne(id));
        return 0;
    }
}
