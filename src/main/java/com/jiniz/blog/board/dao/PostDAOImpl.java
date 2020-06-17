package com.jiniz.blog.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.jiniz.blog.board.model.PostVO;

@Repository
public class PostDAOImpl implements PostDAO {
	
	@Inject
	private SqlSession sqlSession;


	@Override
	public List<PostVO> getPostList() throws Exception {

		return sqlSession.selectList("com.jiniz.blog.board.boardMapper.getPostList");

	}

	@Override
	public PostVO getPostContents(int pid) throws Exception {

		return sqlSession.selectOne("com.jiniz.blog.board.boardMapper.getPostContents", pid);

	}

	@Override
	public int insertPost(PostVO postVO) throws Exception {

		return sqlSession.insert("com.jiniz.blog.board.boardMapper.insertPost", postVO);

	}

	@Override
	public int updatePost(PostVO postVO) throws Exception {

		return sqlSession.update("com.jiniz.blog.board.boardMapper.updatePost", postVO);

	}

	@Override
	public int deletePost(int pid) throws Exception {

		return sqlSession.insert("com.jiniz.blog.board.boardMapper.deletePost", pid);

	}

	@Override
	public int updateViewCnt(int pid) throws Exception {

		return sqlSession.update("com.jiniz.blog.board.boardMapper.updateViewCnt", pid);

	}

}
