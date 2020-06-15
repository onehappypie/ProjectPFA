package com.SiteECommerce.ProjectPFA.rest;

import com.SiteECommerce.ProjectPFA.service.interfaces.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pfaProjet/Admin")
public class AdminRest {
    @Autowired
    AdminService adminService;
}
