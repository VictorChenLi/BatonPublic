package com.baton.publiclib.model.ticketmanage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Ticket {
	public static final String TID_WEB_STR = "tid";
	public static final String UID_WEB_STR = "uid";
	public static final String TICKETTYPE_WEB_STR = "ticketType";
	public static final String TICKETCONTENT_WEB_STR = "ticketContent";
	public static final String TIMESTAMP_WEB_STR = "timeStamp";
	public static final String TICKETSTATUS_DB_STR = "ticket_status";
	
	public static final String TICKETSTATUS_RAISING = "raising";
	public static final String TICKETSTATUS_RESPOND = "respond";
	public static final String TICKETSTATUS_DISCARD = "discard";
	
	public static final String TALK_INTENT_BUILD_WEB_STR="talk_build";
	public static final String TALK_INTENT_CHALLENGE_WEB_STR="talk_challenge";
	public static final String TALK_INTENT_QUESTION_WEB_STR="talk_question";
	public static final String TALK_INTENT_NEWIDEA_WEB_STR="talk_new_idea";

	public static final String TICKET_TYPE_TALK="talk";
	public static final String TICKET_TYPE_WORK="work";
	
	private int tid;
	private int uid;
	private String ticketType;
	private String ticketContent;
	private String timeStamp;
	private int lid;
	private String ticket_status;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getTicketType() {
		return ticketType;
	}
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}
	public String getTicketContent() {
		return ticketContent;
	}
	public void setTicketContent(String ticketContent) {
		this.ticketContent = ticketContent;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getTicket_status() {
		return ticket_status;
	}
	public void setTicket_status(String ticket_status) {
		this.ticket_status = ticket_status;
	}
	
	public Ticket(int tid, int uid, String ticketType, String ticketContent,
			String timeStamp) {
		super();
		this.tid = tid;
		this.uid = uid;
		this.ticketType = ticketType;
		this.ticketContent = ticketContent;
		this.timeStamp = timeStamp;
	}
	
	public Ticket(int uid, String ticketType, String ticketContent,
			String timeStamp,int lid) {
		super();
		this.uid = uid;
		this.ticketType = ticketType;
		this.ticketContent = ticketContent;
		this.timeStamp = timeStamp;
		this.lid = lid;
	}
	
	public Ticket(Map<String, Object> data)
	{
		super();
		this.tid = Integer.valueOf(data.get("tid").toString());
		this.uid = Integer.valueOf(data.get("uid").toString());
		this.ticketType = data.get("ticketType").toString();
		this.ticketContent = data.get("ticketContent").toString();
		this.timeStamp = data.get("timeStamp").toString();
	}
	
	public List<String> getUserData()
	{
		List<String> userData = new ArrayList<String>();
		userData.add(String.valueOf(this.uid));
		userData.add(this.ticketType);
		userData.add(this.ticketContent);
		userData.add(this.timeStamp);
		userData.add(String.valueOf(this.lid));
		return userData;
	}
	
}
