package board.board.service;

import board.board.dto.BoardDto;
import board.board.dto.Criteria;
import board.board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardMapper boardMapper;
    @Override
    public List<BoardDto> getList(Criteria cri) throws Exception {
        return boardMapper.getList(cri);
    }
    @Override
    public void insertBoard(BoardDto board) throws Exception {
        boardMapper.insertBoard(board);
    }
    @Override
    public BoardDto selectBoardDetail(int boardIdx) throws Exception {
        boardMapper.updateHitCount(boardIdx);

        BoardDto board = boardMapper.selectBoardDetail(boardIdx);

        return board;
    }
    @Override
    public void updateBoard(BoardDto board) throws Exception {
        boardMapper.updateBoard(board);
    }
    @Override
    public void deleteBoard(int boardIdx) throws Exception {
        boardMapper.deleteBoard(boardIdx);
    }
    @Override
    public int getTotal() throws Exception {
        return boardMapper.getTotal();
    }
}
