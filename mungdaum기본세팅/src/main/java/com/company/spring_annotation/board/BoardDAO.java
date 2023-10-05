package com.company.spring_annotation.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.company.spring_annotation.board.BoardDO;
import com.company.spring_annotation.common.JDBCUtil;

public class BoardDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	// 게시글 목록 조회 메소드
	public List<BoardDO> getBoardList(String searchCondition, String searchKeyword) {
		System.out.println("getBoardList() 메소드 처리");
		
		// 가변배열 생성
		List<BoardDO> boardList = new ArrayList<BoardDO>();	//가변배열 기본 10개 생성
		
		try {
			conn = JDBCUtil.getConnection() ;
			
			String where = "";
			
			if(searchCondition != null && searchKeyword != null) { // 조건 검색 시
				where = "where "+searchCondition+" like '%"+searchKeyword+"%'";
			}
			String BOARD_SELECT = "select * from board "+where+" order by seq desc";
			pstmt = conn.prepareStatement(BOARD_SELECT);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BoardDO board = new BoardDO();
				
				board.setSeq(rs.getInt("SEQ"));
				board.setTitle(rs.getString("TITLE"));
				board.setWriter(rs.getString("WRITER"));
				board.setContent(rs.getString("CONTENT"));
				board.setRegdate(rs.getDate("REGDATE"));
				board.setCnt(rs.getInt("CNT"));
				
				boardList.add(board);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		
		return boardList;
	}//end getBoardList() ==================================================================
	
	//사용자가 특정 '제목'을 클릭 시 해당 게시글 상세 검색 getBoard() 메소드 구현
	public BoardDO getBoard(BoardDO boardDO) {
		System.out.println("===>getBoard() 메소드 구현되었습니다.");
		
		BoardDO board = null;
		
		try {
			conn = JDBCUtil.getConnection();
			
			String UPDATE_CNT = "update board set cnt=cnt+1 where seq=?";
			pstmt = conn.prepareStatement(UPDATE_CNT);
			pstmt.setInt(1, boardDO.getSeq());
			pstmt.executeUpdate();
			
			String BOARD_GET = "select * from board where seq=?";
			pstmt = conn.prepareStatement(BOARD_GET);
			pstmt.setInt(1, boardDO.getSeq());
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				board = new BoardDO();
				board.setSeq(rs.getInt("SEQ"));
				board.setTitle(rs.getString("TITLE"));
				board.setWriter(rs.getString("WRITER"));
				board.setContent(rs.getString("CONTENT"));
				board.setRegdate(rs.getDate("REGDATE"));
				board.setCnt(rs.getInt("CNT"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		return board;
	}//end getBoard() =================================================================
	
	//게시글 수정 updateBoard() 메소드 구현
	public void updateBoard(BoardDO boardDO) {
		System.out.println("===> updateBoard() 메소드 처리되었습니다.");
		
		try {
			conn = JDBCUtil.getConnection();
			
			String BOARD_UPDATE = "update board set title=?, content=? where seq=?";
			pstmt = conn.prepareStatement(BOARD_UPDATE);
			pstmt.setString(1, boardDO.getTitle());
			pstmt.setString(2, boardDO.getContent());
			pstmt.setInt(3, boardDO.getSeq());
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(pstmt, conn);
		}
		
	}//end updateBoard() =================================================================
	
	//게시글 삭제 deleteBoard() 메소드 구현
	public void deleteBoard(BoardDO boardDO) {
		System.out.println("===> deleteBoard() 메소드 처리되었습니다.");
		
		try {
			conn = JDBCUtil.getConnection();
			
			String BOARD_DELETE = "delete from board where seq=?";
			pstmt = conn.prepareStatement(BOARD_DELETE);
			pstmt.setInt(1, boardDO.getSeq());
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(pstmt, conn);
		}
	}//end deleteBoard() =================================================================
	
	//게시글 등록 insertBoard() 메소드 구현
	public void insertBoard(BoardDO boardDO) {
		System.out.println("===> insertBoard() 메소드 처리되었습니다.");
		
		try {
			conn = JDBCUtil.getConnection();
			
			String BOARD_INSERT = "insert into board(seq, title, writer, content) values((select NVL(MAX(seq),0)+1 from board), ?, ?, ?)";
			pstmt = conn.prepareStatement(BOARD_INSERT);
			pstmt.setString(1, boardDO.getTitle());
			pstmt.setString(2, boardDO.getWriter());
			pstmt.setString(3, boardDO.getContent());
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(pstmt, conn);
		}
	}//end indertBoard() =================================================================

}
