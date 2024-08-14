package io.watchparty.ratings_data_service.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.watchparty.ratings_data_service.DTO.Rating;
import io.watchparty.ratings_data_service.DTO.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsController {
	
	@GetMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating("movieId", 4);
	}
	
	@GetMapping("/users/{userId}")
	public UserRating getUserRating(@PathVariable("userId") String userId) {
		List<Rating> ratings = Arrays.asList(new Rating("1234", 4), new Rating("5678", 5));
		UserRating userRating = new UserRating(ratings);
		return userRating;
	}

}
