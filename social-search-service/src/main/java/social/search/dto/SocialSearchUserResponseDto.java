package social.search.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SocialSearchUserResponseDto {

	private Long id;
	private String name;
	private String city;
	private String country;

}
