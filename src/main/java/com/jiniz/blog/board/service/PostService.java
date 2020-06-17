package com.jiniz.blog.board.service;

import java.util.List;

import com.jiniz.blog.board.model.PostVO;

public interface PostService {

	public List<PostVO> getPostList() throws Exception;
}
