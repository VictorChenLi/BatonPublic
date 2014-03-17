package com.baton.publiclib.model.usermanage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserProfile {
	public static final String UID_WEB_STR = "uid";
	public static final String GCMID_WEB_STR = "gcm_regid";
	public static final String LOGINID_WEB_STR = "login_id";	
	public static final String TEACHER_LOGINID_WEB_STR = "teacher_login_id";
	public static final String EMAIL_WEB_STR = "email";
	public static final String PASSWORD_WEB_STR = "password";
	public static final String FNAME_WEB_STR = "f_name";
	public static final String LNAME_WEB_STR = "l_name";
	public static final String USERTYPE_WEB_STR = "user_type";
	public static final String CREATEAT_WEB_STR = "created_at";

	public static final String UID_DB_STR = "uid";
	public static final String GCMID_DB_STR = "gcm_regid";
	public static final String LOGINID_DB_STR = "login_id";
	public static final String EMAIL_DB_STR = "email";
	public static final String PASSWORD_DB_STR = "password";
	public static final String FNAME_DB_STR = "f_name";
	public static final String LNAME_DB_STR = "l_name";
	public static final String USERTYPE_DB_STR = "user_type";
	public static final String CREATEAT_DB_STR = "created_at";

	public static final String USERTYPE_TEACHER = "teacher";
	public static final String USERTYPE_STUDENT = "student";

	private int uid;
	private String gcm_regid;
	private String login_id;
	private String email;
	private String password;
	private String f_name;
	private String l_name;
	private String user_type;
	private String created_at;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getGcm_regid() {
		return gcm_regid;
	}

	public void setGcm_regid(String gcm_regid) {
		this.gcm_regid = gcm_regid;
	}

	public String getLogin_id() {
		return login_id;
	}

	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public UserProfile(String gcm_regid, String login_id, String email,
			String password, String f_name, String l_name, String user_type) {
		super();
		this.gcm_regid = gcm_regid;
		this.login_id = login_id;
		this.email = email;
		this.password = password;
		this.f_name = f_name;
		this.l_name = l_name;
		this.user_type = user_type;
	}

	public UserProfile(Map<String, Object> data) {
		super();
		this.uid = Integer.valueOf(data.get("uid").toString());
		this.gcm_regid = data.get("gcm_regid").toString();
		this.login_id = data.get("login_id").toString();
		this.email = data.get("email").toString();
		this.password = data.get("password").toString();
		this.f_name = data.get("f_name").toString();
		this.l_name = data.get("l_name").toString();
		this.user_type = data.get("user_type").toString();
		this.created_at = data.get("created_at").toString();
	}

	public List<String> getUserData() {
		List<String> userData = new ArrayList<String>();
		userData.add(this.gcm_regid);
		userData.add(this.login_id);
		userData.add(this.email);
		userData.add(this.password);
		userData.add(this.f_name);
		userData.add(this.l_name);
		userData.add(this.user_type);
		return userData;
	}

	public String toString() {
		return "firstName:"+this.getF_name() + "," + "lastName:"+this.getL_name() + ","
				+ "email:"+this.getEmail() + "," + "login_id:"+this.getLogin_id() + ","
				+ "password:"+this.getPassword() + "," + "gcmid:"+this.gcm_regid;
	}

}
