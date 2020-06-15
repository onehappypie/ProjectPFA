package com.SiteECommerce.ProjectPFA.service.implementation;

import com.SiteECommerce.ProjectPFA.bean.Facture;
import com.SiteECommerce.ProjectPFA.dao.FactureDao;
import com.SiteECommerce.ProjectPFA.service.interfaces.FactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FactureServiceImpl implements FactureService {
   @Autowired
    FactureDao factureDao;
    @Override
    public Facture findById(Long id) {
        return factureDao.getOne(id);
    }

    @Override
    public List<Facture> findAll() {
        return factureDao.findAll();
    }

    @Override
    public Facture save(Facture facture) {
        return factureDao.save(facture);
    }

    @Override
    public Facture update(Long id) {

        // this is not a mandatory service since the save can easly update if you pass down the id with it
        return null;
    }

    @Override
    public int delete(Long id) {
        factureDao.delete(factureDao.getOne(id));
        return 0;
    }
}
