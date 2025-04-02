package com.boot.bookingrestaurantapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SwaggerConfig {
	@GetMapping("/")
	public String redirectToSuagger () {
		try {
			return "redirect:/swagger-ui/index.html";
		} catch (Exception e) {
			return "redirect;/error";
		}
	}
	
}

