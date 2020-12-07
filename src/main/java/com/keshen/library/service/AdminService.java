package com.keshen.library.service;

import com.keshen.library.pojo.Admin;

public interface AdminService {
    Admin select(Admin ad);

    void alterpwd(Admin ad);
}
