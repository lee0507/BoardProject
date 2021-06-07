package kr.ac.kopo.kopo30.dao;

import kr.ac.kopo.kopo30.domain.Board;

public class BoardDaoTest {
	public static void main(String[] args) {
		Board board = new Board();
		board.setId(1);
		board.setTitle("abcd");
		
		BoardDao boardDao = new BoardDaoImpl();
		boardDao.create(board);
	}
}
