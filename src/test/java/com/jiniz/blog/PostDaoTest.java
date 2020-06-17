package com.jiniz.blog;

import java.util.List;

import javax.inject.Inject;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jiniz.blog.board.dao.PostDAO;
import com.jiniz.blog.board.model.PostVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {

		"classpath:spring/root-context.xml",
		"classpath:spring/dataSource-context.xml"

		})

public class PostDaoTest {

	private static final Logger logger = LoggerFactory.getLogger(PostDaoTest.class);

	@Inject
	private PostDAO postDAO;

	@Test @Ignore
	public void testGetPostList() throws Exception {

		List<PostVO> postList = postDAO.getPostList();

		logger.info("\n Post List \n ");

		if (postList.size() > 0) {
			for(PostVO list : postList) {
				logger.info(list.title);
			}
		} else {
			logger.info("데이터가 없습니다.");
		}
	}

	@Test @Ignore
	public void testGetPostContents() throws Exception {

		PostVO postVO = postDAO.getPostContents(1);

		logger.info("\n Post List \n ");

		if (postVO != null) {

			logger.info("글번호 : " + postVO.getPid());
			logger.info("글제목 : " + postVO.getTitle());
			logger.info("글내용 : " + postVO.getContents());
			logger.info("글태그 : " + postVO.getTag());
			logger.info("조회수 : " + postVO.getView_cnt());
			logger.info("작성자 : " + postVO.getAuthor());
			logger.info("작성일 : " + postVO.getCreated());
			logger.info("수정일 : " + postVO.getModified());

		} else {
			logger.info("데이터가 없습니다.");
		}
	}

	@Test @Ignore
	public void testInsertPost() throws Exception {

		PostVO postVO = new PostVO();
		postVO.setCategory("1");
		postVO.setTitle("첫번째 게시물 입니다.");
		postVO.setContents("첫번째 게시물입니다.");
		postVO.setTag("1");
		postVO.setAuthor("1");

		int result = postDAO.insertPost(postVO);

		logger.info("\n Insert Post Result " + result);

		if (result == 1) {
			logger.info("\n 게시물 등록 성공 ");
		} else {
			logger.info("\n 게시물 등록 실패");
		}
	}

	@Test  
	public void testUpdatePost() throws Exception {

		PostVO postVO = new PostVO();
		postVO.setPid(1);
		postVO.setCategory("1");
		postVO.setTitle("첫번째 게시물 입니다-수정 합니다.");
		postVO.setContents("첫번째 게시물입니다-수정합니다.");
		postVO.setTag("1-1");

		int result = postDAO.updatePost(postVO);

		logger.info("\n Update Post Result \n ");

		if (result > 0) {
			logger.info("\n 게시물 수정 성공 ");
		} else {
			logger.info("\n 게시물 수정 실패");
		}
	}

	@Test 
	public void testDeletePost() throws Exception {

		int result = postDAO.deletePost(1);

		logger.info("\n Delete Post Result \n ");

		if (result > 0) {
			logger.info("\n 게시물 삭제 성공 ");
		} else {
			logger.info("\n 게시물 삭제 실패");
		}
	}

	@Test @Ignore
	public void testUpdateViewCnt() throws Exception {

		int result = postDAO.updateViewCnt(1);

		logger.info("\n Update View Count Result \n ");

		if (result > 0) {
			logger.info("\n 게시물 조회수 업데이트 성공 ");
		} else {
			logger.info("\n 게시물 조회수 업데이트 실패");
		}
	}
}
