package com.boot.jpa.model.dao;

import com.boot.jpa.model.dto.JpaDto;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface JpaDao extends JpaRepository<JpaDto, Integer> {

    public List<JpaDto> findAll();

    public JpaDto findByMyno(int myno);

    public JpaDto save(JpaDto dto);

    public JpaDto saveAndFlush(JpaDto dto);

    @Transactional
    public void deleteByMyno(int myno);
}
