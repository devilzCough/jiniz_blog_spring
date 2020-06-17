package com.jiniz.blog.board.dao;

import java.util.List;

import com.jiniz.blog.board.model.PostVO;

public interface PostDAO {
	
	public List<PostVO> getPostList() throws Exception;
	public PostVO getPostContents(int pid) throws Exception;
	public int insertPost(PostVO postVO) throws Exception;
	public int updatePost(PostVO postVO) throws Exception;
	public int deletePost(int pid) throws Exception;
	public int updateViewCnt(int pid) throws Exception;

}
