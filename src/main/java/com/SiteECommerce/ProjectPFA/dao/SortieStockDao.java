package com.SiteECommerce.ProjectPFA.dao;

import com.SiteECommerce.ProjectPFA.bean.SortieStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SortieStockDao extends JpaRepository<SortieStock,Long> {
}
