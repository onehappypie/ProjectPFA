package com.SiteECommerce.ProjectPFA.dao;

import com.SiteECommerce.ProjectPFA.bean.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurDao extends JpaRepository<Utilisateur,Long> {

}
