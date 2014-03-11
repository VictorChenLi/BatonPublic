package com.baton.publiclib.model.classmanage;

import com.baton.publiclib.model.ticketmanage.Ticket;
import com.baton.publiclib.model.usermanage.UserProfile;

public class ClassParticipate {
	
	private int lid;
	private UserProfile student;
	private int participate_times;
	private int response_times;
	private Ticket curTicket;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public UserProfile getStudent() {
		return student;
	}
	public void setStudent(UserProfile student) {
		this.student = student;
	}
	public int getParticipate_times() {
		return participate_times;
	}
	public void setParticipate_times(int participate_times) {
		this.participate_times = participate_times;
	}
	public int getResponse_times() {
		return response_times;
	}
	public void setResponse_times(int response_times) {
		this.response_times = response_times;
	}
	public Ticket getCurTicket() {
		return curTicket;
	}
	public void setCurTicket(Ticket curTicket) {
		this.curTicket = curTicket;
	}
	public ClassParticipate(int lid, UserProfile student,
			int participate_times, int response_times, Ticket curTicket) {
		super();
		this.lid = lid;
		this.student = student;
		this.participate_times = participate_times;
		this.response_times = response_times;
		this.curTicket = curTicket;
	}
	
	
}
