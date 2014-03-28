package com.baton.publiclib.model.usermanage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LoginSession {
	public final static String SESSIONID_WEB_STR = "session_id";
	public final static String LID_WEB_STR = "lid";
	public final static String UID_WEB_STR = "uid";
	public final static String USERTYPE_WEB_STR = "user_type";
	public final static String USERLOGINID_WEB_STR = "user_login_id";
	public final static String LOGINTIME_WEB_STR = "login_time";
	public final static String SESSIONSTATUS_WEB_STR = "session_status";
	public final static String GCMREGID_WEB_STR = "gcm_regid";
	
	public final static String SESSIONID_DB_STR = "session_id";
	public final static String LID_DB_STR = "lid";
	public final static String UID_DB_STR = "uid";
	public final static String USERTYPE_DB_STR = "user_type";
	public final static String USERLOGINID_DB_STR = "user_login_id";
	public final static String LOGINTIME_DB_STR = "login_time";
	public final static String SESSIONSTATUS_DB_STR = "session_status";
	public final static String GCMREGID_DB_STR = "gcm_regid";
	
	public final static String LOGIN_STATUS_ACTIVE = "active";
	public final static String LOGIN_STATUS_INACTIVE = "inactive";
	
	int session_id;
	int lid;
	int uid;
	String user_type;
	String user_login_id;
	String login_time;
	String session_status;
	String gcm_regid;
	
	
	public LoginSession(int lid, int uid, String user_type,
			String user_login_id, String login_time, String session_status,
			String gcm_regid) {
		super();
		this.lid = lid;
		this.uid = uid;
		this.user_type = user_type;
		this.user_login_id = user_login_id;
		this.login_time = login_time;
		this.session_status = session_status;
		this.gcm_regid = gcm_regid;
	}
	
	public LoginSession(Map<String, Object> data) {
		super();
		this.session_id = Integer.valueOf(data.get("session_id").toString());
		this.lid =  Integer.valueOf(data.get("lid").toString());
		this.uid = Integer.valueOf(data.get("uid").toString());
		this.user_type = data.get("user_type").toString();
		this.user_login_id = data.get("user_login_id").toString();
		this.login_time = data.get("login_time").toString();
		this.session_status = data.get("session_status").toString();
		this.gcm_regid = data.get("gcm_regid").toString();
	}
	
	public List<String> getLoginSessionInsertParams() {
		List<String> lsData = new ArrayList<String>();
		lsData.add(String.valueOf(this.lid));
		lsData.add(String.valueOf(this.uid));
		lsData.add(this.user_type);
		lsData.add(this.user_login_id);
		lsData.add(this.session_status);
		lsData.add(this.gcm_regid);
		return lsData;
	}
	
	/**used for update login session with uid and lid*/
	public List<String> getLoginSessionUpdateWhereParams() {
		List<String> lsData = new ArrayList<String>();
		lsData.add("");//space_holder for status
		lsData.add(String.valueOf(this.uid));
		lsData.add(String.valueOf(this.lid));
		return lsData;
	}

	public String toString() {
		return "session_id:"+this.session_id + "," + "lid:"+this.lid+ ","
				+ "uid:"+this.uid + "," + "user_type:"+this.user_type + ","
				+ "user_login_id:"+this.user_login_id + "," + "login_time:"+this.login_time
				+ "session_status:"+this.session_status+ "gcm_regid:"+this.gcm_regid;
	}
	
	public int getSession_id() {
		return session_id;
	}

	public void setSession_id(int session_id) {
		this.session_id = session_id;
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	public String getUser_login_id() {
		return user_login_id;
	}

	public void setUser_login_id(String user_login_id) {
		this.user_login_id = user_login_id;
	}

	public String getLogin_time() {
		return login_time;
	}

	public void setLogin_time(String login_time) {
		this.login_time = login_time;
	}

	public String getSession_status() {
		return session_status;
	}

	public void setSession_status(String session_status) {
		this.session_status = session_status;
	}

	public String getGcm_regid() {
		return gcm_regid;
	}

	public void setGcm_regid(String gcm_regid) {
		this.gcm_regid = gcm_regid;
	}
	
	
}
