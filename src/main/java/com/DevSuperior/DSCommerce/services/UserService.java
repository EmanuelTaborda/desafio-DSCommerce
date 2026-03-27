package com.DevSuperior.DSCommerce.services;

import com.DevSuperior.DSCommerce.dto.UserDTO;
import com.DevSuperior.DSCommerce.entities.Role;
import com.DevSuperior.DSCommerce.entities.User;
import com.DevSuperior.DSCommerce.projections.UserDetailsProjection;
import com.DevSuperior.DSCommerce.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService implements UserDetailsService {

	@Autowired
	private UserRepository repository;


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return null;
	}
}
