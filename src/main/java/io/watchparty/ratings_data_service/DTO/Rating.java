package io.watchparty.ratings_data_service.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Rating {
	private  String movieId;
	private int rating;
}
