package com.SiteECommerce.ProjectPFA.service.implementation;

import com.SiteECommerce.ProjectPFA.bean.Utilisateur;
import com.SiteECommerce.ProjectPFA.dao.UtilisateurDao;
import com.SiteECommerce.ProjectPFA.service.interfaces.UtilisateurService;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {
    @Autowired
    UtilisateurDao utilisateurDao;
    @Override
    public Utilisateur findById(Long id) {
        return utilisateurDao.getOne(id);
    }

    @Override
    public List<Utilisateur> findAll() {
        return utilisateurDao.findAll();
    }

    @Override
    public Utilisateur save(Utilisateur utilisateur) {
        return utilisateurDao.save(utilisateur);
    }

    @Override
    public Utilisateur update(Long id) {
        // this is not a mandatory service since the save can easly update if you pass down the id with it

        return null;
    }

    @Override
    public int delete(Long id) {
        utilisateurDao.delete(utilisateurDao.getOne(id));
        return 0;
    }
}
