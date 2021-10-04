package com.co2analyzer.spring.datajpa.model;

import javax.persistence.*;

@Entity
@Table(name = "co2count")
public class Co2count {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long co2id;

	@Column(name = "co2countvalue")
	private String co2countvalue;

	@Column(name = "co2datetime")
	private String co2datetime;

	@Column(name = "co2sensorid")
	private String co2sensorid;

	public Co2count() {

	}

	public Co2count(String co2countvalue, String co2datetime, String co2sensorid) {
		this.co2countvalue = co2countvalue;
		this.co2datetime = co2datetime;
		this.co2sensorid = co2sensorid;
	}

	

	public long getCo2id() {
		return co2id;
	}

	public void setCo2id(long co2id) {
		this.co2id = co2id;
	}

	public String getCo2countvalue() {
		return co2countvalue;
	}

	public void setCo2countvalue(String co2countvalue) {
		this.co2countvalue = co2countvalue;
	}

	public String getCo2datetime() {
		return co2datetime;
	}

	public void setCo2datetime(String co2datetime) {
		this.co2datetime = co2datetime;
	}

	public String getCo2sensorid() {
		return co2sensorid;
	}

	public void setCo2sensorid(String co2sensorid) {
		this.co2sensorid = co2sensorid;
	}

	/*
	 * public long getId() { return id; }
	 * 
	 * public String getTitle() { return title; }
	 * 
	 * public void setTitle(String title) { this.title = title; }
	 * 
	 * public String getDescription() { return description; }
	 * 
	 * public void setDescription(String description) { this.description =
	 * description; }
	 * 
	 * public String getPublished() { return published; }
	 * 
	 * public void setPublished(String isPublished) { this.published = isPublished;
	 * }
	 */

	
	  @Override public String toString() {
		  
		  return "Co2Count [id=" + co2id + ", co2countvalue="+ co2countvalue + ", co2datetime=" + co2datetime + ", co2sensorid=" + co2sensorid + "]"; 
		  
	  }
	 
	
	

}
