package net.kzn.backendshopping.dao;

import java.util.List;

import net.kzn.backendshopping.dto.Category;

public interface CategoryDAO {
  
   List<Category> list();
   
   Category get(int id);
}
