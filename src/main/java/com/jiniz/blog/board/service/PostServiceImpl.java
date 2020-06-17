package com.jiniz.blog.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.jiniz.blog.board.dao.PostDAO;
import com.jiniz.blog.board.model.PostVO;

@Service
public class PostServiceImpl implements PostService {

	@Inject
	private PostDAO postDAO;

	public List<PostVO> getPostList() throws Exception {

		return postDAO.getPostList();

	}
}
