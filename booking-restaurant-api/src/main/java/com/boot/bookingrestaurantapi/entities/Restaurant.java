package com.boot.bookingrestaurantapi.entities;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "RESTAURANT")
public class Restaurant {
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   @Column(name = "ID", unique = true, nullable = false)
	   private Long id;
	   
	   @Column(name = "NAME")
	   private String name;
	   
	   @Column(name = "ADDRESS")
	   private String address;
	   
	   @Column(name = "DESCRIPTION")
	   private String description;
	   
	   @Column(name = "IMAGE")
	   private String image;
	   
	 @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "restaurant")
	 private List<Reservation> reservations;
	 
	 @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "restaurant")
	 private List<Board> board;
	 
	 @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "restaurant")
	 private List<Turn> turn;

	
	 public Restaurant() {
		super();
	}

	public Restaurant(Long id, String name, String address, String description, String image,
			List<Reservation> reservations, List<Board> board, List<Turn> turn) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.description = description;
		this.image = image;
		this.reservations = reservations;
		this.board = board;
		this.turn = turn;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public List<Board> getBoard() {
		return board;
	}

	public void setBoard(List<Board> board) {
		this.board = board;
	}

	public List<Turn> getTurn() {
		return turn;
	}

	public void setTurn(List<Turn> turn) {
		this.turn = turn;
	}
	 
	 
}
