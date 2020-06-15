package com.SiteECommerce.ProjectPFA.dao;

import com.SiteECommerce.ProjectPFA.bean.ProduitPersonnalise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitPersonaliseDao extends JpaRepository<ProduitPersonnalise,Long> {

}
