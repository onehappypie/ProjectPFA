package com.SiteECommerce.ProjectPFA.service.interfaces;

import com.SiteECommerce.ProjectPFA.bean.Admin;

import java.util.List;

public interface AdminService {
    public Admin findById(Long id);
    public List<Admin> findAll();
    public Admin save(Admin admin);
    public Admin update(Long id, Admin admin);
    public int delete(Long id);

}
