package com.capgemini.entity;



import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonFormat;



@Entity
@Table(name="scheduling")
public class Schedule {
	
	@Id
	@Column(length=10)
	private int scheduleId;
	@Column(length=10)
	private String sourceAirport;
	@Column(length=10)
	private String destinationAirport;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(length=10)
	private LocalDateTime departureDate;
	 @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	 @Column(length=10)
	private LocalDateTime arrivalDate;
	
	@OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "airportId")
	private Airport airport;
	
	@OneToOne( mappedBy = "schedule")
	private ScheduleFlight scheduleFlight;
	
	public int getScheduleId() {
		return scheduleId;
	}
	
	public void setAirport(Airport airport) {
		this.airport = airport;
	}
	public void setScheduleFlight(ScheduleFlight scheduleFlight) {
		this.scheduleFlight = scheduleFlight;
	}
	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}
	public String getSourceAirport() {
		return sourceAirport;
	}
	public void setSourceAirport(String sourceAirport) {
		this.sourceAirport = sourceAirport;
	}
	public String getDestinationAirport() {
		return destinationAirport;
	}
	public void setDestinationAirport(String destinationAirport) {
		this.destinationAirport = destinationAirport;
	}
	
	 
	    
	public LocalDateTime getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(LocalDateTime departureDate) {
		this.departureDate = departureDate;
	}
	 @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public LocalDateTime getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(LocalDateTime arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	

	public Schedule(int scheduleId, String sourceAirport, String destinationAirport, LocalDateTime departureDate,
			LocalDateTime arrivalDate) {
		super();
		this.scheduleId = scheduleId;
		this.sourceAirport = sourceAirport;
		this.destinationAirport = destinationAirport;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
	}
	public Schedule(){
		
	}
}
