package board.board.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class BoardDto {
    private int boardIdx;
    private String title;
    private String contents;
    private int hitCnt;
    private String creatorId;
    private Date createdDatetime;
    private String updaterId;
    private Date updatedDatetime;
    private String deletedYn;
    private List<BoardFileDto> fileList;
}
