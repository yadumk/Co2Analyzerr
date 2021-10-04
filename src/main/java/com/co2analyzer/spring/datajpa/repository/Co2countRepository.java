package com.co2analyzer.spring.datajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.co2analyzer.spring.datajpa.model.Co2count;

public interface Co2countRepository extends JpaRepository<Co2count, Long> {
	
	@Query(value = "SELECT co.co2datetime AS datevalue , AVG(co.co2countvalue) AS co2count FROM co2count co INNER JOIN sensor se ON co.co2sensorid = se.sensorid INNER JOIN district di ON se.sensor_district_id = di.districtid WHERE ( co.co2datetime BETWEEN :start_date AND :end_date ) AND di.districtid = :districtid GROUP BY co2datetime;", nativeQuery = true)
	List<Co2count> findByCo2CountDetails(@Param("start_date") String start_date,@Param("end_date") String end_date,@Param("districtid") long districtid );
	
}
