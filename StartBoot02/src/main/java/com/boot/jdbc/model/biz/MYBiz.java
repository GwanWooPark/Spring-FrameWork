package com.boot.jdbc.model.biz;

import com.boot.jdbc.model.dto.MYDto;

import java.util.List;

public interface MYBiz {

    public List<MYDto> selectList();
    public MYDto selectOne(int myno);
    public int insert(MYDto dto);
    public int update(MYDto dto);
    public int delete(int myno);
}
