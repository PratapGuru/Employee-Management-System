package net.java.Service;

import org.springframework.security.core.userdetails.UserDetailsService;

import net.java.Model.User;
import net.java.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
