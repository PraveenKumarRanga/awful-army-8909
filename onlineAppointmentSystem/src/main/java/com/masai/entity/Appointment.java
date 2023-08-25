package com.masai.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "appointment_Id")
	private int id;
	
	@Column(nullable = false)
	private LocalDate appointment_Date;
	
	@Column(nullable = false)
	private LocalTime appointment_Time;
	
	@ManyToOne
	@JoinColumn(name = "customer_Id")
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name = "provider_Id")
	private ServiceProvider serviceProvider;

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointment(LocalDate appointment_Date, LocalTime appointment_Time, Customer customer,
			ServiceProvider serviceProvider) {
		super();
		this.appointment_Date = appointment_Date;
		this.appointment_Time = appointment_Time;
		this.customer = customer;
		this.serviceProvider = serviceProvider;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the appointment_Date
	 */
	public LocalDate getAppointment_Date() {
		return appointment_Date;
	}

	/**
	 * @param appointment_Date the appointment_Date to set
	 */
	public void setAppointment_Date(LocalDate appointment_Date) {
		this.appointment_Date = appointment_Date;
	}

	/**
	 * @return the appointment_Time
	 */
	public LocalTime getAppointment_Time() {
		return appointment_Time;
	}

	/**
	 * @param appointment_Time the appointment_Time to set
	 */
	public void setAppointment_Time(LocalTime appointment_Time) {
		this.appointment_Time = appointment_Time;
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @return the serviceProvider
	 */
	public ServiceProvider getServiceProvider() {
		return serviceProvider;
	}

	/**
	 * @param serviceProvider the serviceProvider to set
	 */
	public void setServiceProvider(ServiceProvider serviceProvider) {
		this.serviceProvider = serviceProvider;
	}

	@Override
	public String toString() {
		return "Appointment [id=" + id + ", appointment_Date=" + appointment_Date + ", appointment_Time="
				+ appointment_Time + ", customer=" + customer + ", serviceProvider=" + serviceProvider + "]";
	}
	
	
	
	
	
	
	
}
