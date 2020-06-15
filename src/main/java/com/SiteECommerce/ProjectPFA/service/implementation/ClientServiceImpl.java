package com.SiteECommerce.ProjectPFA.service.implementation;

import com.SiteECommerce.ProjectPFA.bean.Categorie;
import com.SiteECommerce.ProjectPFA.bean.Client;
import com.SiteECommerce.ProjectPFA.dao.ClientDao;
import com.SiteECommerce.ProjectPFA.service.interfaces.CategorieService;
import com.SiteECommerce.ProjectPFA.service.interfaces.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientDao clientDao;

    @Override
    public Client findById(Long id) {
        return clientDao.getOne(id);
    }

    @Override
    public List<Client> findAll() {
        return clientDao.findAll();
    }

    @Override
    public Client save(Client client) {
        return clientDao.save(client);
    }

    @Override
    public Client update(Long id) {
        // this is not a mandatory service since the save can easly update if you pass down the id with it

        return null;
    }

    @Override
    public int delete(Long id) {
            clientDao.delete(clientDao.getOne(id));
        return 0;
    }
}
