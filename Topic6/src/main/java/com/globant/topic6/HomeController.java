package com.globant.topic6;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.globant.topic6.services.MeetingCRUD;;
/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	
	
  private Meeting m = new Meeting();
  
  
	//get attendees
	@RequestMapping (value="/attendees", method = RequestMethod.GET)
	  public @ResponseBody  List<Attendee> getAttendees() { 
		List<Attendee> list;
		list = m.getAttendees();
		return list;
	   }
	  
	 /* @RequestMapping (value="/attendee", method = RequestMethod.GET)
		public @ResponseBody Attendee getAtendee(@RequestParam(value="id", required=true)int id){ 
	    return MeetingCRUD.getAttendee(id);		  
		}*/
	  
	  
	  // get meeting
	  @RequestMapping(value = "meetings/{id}", method = RequestMethod.GET)
	  public @ResponseBody Meeting getMeeting(@PathVariable int id) {
		  
		  return m.getMeeting(id);
		  
	  }
	  
	  // remove meeting
	  @RequestMapping(value = "meetings/{id}", method = RequestMethod.DELETE)
	  public @ResponseBody String removeMeeting(@PathVariable int id) {
	  m.removeMeeting(id);
	  return " The meeting has been remove.";
	  }
	  

}

