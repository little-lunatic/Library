package com.keshen.library.service;

import com.keshen.library.pojo.Category;

import java.util.ArrayList;

public interface TypeService {
    ArrayList<Category> listCategory();

    void updateBookType(Category category);

    void delBookType(Integer cid);

    void addBookType(String cname);
}
