package com.amr.project.dao.abstracts;


import com.amr.project.model.entity.Category;


public interface CategoryDao extends ReadWriteDAO<Category, Long> {
    Category getCategoryByName(String name);
}

