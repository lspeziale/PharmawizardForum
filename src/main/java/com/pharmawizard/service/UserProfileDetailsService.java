package com.pharmawizard.service;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.pharmawizard.domain.UserProfile;
import com.pharmawizard.repository.UserProfileRepository;

@Component
public class UserProfileDetailsService implements UserDetailsService{
	
	private final UserProfileRepository repository;

	@Autowired
	public UserProfileDetailsService(UserProfileRepository repository) {
		this.repository = repository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserProfile user = repository.findByUsername(username);
		return new org.springframework.security.core.userdetails.User(
				user.getUsername(), user.getPassword(),
				Stream.of(user.getRole())
					.map(SimpleGrantedAuthority::new)
					.collect(Collectors.toList()));
	}

}
