package App;

import DAO.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


public class LoadProducts {
	
	@Autowired
	private ProductDAO productDAO;
	
	@Transactional
	public void generate() {
		
	if (productDAO.getProducts().isEmpty()) {
	
	productDAO.createProduct("TV LED", 5000, "Electronics");
	productDAO.createProduct("DVD Player", 3000, "Electronics");
	productDAO.createProduct("Bluray Player", 4000, "Electronics");
	productDAO.createProduct("TV LCD", 5000, "Electronics");
	productDAO.createProduct("Compiter", 5000, "Electronics");
	}
	}
	}