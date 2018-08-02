package net.kzn.backendshopping.daoimpl;

import java.util.ArrayList;
import java.util.List;

import net.kzn.backendshopping.dao.CategoryDAO;
import net.kzn.backendshopping.dto.Category;

public class CategoryDAOImpl implements CategoryDAO {

	
	private static List<Category> categories=new ArrayList<>();
	
	static {
		
		
		Category category=new Category();
		//adding first category
		category.setId(1);
		category.setName("Telivison");
		category.setDescription("This is some description for television");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
		
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is some description for mobile");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);
		
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is some description for laptop");
		category.setImageURL("CAT_3.png");
		
		categories.add(category);
		
	}
	
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
