package com.SiteECommerce.ProjectPFA.service.implementation;

import com.SiteECommerce.ProjectPFA.bean.LigneProduit;
import com.SiteECommerce.ProjectPFA.dao.LigneProduitDao;
import com.SiteECommerce.ProjectPFA.service.interfaces.LigneProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LigneProduitServiceImpl implements LigneProduitService {
    @Autowired
    LigneProduitDao ligneProduitDao;

    @Override
    public LigneProduit findById(Long id) {
        return ligneProduitDao.getOne(id);
    }

    @Override
    public List<LigneProduit> findAll() {
        return ligneProduitDao.findAll();
    }

    @Override
    public LigneProduit save(LigneProduit ligneProduit) {
        return ligneProduitDao.save(ligneProduit);
    }

    @Override
    public LigneProduit update(Long id) {
        // this is not a mandatory service since the save can easly update if you pass down the id with it

        return null;
    }

    @Override
    public int delete(Long id) {
        ligneProduitDao.delete(ligneProduitDao.getOne(id));
        return 0;
    }
}
