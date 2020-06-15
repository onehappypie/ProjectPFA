package com.SiteECommerce.ProjectPFA.service.implementation;

import com.SiteECommerce.ProjectPFA.bean.LigneSortie;
import com.SiteECommerce.ProjectPFA.dao.LigneSortieDao;
import com.SiteECommerce.ProjectPFA.service.interfaces.LigneSortieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LigneSortieServiceImpl implements LigneSortieService {
    @Autowired
    LigneSortieDao ligneSortieDao;
    @Override
    public LigneSortie findById(Long id) {
        return ligneSortieDao.getOne(id);
    }

    @Override
    public List<LigneSortie> findAll() {
        return ligneSortieDao.findAll();
    }

    @Override
    public LigneSortie save(LigneSortie ligneSortie) {
        return ligneSortieDao.save(ligneSortie);
    }

    @Override
    public LigneSortie update(Long id) {
        // this is not a mandatory service since the save can easly update if you pass down the id with it

        return null;
    }

    @Override
    public int delete(Long id) {
        ligneSortieDao.delete(ligneSortieDao.getOne(id));
        return 0;
    }
}
