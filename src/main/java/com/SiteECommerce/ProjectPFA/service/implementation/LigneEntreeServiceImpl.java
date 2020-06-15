package com.SiteECommerce.ProjectPFA.service.implementation;

import com.SiteECommerce.ProjectPFA.bean.LigneEntree;
import com.SiteECommerce.ProjectPFA.dao.LigneEntreeDao;
import com.SiteECommerce.ProjectPFA.service.interfaces.LigneEntreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LigneEntreeServiceImpl implements LigneEntreeService {
    @Autowired
    LigneEntreeDao ligneEntreeDao;

    @Override
    public LigneEntree findById(Long id) {
        return ligneEntreeDao.getOne(id);
    }

    @Override
    public List<LigneEntree> findAll() {
        return ligneEntreeDao.findAll();
    }

    @Override
    public LigneEntree save(LigneEntree ligneEntree) {
        return ligneEntreeDao.save(ligneEntree);
    }

    @Override
    public LigneEntree update(Long id) {
        // this is not a mandatory service since the save can easly update if you pass down the id with it

        return null;
    }

    @Override
    public int delete(Long id) {
        ligneEntreeDao.delete(ligneEntreeDao.getOne(id));
        return 0;
    }
}
