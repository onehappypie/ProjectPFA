package com.SiteECommerce.ProjectPFA.service.interfaces;

import com.SiteECommerce.ProjectPFA.bean.Fournisseur;
import com.SiteECommerce.ProjectPFA.bean.Produit;
import com.SiteECommerce.ProjectPFA.bean.Utilisateur;

import java.util.List;

public interface UtilisateurService {
    public Utilisateur findById(Long id);
    public List<Utilisateur> findAll();
    public Utilisateur save(Utilisateur utilisateur);
    public Utilisateur update(Long id);
    public int delete(Long id);
}
