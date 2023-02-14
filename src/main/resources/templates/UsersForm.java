package templates;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsersForm {

	//유효성 체크
	@NotEmpty(message="name값은 필수 사항입니다.")
	@Size(max=100)
	private String name;
	@NotEmpty(message="pass값은 필수 사항입니다.")
	@Size(max=100)
	private String pass;
	@NotEmpty(message="email값은 필수 사항입니다.")
	@Size(max=200)
	private String email;
	
	
}
