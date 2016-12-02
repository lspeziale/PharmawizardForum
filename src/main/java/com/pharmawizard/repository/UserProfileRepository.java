package com.pharmawizard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pharmawizard.domain.UserProfile;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {

	UserProfile findByUsername(String username);

	UserProfile findUserByEmail(String email);
}
