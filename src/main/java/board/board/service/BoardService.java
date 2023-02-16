package board.board.service;

import board.board.dto.BoardDto;
import board.board.dto.Criteria;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BoardService {

    List<BoardDto> getList(Criteria criteria) throws Exception;
    void insertBoard(BoardDto board) throws Exception;
    BoardDto selectBoardDetail(int boardIdx) throws Exception;
    void updateBoard(BoardDto board) throws Exception;
    void deleteBoard(int boardIdx) throws Exception;
    int getTotal() throws Exception;
}
