package com.capgemini.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.capgemini.dao.ScheduleDao;
import com.capgemini.entity.ScheduleFlight;

@Service
public class ScheduleService implements ScheduleServiceI{

	@Autowired
	private ScheduleDao scheduledao ;
	

       @Override
		public String updateFlight(ScheduleFlight schedule) {
		
		boolean result=scheduledao.existsById(schedule.getFlightNumber());
		
		if(result){
			scheduledao.save(schedule);
			return "updated flight";
		}else{
			
			return "Id not exits";
		}
	
	}
		
	
}
