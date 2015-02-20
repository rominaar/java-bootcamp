package com.globant.finalproject.controllers;

//import javax.inject.Inject;
import javax.validation.Valid;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.globant.finalproject.models.*;

@Controller
public class ProductController {

  @Autowired
  private ProductRepository productrepository;



  //@RequestMapping(value = "/createprod", method = RequestMethod.POST) 
  @RequestMapping("/createprod")
  @ResponseBody
  public String createprod(String name, String price, String category) {
    try {
    	Product prod = new Product(name, price, category);
    	productrepository.save(prod);
      
    }
    catch (Exception ex) {
      return "Error creating the product: " + ex.toString();
    }
    return "Product succesfully created!";
  }
	  
	      
	   

  @RequestMapping(value = "/get-by-name", method = RequestMethod.GET)
  
  public @ResponseBody String getByEmail(String name) {
    String prodid;
    try {
      Product prod = productrepository.findByName(name);
      prodid = String.valueOf(prod.getId());
    }
    catch (Exception ex) {
      return "Product not found";
    }
    return "The product id is: " + prodid;
  }
	    
	    

	
}
