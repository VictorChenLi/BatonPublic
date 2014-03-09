package com.baton.publiclib.model.classmanage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class VirtualClass {
	private int cid;
	private String classroom_name;
	private int teacher_id;

	public static final String CID_DB_STR="cid";
	public static final String CLASSROOM_NAME_DB = "classroom_name";
	public static final String TEACHER_ID_DB="teacher_id";
	public static final String CLASSROOM_NAME_WEB_STR="classroom_name";

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getClassroom_name() {
		return classroom_name;
	}

	public void setClassroom_name(String classroom_name) {
		this.classroom_name = classroom_name;
	}

	public int getTeacher_id() {
		return teacher_id;
	}

	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}

	public VirtualClass(String classroom_name, int teacher_id) {
		super();
		this.classroom_name = classroom_name;
		this.teacher_id = teacher_id;
	}
	
	public VirtualClass(Map<String,Object> data)
	{
		super();
		this.cid=Integer.valueOf(data.get(this.CID_DB_STR).toString());
		this.classroom_name=data.get(this.CLASSROOM_NAME_DB).toString();
		this.teacher_id=Integer.valueOf(data.get(this.TEACHER_ID_DB).toString());
	}
	
	public List<String> getUserData()
	{
		List<String> userData = new ArrayList<String>();
		userData.add(this.classroom_name);
		userData.add(String.valueOf(this.teacher_id));
		return userData;
	}
}
