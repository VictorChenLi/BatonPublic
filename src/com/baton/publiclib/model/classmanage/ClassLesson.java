package com.baton.publiclib.model.classmanage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ClassLesson {

	public static final String LESSONID_DB_STR="lid";
	public static final String LESSONNAME_DB_STR="lesson_name";
	public static final String LESSONDESCRIPTION_DB_STR="lesson_description";
	public static final String LESSONSTARTTIME_DB_STR="start_time";
	public static final String LESSONENDTIME_DB_STR="end_time";
	public static final String LESSONSTATUS_DB_STR="status";
	
	public static final String LESSONID_WEB_STR="lid";
	public static final String LESSONNAME_WEB_STR="lesson_name";
	public static final String LESSONDESCRIPTION_WEB_STR="lesson_description";
	public static final String LESSONSTARTTIME_WEB_STR="start_time";
	public static final String LESSONENDTIME_WEB_STR="end_time";
	public static final String LESSONSTATUS_WEB_STR="status";
	
	public static final String LESSONSTATUS_OPEN="open";
	public static final String LESSONSTATUS_CLOSE="close";
	
	private int lid;
	private int cid;
	private String lesson_name;
	private String lesson_description;
	private String start_time;
	private String end_time;
	private String status;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getLesson_name() {
		return lesson_name;
	}
	public void setLesson_name(String lesson_name) {
		this.lesson_name = lesson_name;
	}
	public String getLesson_description() {
		return lesson_description;
	}
	public void setLesson_description(String lesson_description) {
		this.lesson_description = lesson_description;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public ClassLesson()
	{}
	
	public ClassLesson(int lid, int cid, String lesson_name,
			String lesson_description, String start_time, String end_time,
			String status) {
		super();
		this.lid = lid;
		this.cid = cid;
		this.lesson_name = lesson_name;
		this.lesson_description = lesson_description;
		this.start_time = start_time;
		this.end_time = end_time;
		this.status = status;
	}
	
	public ClassLesson(Map<String,Object> data)
	{
		super();
		this.lid=Integer.valueOf(data.get(ClassLesson.LESSONID_DB_STR).toString());
		this.cid=Integer.valueOf(data.get(VirtualClass.CID_DB_STR).toString());
		this.lesson_name=(null==data.get(ClassLesson.LESSONNAME_DB_STR))?null:data.get(ClassLesson.LESSONNAME_DB_STR).toString();
		this.lesson_description = (null==data.get(ClassLesson.LESSONDESCRIPTION_DB_STR))?null:data.get(ClassLesson.LESSONDESCRIPTION_DB_STR).toString();
		this.start_time = (null==data.get(ClassLesson.LESSONSTARTTIME_DB_STR))?null:data.get(ClassLesson.LESSONSTARTTIME_DB_STR).toString();
		this.end_time = (null==data.get(ClassLesson.LESSONENDTIME_DB_STR))?null:data.get(ClassLesson.LESSONENDTIME_DB_STR).toString();
		this.status = (null==data.get(ClassLesson.LESSONSTATUS_DB_STR))?null:data.get(ClassLesson.LESSONSTATUS_DB_STR).toString();
	}

	public List<String> getUserData()
	{
		List<String> userData = new ArrayList<String>();
		userData.add(String.valueOf(this.cid));
		userData.add(String.valueOf(this.lesson_name));
		userData.add(String.valueOf(this.lesson_description));
		userData.add(String.valueOf(this.start_time));
		userData.add(String.valueOf(this.end_time));
		userData.add(String.valueOf(this.status));
		return userData;
	}
}
