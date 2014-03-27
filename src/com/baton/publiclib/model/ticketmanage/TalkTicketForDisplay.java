package com.baton.publiclib.model.ticketmanage;

public class TalkTicketForDisplay implements Comparable<TalkTicketForDisplay>{
	//TODO: 需要加上status属性。。。
	public static final String INTENT_EXTRA_ITEM_STUDENT_NAME = "student_name";
	public static final String INTENT_EXTRA_ITEM_WAIT_TIME = "startTimeStamp";
	public static final String INTENT_EXTRA_ITEM_PAR_TIMES = "participate_times";
	public static final String INTENT_EXTRA_ITEM_PAR_INTENT = "participate_intent";
	
	final String ticketType = Ticket.TICKET_TYPE_TALK;
	String startTimeStamp;
	String student_name;//login_id
	int uid;
	int lid;
	String participate_intent;
	int participate_times;
	int response_times;
	String ticket_status;
	
	public String getTicket_status() {
		return ticket_status;
	}

	public void setTicket_status(String ticket_status) {
		this.ticket_status = ticket_status;
	}

	public TalkTicketForDisplay(){}

	/**
	 * @param student_name
	 * @param uid
	 * @param lid
	 */
	public TalkTicketForDisplay(String student_name, int uid, int lid) {
		super();
		this.student_name = student_name;
		this.uid = uid;
		this.lid = lid;
	}
	

	public TalkTicketForDisplay(String startTimeStamp, String student_name,
			int uid, int lid, String participate_intent,String ticket_status,
			int participate_times, int response_times) {
		super();
		this.startTimeStamp = startTimeStamp;
		this.student_name = student_name;
		this.uid = uid;
		this.lid = lid;
		this.participate_intent = participate_intent;
		this.ticket_status = ticket_status;
		this.participate_times = participate_times;
		this.response_times = response_times;
	}

	@Override
	public int compareTo(TalkTicketForDisplay o) {
		return startTimeStamp.compareTo(o.startTimeStamp);
	}

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

	public int getParticipate_times() {
		return participate_times;
	}

	public void setParticipate_times(int participate_times) {
		this.participate_times = participate_times;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public int getResponse_times() {
		return response_times;
	}

	public void setResponse_times(int response_times) {
		this.response_times = response_times;
	}

	public String getTicketType() {
		return ticketType;
	}
	
	
	
}
