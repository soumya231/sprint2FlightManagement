package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.entity.ScheduleFlight;
import com.capgemini.service.ScheduleService;


@RestController
@RequestMapping("/flight")
@CrossOrigin(origins="http://localhost:4200", maxAge=3600)

public class RestControllerApplication {
	
	
	@Autowired
	private ScheduleService scheduleservice;
	
	@PutMapping("/update")
	public String updateFlight( @RequestBody ScheduleFlight schedule) {
		
			return scheduleservice.updateFlight(schedule);
    }
	
   }