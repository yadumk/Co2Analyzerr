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
import com.co2analyzer.spring.datajpa.repository.Co2countRepository;
import com.co2analyzer.spring.dto.Co2viewRequestDto;

@RestController
@RequestMapping("/api")
public class TutorialController {

	@Autowired
	Co2countRepository co2countRepository;

	@PostMapping("/co2countPost")
	public ResponseEntity<Co2count> createCo2count(@RequestBody Co2count coValue) {
		try {
			if (StringUtils.isEmpty(coValue.getCo2countvalue())) {
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			} else if (StringUtils.isEmpty(coValue.getCo2datetime())) {
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			} else if (StringUtils.isEmpty(coValue.getCo2sensorid())) {
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			} else {
				Co2count co2count = co2countRepository.save(
						new Co2count(coValue.getCo2countvalue(), coValue.getCo2datetime(), coValue.getCo2sensorid()));
				return new ResponseEntity<>(HttpStatus.CREATED);
			}

		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/co2countView")
	public ResponseEntity<List<Co2count>> getAllCo2count(@RequestBody Co2viewRequestDto co2RequestValue) {
		try {
			List<Co2count> Co2count = null;
			if (StringUtils.isEmpty(co2RequestValue.getDistrict_id())) {
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			} else if (StringUtils.isEmpty(co2RequestValue.getStart_date())) {
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			} else if (StringUtils.isEmpty(co2RequestValue.getEnd_date())) {
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			} else {
				Co2count = co2countRepository.findByCo2CountDetails(co2RequestValue.getStart_date(),
						co2RequestValue.getEnd_date(), co2RequestValue.getDistrict_id());
				
				return new ResponseEntity<>(Co2count, HttpStatus.OK);
			}

		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
