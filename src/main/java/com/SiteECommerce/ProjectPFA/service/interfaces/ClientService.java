package com.SiteECommerce.ProjectPFA.service.interfaces;

import com.SiteECommerce.ProjectPFA.bean.Categorie;
import com.SiteECommerce.ProjectPFA.bean.Client;

import java.util.List;

public interface ClientService {
    public Client findById(Long id);
    public List<Client> findAll();
    public Client save(Client client);
    public Client update(Long id);
    public int delete(Long id);
}
