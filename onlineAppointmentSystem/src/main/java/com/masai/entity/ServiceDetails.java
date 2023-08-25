package com.masai.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ServiceDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int service_Id;
	
	@Column(length = 100, nullable = false)
	private String serviceName;
	
	@Column(length = 500)
	private String description;
	
	@Column(nullable = false)
	private double price;
	
	@ManyToOne
	@JoinColumn(name = "provider_id")
	private ServiceProvider serviceProvider;

	public ServiceDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ServiceDetails(String serviceName, String description, double price, ServiceProvider serviceProvider) {
		super();
		this.serviceName = serviceName;
		this.description = description;
		this.price = price;
		this.serviceProvider = serviceProvider;
	}

	/**
	 * @return the service_Id
	 */
	public int getService_Id() {
		return service_Id;
	}

	/**
	 * @param service_Id the service_Id to set
	 */
	public void setService_Id(int service_Id) {
		this.service_Id = service_Id;
	}

	/**
	 * @return the serviceName
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * @param serviceName the serviceName to set
	 */
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
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
		return "ServiceDetails [service_Id=" + service_Id + ", serviceName=" + serviceName + ", description="
				+ description + ", price=" + price + ", serviceProvider=" + serviceProvider + "]";
	}
	
	
}
