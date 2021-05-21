package com.mvc.upgrade.model.dao;

import com.mvc.upgrade.model.dto.MyBoardDto;

import java.util.List;

public interface MyBoardDao {

    String NAMESPACE = "myboard.";

    public List<MyBoardDto> selectList();

    public MyBoardDto selectOne(int myno);

    public int insert(MyBoardDto dto);

    public int update(MyBoardDto dto);

    public int delete(int myno);
}
