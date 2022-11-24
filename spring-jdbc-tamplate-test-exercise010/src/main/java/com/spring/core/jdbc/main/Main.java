package com.spring.core.jdbc.main;

import java.util.List;
import java.util.Random;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.jdbc.dao.CategoryDAO;
import com.spring.core.jdbc.dao.ProductDAO;
import com.spring.core.jdbc.model.Category;
import com.spring.core.jdbc.model.Product;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = null;
		try {
			 context =new ClassPathXmlApplicationContext("spring.xml");
			
			CategoryDAO CategoryDAO = context.getBean(CategoryDAO.class);
			
			Category c1 = new Category();
			int id = new Random().nextInt(100);
			
			c1.setId(id);
			c1.setName("Basic Phones");
			c1.setDescription("This basic phone category");
			
			//Add category
			CategoryDAO.save(c1);
			
			System.out.println("Category is saved successfully");
			
			//Find by id
			System.out.println("------------------------------");
			System.out.println("Find by id");
			Category category = CategoryDAO.getById(id);
			System.out.println(category);

			//Find category by name
			System.out.println("---------------------------------");
			System.out.println("Find by name");
			//Category cat= CategoryDAO.getByName("Basic Phones");
			//System.out.println(cat);
			
			//Update category
			Category c2 = new Category();
			c2.setId(12);
			c2.setName("BasicPhones");
			c2.setDescription("This basic phone category updated");
			
			CategoryDAO.save(c2);
			
			//Find all category
			List<Category> categoryList = CategoryDAO.getAll();
			System.out.println("---------------------------------");
			System.out.println("All category");
			categoryList = CategoryDAO.getAll();
			System.out.println(categoryList);
			
			//Delete category
			System.out.println("---------------------------------");
			System.out.println("Delete with id "+id);
			CategoryDAO.deleteById(id);
			
			
			
			//Save the records in table Product
			 productDAO.save(p1);
				
			 System.out.println("Product is saved successfully");
				
			 System.out.println();
			 System.out.println("**************************************************");
			 System.out.println();
			
			 //Display the records by id
			 Product pro = productDAO.getById(randp);
			 System.out.println("Product by id :" + pro);
				
			 System.out.println();
			 System.out.println("**************************************************");
			 System.out.println();
			
			 //Update the records of table by provided id
			 p1.setName("Ponds Body wash");
			 p1.setDiscontinued(false);
			 p1.setPrice(200);
			 p1.setUnitsInStock(5);
			 productDAO.update(p1);
			
			 //Display all the records of table products
			 List<Product> pList = productDAO.getAll();
			 System.out.println(pList);
				
			 System.out.println();
			 System.out.println("**************************************************");
			 System.out.println();
			
			 //Delete the records of table Product by id
			 productDAO.deleteById(rand);
				
			 pList = productDAO.getAll();
			 System.out.println(pList);
				
			 System.out.println();
			 System.out.println("**************************************************");
			 System.out.println();
			
			 //Display the records of table by name
			 Product pro2 = productDAO.getByName("Ponds body wash");
			 System.out.println("Product by name :" + pro2);
				
			 System.out.println();
			 System.out.println("**************************************************");
			 System.out.println();
				
			 //Display the records of table by substring
			 List<Product> pList2 = productDAO.getByNames("P");
			 System.out.println(pList2);
				
			 System.out.println();
			 System.out.println("**************************************************");
			 System.out.println();
			
			 //Display all the records having price in between
			 List<Product> pro3 = productDAO.getByBetweenPrice(20, 500);
			 System.out.println(pro3);
			
			 System.out.println();
			 System.out.println("**************************************************");
			 System.out.println();
			
			 //Display records of discontinued products
			 List<Product> pro4 = productDAO.getDiscontinuedProducts();
			 System.out.println(pro4);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(context != null)
				context.close();
		}

	}

}
