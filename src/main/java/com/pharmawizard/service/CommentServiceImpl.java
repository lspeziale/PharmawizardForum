package com.pharmawizard.service;

import java.util.Optional;

import com.pharmawizard.domain.Comment;
import com.pharmawizard.repository.CommentRepository;

public class CommentServiceImpl implements CommentService {

	private final CommentRepository commentRepository;

	public CommentServiceImpl(CommentRepository commentService) {
		this.commentRepository = commentService;
	}

	@Override
	public Comment getCommentById(long idComment) {
		// TODO Auto-generated method stub
		return null;
	}

}
