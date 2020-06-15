package com.SiteECommerce.ProjectPFA.service.implementation;

import com.SiteECommerce.ProjectPFA.bean.Fournisseur;
import com.SiteECommerce.ProjectPFA.dao.FournisseurDao;
import com.SiteECommerce.ProjectPFA.service.interfaces.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FournisseurServiceImp  implements FournisseurService {
    @Autowired
    FournisseurDao fournisseurDao;

    @Override
    public Fournisseur findById(Long id) {
        return fournisseurDao.getOne(id);
    }

    @Override
    public List<Fournisseur> findAll() {
        return fournisseurDao.findAll();
    }

    @Override
    public Fournisseur save(Fournisseur fournisseur) {
        return fournisseurDao.save(fournisseur);
    }

    @Override
    public Fournisseur update(Long id) {
        // this is not a mandatory service since the save can easly update if you pass down the id with it

        return null;
    }

    @Override
    public int delete(Long id) {
        fournisseurDao.delete(fournisseurDao.getOne(id));
        return 0;
    }
}
