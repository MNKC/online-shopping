package net.kzn.backendshopping.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.backendshopping.dao.CategoryDAO;
import net.kzn.backendshopping.dto.Category;


//class specifying it is going to fulfills the role of providing access to the data & will be managed by spring frame work...
//if you get error check Maven dependencies for spring

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	
	private static List<Category> categories=new ArrayList<>();
	
	static {
		Category category=new Category();
		//adding first category
		category.setId(1);
		category.setName("Telivison");
		category.setDescription("This is some description for television");
		category.setImageURL("CAT_1.png");
		category.setActive(true);
		
		categories.add(category);
		
		category=new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is some description for mobile");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);
		
		category=new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is some description for laptop");
		category.setImageURL("CAT_3.png");
		
		categories.add(category);
		
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		// for each loop 
		
		for(Category category : categories) {
			
			if(category.getId()==id) return category;
			
		}
		
		
		return null;
	}

}
