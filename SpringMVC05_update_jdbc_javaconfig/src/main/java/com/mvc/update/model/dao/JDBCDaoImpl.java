package com.mvc.update.model.dao;

import com.mvc.update.model.dto.JDBCDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

@Repository
public class JDBCDaoImpl implements JDBCDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;



    @Override
    public List<JDBCDto> selectList() {

        List<JDBCDto> list = new ArrayList<JDBCDto>();

        String sql = " SELECT SEQ, WRITER, TITLE, CONTENT, REGDATE FROM JDBCBOARD ORDER BY SEQ DESC ";

        // lambda - 간단하게 만들겠다
        // 뭐를? -> body(Method)가 1개인 Interface를 익명으로(일회성)
        list = jdbcTemplate.query(sql, new MyMapper());
        return list;
    }

    @Override
    public JDBCDto selectOne(int seq) {
        JDBCDto dto = new JDBCDto();
        String sql = " SELECT SEQ, WRITER, TITLE, CONTENT, REGDATE FROM JDBCBOARD WHERE SEQ = ? ";
        try {
            dto = jdbcTemplate.queryForObject(sql, new MyMapper(), seq);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }

        return dto;
    }

    @Override
    public int insert(JDBCDto dto) {

        String sql = " INSERT INTO JDBCBOARD VALUES(JDBCBOARDSEQ.NEXTVAL, ?, ? ,?, SYSDATE) ";
        int res = 0;
        try {
            res = jdbcTemplate.update(sql,
                    new Object[]{dto.getWriter(), dto.getTitle(), dto.getContent()},
                    new int[]{Types.VARCHAR, Types.VARCHAR, Types.VARCHAR});
        } catch (Exception e) {
            e.printStackTrace();
        }

        return res;
    }

    @Override
    public int update(JDBCDto dto) {

        String sql = " UPDATE JDBCBOARD SET TITLE = ?, CONTENT = ?  WHERE SEQ = ? ";
        int res = 0;
        try {
            res = jdbcTemplate.update(sql,
                    new Object[] {dto.getTitle(), dto.getContent(), dto.getSeq()},
                    new int[] {Types.VARCHAR, Types.VARCHAR, Types.INTEGER});
        } catch (Exception e) {
            e.printStackTrace();
        }

        return res;
    }

    @Override
    public int delete(int seq) {
        String sql = " DELETE FROM JDBCBOARD WHERE SEQ = ? ";

        int res = 0;
        try {
            res = jdbcTemplate.update(sql, new Object[]{seq}, new int[]{Types.INTEGER});
        } catch (Exception e) {
            e.printStackTrace();
        }

        return res;
    }

    // inner class impl RowMapper
    private static final class MyMapper implements RowMapper<JDBCDto> {
        @Override
        public JDBCDto mapRow(ResultSet rs, int i) throws SQLException {
            return new JDBCDto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5));
        }

    }

}
