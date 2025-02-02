package org.codejudge.sb.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.util.StringUtils;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ChangePasswordRequest {

    private String password;
    @JsonProperty("confirm_password")
    private String confirmPassword;

    public void validateForChangePassword() {
        validatePassword();
        validateConfirmPassword();
    }

    private void validatePassword() {
        if (StringUtils.isEmpty(password)) {
            throw new IllegalArgumentException("password cannot be empty");
        }
    }

    private void validateConfirmPassword() {
        if (StringUtils.isEmpty(confirmPassword)) {
            throw new IllegalArgumentException("password cannot be empty");
        }
    }

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
    
    

}
