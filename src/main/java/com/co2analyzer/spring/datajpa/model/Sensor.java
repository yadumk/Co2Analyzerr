package com.co2analyzer.spring.datajpa.model;

import javax.persistence.*;

@Entity
@Table(name = "sensor")
public class Sensor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long sensorid;

	@Column(name = "sensor_name")
	private String sensor_name;

	@Column(name = "sensor_district_id")
	private String sensor_district_id;

	public Sensor() {

	}

	public Sensor(String sensor_name, String sensor_district_id) {
		this.sensor_name = sensor_name;
		this.sensor_district_id = sensor_district_id;
	}

	

	public long getSensorid() {
		return sensorid;
	}

	public void setSensorid(long sensorid) {
		this.sensorid = sensorid;
	}

	public String getSensor_name() {
		return sensor_name;
	}

	public void setSensor_name(String sensor_name) {
		this.sensor_name = sensor_name;
	}

	public String getSensor_district_id() {
		return sensor_district_id;
	}

	public void setSensor_district_id(String sensor_district_id) {
		this.sensor_district_id = sensor_district_id;
	}

	
	

}
