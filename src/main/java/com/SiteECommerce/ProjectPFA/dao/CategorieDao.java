package com.SiteECommerce.ProjectPFA.dao;

import com.SiteECommerce.ProjectPFA.bean.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieDao extends JpaRepository<Categorie,Long> {

}
