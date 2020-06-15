package com.SiteECommerce.ProjectPFA.service.implementation;

import com.SiteECommerce.ProjectPFA.bean.Commande;
import com.SiteECommerce.ProjectPFA.dao.CommandeDao;
import com.SiteECommerce.ProjectPFA.service.interfaces.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeServiceImpl implements CommandeService {
  @Autowired
    CommandeDao commandeDao;
    @Override
    public Commande findById(Long id) {
        return commandeDao.getOne(id);
    }

    @Override
    public List<Commande> findAll() {
        return commandeDao.findAll();
    }

    @Override
    public Commande save(Commande commande) {
        return commandeDao.save(commande);
    }

    @Override
    public Commande update(Long id) {
        // this is not a mandatory service since the save can easly update if you pass down the id with it

        return null;
    }

    @Override
    public int delete(Long id) {
            commandeDao.delete(commandeDao.getOne(id));
        return 0;
    }
}
