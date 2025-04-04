package com.boot.bookingrestaurantapi.entities;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "RESERVATION")
public class Reservation {
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   @Column(name = "ID", unique = true, nullable = false)
	   private Long id;
	   
	   @Column(name = "LOCATOR")
	   private String locator;
	   
	   @Column(name = "TURN")
	   private String turn;
	   
	   @Column(name = "PERSON")
	   private Long person;
	   
	   @Column(name = "DATE")
	   private Date date;
	   
	   @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	   @JoinColumn(name = "RESTAURANT_ID", nullable = false)
	   private Restaurant restaurant;
	   
	   

	public Reservation() {
		super();
	}
	
	

	public Reservation(Long id, String locator, String turn, Long person, Date date, Restaurant restaurant) {
		super();
		this.id = id;
		this.locator = locator;
		this.turn = turn;
		this.person = person;
		this.date = date;
		this.restaurant = restaurant;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLocator() {
		return locator;
	}

	public void setLocator(String locator) {
		this.locator = locator;
	}

	public String getTurn() {
		return turn;
	}

	public void setTurn(String turn) {
		this.turn = turn;
	}

	public Long getPerson() {
		return person;
	}

	public void setPerson(Long person) {
		this.person = person;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	   
	   
}
