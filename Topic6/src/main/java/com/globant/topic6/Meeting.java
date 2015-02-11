package com.globant.topic6;

import java.util.List;

public class Meeting {
	
	private int idMeeting;
	private List<Attendee> attendees;
	private String room;
	private String TimeSlot;
	
	public Meeting() {}
	
	public Meeting(int id) {
		this.idMeeting = id;
	}

	public List<Attendee> getAttendees() {
		return attendees;
	}

	public void setAttendees(List<Attendee> attendees) {
		this.attendees = attendees;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getTimeSlot() {
		return TimeSlot;
	}

	public void setTimeSlot(String timeSlot) {
		TimeSlot = timeSlot;
	}

	public int getIdMeeting() {
		return idMeeting;
	}

	public void setIdMeeting(int idMeeting) {
		this.idMeeting = idMeeting;
	}

}
