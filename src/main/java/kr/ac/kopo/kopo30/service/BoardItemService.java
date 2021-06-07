package kr.ac.kopo.kopo30.service;

import java.util.List;

import kr.ac.kopo.kopo30.domain.Board;
import kr.ac.kopo.kopo30.domain.BoardItem;

public interface BoardItemService {
	void create(BoardItem boardItem);
	BoardItem selectOne(int id);
	List<BoardItem> selectAll();
	void update(BoardItem boardItem);
	void delete(BoardItem boardItem);
}
