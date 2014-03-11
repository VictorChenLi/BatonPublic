package com.baton.publiclib.model.ticketmanage;

public class TalkTicketForDisplay {
	final String ticketType = Ticket.TICKET_TYPE_TALK;
	String startTimeStamp;
	String student_name;
	String participate_intent;
	String participate_times;
	/**
	 * @param startTimeStamp
	 * @param student_name
	 * @param participate_intent
	 * @param participate_times
	 */
	public TalkTicketForDisplay(String startTimeStamp, String student_name,
			String participate_intent, String participate_times) {
		this.startTimeStamp = startTimeStamp;
		this.student_name = student_name;
		this.participate_intent = participate_intent;
		this.participate_times = participate_times;
	}
	
	public TalkTicketForDisplay(){}

	public String getStartTimeStamp() {
		return startTimeStamp;
	}

	public void setStartTimeStamp(String startTimeStamp) {
		this.startTimeStamp = startTimeStamp;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getParticipate_intent() {
		return participate_intent;
	}

	public void setParticipate_intent(String participate_intent) {
		this.participate_intent = participate_intent;
	}

	public String getParticipate_times() {
		return participate_times;
	}

	public void setParticipate_times(String participate_times) {
		this.participate_times = participate_times;
	}
	
	
	
}
