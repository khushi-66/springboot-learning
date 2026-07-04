package com.isrdc.exceptions;

import java.time.LocalDateTime;

public class ExceptionInfo {

	private String exceptionCode;
	private String description;
	private LocalDateTime excepdateTime;
	public String getExceptionCode() {
		return exceptionCode;
	}
	public void setExceptionCode(String exceptionCode) {
		this.exceptionCode = exceptionCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDateTime getExcepdateTime() {
		return excepdateTime;
	}
	public void setExcepdateTime(LocalDateTime excepdateTime) {
		this.excepdateTime = excepdateTime;
	}
	
	
}
