package com.co2analyzer.spring.dto;

public class Co2viewRequestDto {
	private long district_id;
	private String start_date;
	private String end_date;
	
	
	public long getDistrict_id() {
		return district_id;
	}
	public void setDistrict_id(long district_id) {
		this.district_id = district_id;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	
	
	
	
	
}
