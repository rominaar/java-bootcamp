package com.globant.topic6.services;

import java.util.List;
import com.globant.topic6.Attendee;
import com.globant.topic6.Meeting;

public interface MeetingCRUD {
	
	 public List<Attendee> getAttendees();
	 
	 public Attendee getAttendee(int id);
	 
	 public Meeting getMeeting(int id);
	 
	 public void removeMeeting(int id);

}
