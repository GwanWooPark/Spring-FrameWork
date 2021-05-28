package com.mvc.update.model.dao;

import com.mvc.update.model.dto.JDBCDto;

import java.util.List;

public interface JDBCDao {

    public List<JDBCDto> selectList();
    public JDBCDto selectOne(int seq);
    public int insert(JDBCDto dto);
    public int update(JDBCDto dto);
    public int delete(int seq);
}
