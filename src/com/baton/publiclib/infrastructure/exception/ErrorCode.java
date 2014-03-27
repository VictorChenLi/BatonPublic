package com.baton.publiclib.infrastructure.exception;

public class ErrorCode {
	
	// 00**** System unknown error
	public static final String System_Unknow_Error = "000001";
	public static final String System_Unknow_Error_Msg = "The system unknown error";
	
	public static final String Network_connection_Error = "000002";
	public static final String Network_connection_Error_Msg = "The internet connection of server has error";
	
	// 01**** user manage module error
	public static final String Email_Occupied = "010001";
	public static final String Email_Occupied_Msg = "The email address already been registered";
	
	public static final String Password_Error = "010002";
	public static final String Password_Error_Msg = "The password is incorrect";
	
	public static final String GCMID_Not_Exist = "010003";
	public static final String GCMID_Not_Exist_Msg = "The GCMID is not exist on GCM";
	
	public static final String Email_Not_Exist = "010004";
	public static final String Email_Not_Exist_Msg = "The email address not exist";
	
	// 02**** class manage module error
	public static final String Teacher_Not_Exist = "020001";
	public static final String Teacher_Not_Exist_Msg = "The teacher is not exist";

	public static final String Class_Not_Exist = "020002";
	public static final String Class_Not_Exist_Msg = "The class is not exist";
	
	// 03**** ticket manage module error
	
	
	// 09**** database access module error
	public static final String DB_Common_Error = "090001";
	public static final String DB_Common_Error_Msg ="The database operation error";	
}
