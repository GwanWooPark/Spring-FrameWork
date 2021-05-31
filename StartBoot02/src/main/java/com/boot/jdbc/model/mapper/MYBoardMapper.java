package com.boot.jdbc.model.mapper;

import com.boot.jdbc.model.dto.MYDto;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MYBoardMapper {

    @Select(" SELECT MYNO, MYNAME, MYTITLE, MYCONTENT, MYDATE FROM MYBOARD ORDER BY MYNO DESC ")
    List<MYDto> selectList();

    @Select(" SELECT MYNO, MYNAME, MYTITLE, MYCONTENT, MYDATE FROM MYBOARD WHERE MYNO = #{myno} ")
    MYDto selectOne(int myno);

    @Insert(" INSERT INTO MYBOARD VALUES (MYNOSEQ.NEXTVAL, #{myname}, #{mytitle}, #{mycontent}, SYSDATE) ")
    int insert(MYDto dto);

    @Update(" UPDATE MYBOARD SET MYTITLE = #{mytitle}, MYCONTENT = #{mycontent} WHERE MYNO = #{myno} ")
    int update(MYDto dto);

    @Delete(" DELETE FROM MYBOARD WHERE MYNO = #{myno} ")
    int delete(int myno);
}
