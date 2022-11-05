package com.spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.spring.domain.BoardVO;
import com.spring.domain.Criteria;
import com.spring.domain.ReplyVO;

public interface BoardMapper {
	
	public List<BoardVO> getList();
	
	public List<BoardVO> getListWithPaging(Criteria cir);
	
	public void insert(BoardVO vo);
	
	public void insertSelectKey(BoardVO board);

	public BoardVO read(Long bno);
	
	public int delete(Long bno);
	
	public int update(BoardVO board);

	public int getTotalCount(Criteria cri);
	
	public void updateReplyCnt(@Param ("bno") Long bno, @Param ("amount") int amount);
	
}
