package com.SiteECommerce.ProjectPFA.dao;

import com.SiteECommerce.ProjectPFA.bean.Marque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarqueDao extends JpaRepository<Marque,Long> {
}
