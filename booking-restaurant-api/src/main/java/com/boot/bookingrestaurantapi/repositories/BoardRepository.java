package com.boot.bookingrestaurantapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.bookingrestaurantapi.entities.Board;

public interface BoardRepository extends JpaRepository <Board,Long> {

}
