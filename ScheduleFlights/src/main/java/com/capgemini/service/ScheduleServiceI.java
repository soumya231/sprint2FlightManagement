package com.capgemini.service;

import com.capgemini.entity.Flight;
import com.capgemini.entity.ScheduleFlight;

public interface ScheduleServiceI {

	ScheduleFlight updateFlight(ScheduleFlight schedule);

	String addFlight(Flight flight);

}
