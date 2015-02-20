package com.globant.finalproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.globant.finalproject.models.User;
import com.globant.finalproject.models.UserRepository;

@Controller
public class UserController {

  @Autowired
  private UserRepository userrepository;
  
  
  
  //@RequestMapping(value = "/create", method = RequestMethod.POST)  
  @RequestMapping("/create")
  @ResponseBody
  public String create(String email, String name) {
    try {
      User user = new User(email, name);
      userrepository.save(user);
    }
    catch (Exception ex) {
      return "Error creating the user: " + ex.toString();
    }
    return "User succesfully created!";
  }
  
   
  
  @RequestMapping(value = "/get-by-email", method = RequestMethod.GET)
  
  public @ResponseBody String getByEmail(String email) {
    String userId;
    try {
      User user = userrepository.findByEmail(email);
      userId = String.valueOf(user.getId());
    }
    catch (Exception ex) {
      return "User not found";
    }
    return "The user id is: " + userId;
  }
  
  
  

} 
