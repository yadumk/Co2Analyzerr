package com.co2analyzer.spring.datajpa.model;

import javax.persistence.*;

@Entity
@Table(name = "district")
public class District {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long districtid;

	@Column(name = "district_name")
	private String district_name;

	@Column(name = "district_city_id")
	private String district_city_id;

	public District() {

	}

	public District(String district_name, String district_city_id) {
		this.district_name = district_name;
		this.district_city_id = district_city_id;
	}
	
	public long getDistrictid() {
		return districtid;
	}

	public void setDistrictid(long districtid) {
		this.districtid = districtid;
	}

	public String getDistrict_name() {
		return district_name;
	}

	public void setDistrict_name(String district_name) {
		this.district_name = district_name;
	}

	public String getDistrict_city_id() {
		return district_city_id;
	}

	public void setDistrict_city_id(String district_city_id) {
		this.district_city_id = district_city_id;
	}

	
	

}
