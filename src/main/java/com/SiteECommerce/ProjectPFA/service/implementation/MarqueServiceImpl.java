package com.SiteECommerce.ProjectPFA.service.implementation;

import com.SiteECommerce.ProjectPFA.bean.Fournisseur;
import com.SiteECommerce.ProjectPFA.bean.Marque;
import com.SiteECommerce.ProjectPFA.dao.MarqueDao;
import com.SiteECommerce.ProjectPFA.service.interfaces.MarqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarqueServiceImpl implements MarqueService {
    @Autowired
    MarqueDao marqueDao;
    @Override
    public Marque findById(Long id) {
        return marqueDao.getOne(id);
    }

    @Override
    public List<Marque> findAll() {
        return marqueDao.findAll();
    }

    @Override
    public Marque save(Marque marque) {
        return marqueDao.save(marque);
    }

    @Override
    public Marque update(Long id) {
        // this is not a mandatory service since the save can easly update if you pass down the id with it

        return null;
    }

    @Override
    public int delete(Long id) {
        marqueDao.delete(marqueDao.getOne(id));
        return 0;
    }
}
