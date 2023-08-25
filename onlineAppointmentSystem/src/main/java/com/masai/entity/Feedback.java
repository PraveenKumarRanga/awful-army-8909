package com.masai.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Feedback {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int feedback_Id;
	
	@Column(nullable = false)
	private int rating;
	
	@Column(length = 500)
	private String comment;
	
	@ManyToOne
	@JoinColumn(name = "customer_Id")
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name = "appointment_Id")
	private Appointment appointment;

	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Feedback(int rating, String comment, Customer customer, Appointment appointment) {
		super();
		this.rating = rating;
		this.comment = comment;
		this.customer = customer;
		this.appointment = appointment;
	}

	/**
	 * @return the feedback_Id
	 */
	public int getFeedback_Id() {
		return feedback_Id;
	}

	/**
	 * @param feedback_Id the feedback_Id to set
	 */
	public void setFeedback_Id(int feedback_Id) {
		this.feedback_Id = feedback_Id;
	}

	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
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
	 * @return the appointment
	 */
	public Appointment getAppointment() {
		return appointment;
	}

	/**
	 * @param appointment the appointment to set
	 */
	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	@Override
	public String toString() {
		return "Feedback [feedback_Id=" + feedback_Id + ", rating=" + rating + ", comment=" + comment + ", customer="
				+ customer + ", appointment=" + appointment + "]";
	}
	
	
	
}
