package com.jiniz.blog.board.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jiniz.blog.board.service.PostService;

@Controller
@RequestMapping(value="/board")
public class PostController {
	
	@Inject
	private PostService postService;

	@RequestMapping(value = "/getPostList", method = RequestMethod.GET)
	public String getPostList(Model model) throws Exception {

		model.addAttribute("postList", postService.getPostList());

		return "board/index";

	}
}
