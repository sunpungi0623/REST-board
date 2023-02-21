package board.board.mapper;

import board.board.dto.BoardDto;
import board.board.dto.BoardFileDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<BoardDto> selectBoardList() throws Exception;
    List<BoardFileDto> selectBoardFileList(int boardIdx) throws Exception;
    BoardFileDto selectBoardFileInformation(@Param("idx") int idx, @Param("boardIdx") int boardIdx);
    void insertBoard(BoardDto board) throws Exception;
    void insertBoardFileList(List<BoardFileDto> list) throws Exception;
    void updateHitCount(int boardIdx) throws Exception;
    BoardDto selectBoardDetail(int boardIdx) throws Exception;
    void updateBoard(BoardDto board) throws Exception;
    void deleteBoard(int boardIdx) throws Exception;
}
