package com.keshen.library.service.impl;

import com.keshen.library.dao.AdminMapper;
import com.keshen.library.pojo.Admin;
import com.keshen.library.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin select(Admin ad) {
        return adminMapper.select(ad);
    }

    @Override
    public void alterpwd(Admin ad) {
        adminMapper.alterpwd(ad);
    }
}
