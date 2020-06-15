package com.SiteECommerce.ProjectPFA.service.implementation;

import com.SiteECommerce.ProjectPFA.bean.SortieStock;
import com.SiteECommerce.ProjectPFA.dao.SortieStockDao;
import com.SiteECommerce.ProjectPFA.service.interfaces.SortieStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SortieStockServiceImpl implements SortieStockService {
    @Autowired
    SortieStockDao sortieStockDao;

    @Override
    public SortieStock findById(Long id) {
        return sortieStockDao.getOne(id);
    }

    @Override
    public List<SortieStock> findAll() {
        return sortieStockDao.findAll();
    }

    @Override
    public SortieStock save(SortieStock sortieStock) {
        return sortieStockDao.save(sortieStock);
    }

    @Override
    public SortieStock update(Long id) {
        // this is not a mandatory service since the save can easly update if you pass down the id with it

        return null;
    }

    @Override
    public int delete(Long id) {
        sortieStockDao.delete(sortieStockDao.getOne(id));
        return 0;
    }
}
