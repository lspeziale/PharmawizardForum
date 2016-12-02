package com.pharmawizard.service;

import java.util.logging.Logger;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.pharmawizard.domain.Comment;
import com.pharmawizard.repository.CommentRepository;

@Service
public class CommentServiceImpl implements CommentService {

	Logger logger = Logger.getGlobal();

	private final CommentRepository commentRepository;

	public CommentServiceImpl(CommentRepository commentRepository) {
		this.commentRepository = commentRepository;
	}

	@Override
	public Comment getCommentById(@Param("idComment") Long idComment) {
		return commentRepository.findByIdComment(idComment);
	}

	@Override
	public Comment createComment(Comment comment) {
		return commentRepository.save(comment);
	}

	@Override
	public boolean deleteComment(Comment comment) {
		if (commentRepository.exists(comment.getIdComment())) {
			commentRepository.delete(comment);
			return true;
		} else {
			logger.info("Comment doesn't exist");
			return false;
		}

	}

	@Override
	public Comment saveComment(Comment comment) {
		return commentRepository.save(comment);
	}

}
