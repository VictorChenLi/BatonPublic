package com.baton.publiclib.model.ticketmanage;

public class WorkTicketForDisplay {
	final String ticketType = Ticket.TICKET_TYPE_WORK;
	String startTimeStamp;
	String student_name;
	String work_complexity;
	String participate_times;
	/**
	 * @param startTimeStamp
	 * @param student_name
	 * @param participate_intent
	 * @param participate_times
	 */
	public WorkTicketForDisplay(String startTimeStamp, String student_name,
			String work_complexity, String participate_times) {
		this.startTimeStamp = startTimeStamp;
		this.student_name = student_name;
		this.work_complexity = work_complexity;
		this.participate_times = participate_times;
	}
	
	public WorkTicketForDisplay(){}

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

	public String getWork_complexity() {
		return work_complexity;
	}

	public void setWork_complexity(String work_complexity) {
		this.work_complexity = work_complexity;
	}

	public String getParticipate_times() {
		return participate_times;
	}

	public void setParticipate_times(String participate_times) {
		this.participate_times = participate_times;
	}
	
	
	
}
