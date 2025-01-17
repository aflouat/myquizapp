package fr.tmsconsult.myquiz.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class LoginRequest {
	@NotBlank
  	private String identifier;

	@NotBlank
	private String password;
}
