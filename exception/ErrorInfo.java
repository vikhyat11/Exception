package com.cg.exception;

public class ErrorInfo
{

	private String timeStamp;
	private String details;
	private String message;
	public ErrorInfo(String timeStamp, String details, String message) {
		super();
		this.timeStamp = timeStamp;
		this.details = details;
		this.message = message;
	}
	public ErrorInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "ErrorInfo [timeStamp=" + timeStamp + ", details=" + details + ", message=" + message + "]";
	}
	
	
}
