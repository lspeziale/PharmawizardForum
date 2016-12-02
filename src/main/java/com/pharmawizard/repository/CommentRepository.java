package com.pharmawizard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pharmawizard.domain.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{
	
	public Comment findByIdComment(Long idComment);
	
}
