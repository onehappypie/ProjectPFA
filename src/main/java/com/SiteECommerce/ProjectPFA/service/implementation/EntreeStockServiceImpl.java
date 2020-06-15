package com.SiteECommerce.ProjectPFA.service.implementation;

import com.SiteECommerce.ProjectPFA.bean.EntreeStock;
import com.SiteECommerce.ProjectPFA.dao.EntreeStockDao;
import com.SiteECommerce.ProjectPFA.service.interfaces.EntreeStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntreeStockServiceImpl implements EntreeStockService {
    @Autowired
    EntreeStockDao entreeStockDao;

    @Override
    public EntreeStock findById(Long id) {
        return entreeStockDao.getOne(id);
    }

    @Override
    public List<EntreeStock> findAll() {
        return entreeStockDao.findAll();
    }

    @Override
    public EntreeStock save(EntreeStock entreeStock) {
        return entreeStockDao.save(entreeStock);
    }

    @Override
    public EntreeStock update(Long id) {
        // this is not a mandatory service since the save can easly update if you pass down the id with it

        return null;
    }

    @Override
    public int delete(Long id) {
        entreeStockDao.delete(entreeStockDao.getOne(id));
        return 0;
    }
}
