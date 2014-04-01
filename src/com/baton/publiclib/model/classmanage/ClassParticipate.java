package com.baton.publiclib.model.classmanage;

import java.util.ArrayList;
import java.util.List;

import com.baton.publiclib.model.ticketmanage.Ticket;
import com.baton.publiclib.model.usermanage.UserProfile;

/**
 * dynamic paticipate info
 */
public class ClassParticipate {
	
	private int lid;
	private UserProfile student;
	private List<Ticket> curTicketList = new ArrayList<Ticket>(1); //null or 0 size means only login this lesson, but no ticket yet, 
	                           //or ticket has been discarded by teacher by reset all operation
	
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

	
	public List<Ticket> getCurTicketList() {
		return curTicketList;
	}
	public void setCurTicketList(List<Ticket> curTicketList) {
		this.curTicketList = curTicketList;
	}
	public ClassParticipate(int lid, UserProfile student, List<Ticket> curTicketList) {
		super();
		this.lid = lid;
		this.student = student;
		this.curTicketList = curTicketList;
	}
	
	
	public ClassParticipate() {
	}
	public String toString(){
		return "###ClassParticipate## lid: "+lid+" "+student==null?"null":student.toString()+" "+curTicketList==null?"null":curTicketList.toString();
	}
}
