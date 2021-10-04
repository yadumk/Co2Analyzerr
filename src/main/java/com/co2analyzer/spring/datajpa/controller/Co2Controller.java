package com.co2analyzer.spring.datajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co2analyzer.spring.datajpa.model.Co2count;
import com.co2analyzer.spring.service.Co2Service;
import com.co2analyzer.spring.dto.Co2viewRequestDto;

@RestController
@RequestMapping("/api")
public class Co2Controller {

	
	
	@Autowired
	Co2Service Co2Service;
	
	@PostMapping("/co2countPost")
	public ResponseEntity<Co2count> createCo2count(@RequestBody Co2count coValue) {
		return Co2Service.createCo2count(coValue);
	}
	
	

	@GetMapping("/co2countView")
	public ResponseEntity<List<Co2count>> getAllCo2count(@RequestBody Co2viewRequestDto co2RequestValue) {
		return Co2Service.getAllCo2count(co2RequestValue);
	}
	
}
