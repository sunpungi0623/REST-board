package board.board.mapper;

import board.board.dto.BoardDto;
import board.board.dto.Criteria;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<BoardDto> getList(Criteria criteria) throws Exception;
    void insertBoard(BoardDto board) throws Exception;
    void updateHitCount(int boardIdx) throws Exception;
    BoardDto selectBoardDetail(int boardIdx) throws Exception;
    void updateBoard(BoardDto board) throws Exception;
    void deleteBoard(int boardIdx) throws Exception;
    int getTotal() throws Exception;
}
