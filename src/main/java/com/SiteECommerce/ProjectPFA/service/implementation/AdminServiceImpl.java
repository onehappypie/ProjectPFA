package com.SiteECommerce.ProjectPFA.service.implementation;

import com.SiteECommerce.ProjectPFA.bean.Admin;
import com.SiteECommerce.ProjectPFA.dao.AdminDao;
import com.SiteECommerce.ProjectPFA.service.interfaces.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminDao adminDao;
    @Override
    public Admin findById(Long id) {
        return adminDao.getOne(id);
    }

    @Override
    public List<Admin> findAll() {
        return adminDao.findAll();
    }

    @Override
    public Admin save(Admin admin) {
        return adminDao.save(admin);
    }

    @Override
    public Admin update(Long id, Admin admin) {
// this is not a mandatory service since the save can easly update if you pass down the id with it
        return null;
    }

    @Override
    public int delete(Long id) {
        adminDao.delete(adminDao.getOne(id));
        return 1;
    }
}
