package com.pharmawizard.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pharmawizard.domain.Comment;
import com.pharmawizard.service.CommentService;

@RestController
@RequestMapping("/comment")
public class CommentController {

	Logger logger = Logger.getGlobal();

	private final CommentService commentService;

	@Autowired
	public CommentController(CommentService commentService) {
		this.commentService = commentService;
	}

	@RequestMapping(value = { "/getCommentModel" }, method = RequestMethod.GET)
	public Comment getCommentModel(Comment comment) {
		return new Comment();
	}

	@RequestMapping(value = { "/getCommentById/{idComment}" }, method = RequestMethod.GET)
	public Comment getCommentById(@PathVariable("idComment") Long idComment) {
		return commentService.getCommentById(idComment);
	}

	@RequestMapping(value = { "/createComment" }, method = RequestMethod.POST)
	public Comment createComment(Comment comment) {
		return commentService.createComment(comment);
	}

	@RequestMapping(value = { "/deleteTopic" }, method = RequestMethod.DELETE)
	public boolean deleteComment(Comment comment) {
		return commentService.deleteComment(comment);
	}

	@RequestMapping(value = { "/updateTopic" }, method = RequestMethod.POST)
	public Comment updateComment(Comment comment) {
		return commentService.saveComment(comment);
	}

}
