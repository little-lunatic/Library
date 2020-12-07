package com.keshen.library.dao;

import com.keshen.library.pojo.Admin;

public interface AdminMapper {

    Admin select(Admin ad);

    void alterpwd(Admin ad);
}
