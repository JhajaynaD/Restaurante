package com.boot.bookingrestaurantapi.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.boot.bookingrestaurantapi.entities.Restaurant;
@Repository

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

	Optional<Restaurant> finById(Long id);
	
	Optional<Restaurant> finByLocator(String nameRestaurant);
	
	@Query("SELECT REST FROM Restaurant REST")
public List<Restaurant> findRestaurants();

}