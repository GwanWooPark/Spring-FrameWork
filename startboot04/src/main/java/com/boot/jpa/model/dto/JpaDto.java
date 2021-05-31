package com.boot.jpa.model.dto;

import javax.persistence.*;
import java.util.Date;

// Table 자동 생서
@Entity
@Table(name = "MYBOARD")
public class JpaDto {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    // 시퀀스 자동 생성
    private int myno;


    @Column
    private String myname;

    @Column
    private String mytitle;

    @Column
    private String mycontent;

    // 날짜 타입임을 알려준다
    @Column(updatable = false)
    @Temporal(TemporalType.DATE)
    private Date mydate;

    public JpaDto() {
    }

    public JpaDto(int myno, String myname, String mytitle, String mycontent, Date mydate) {
        this.myno = myno;
        this.myname = myname;
        this.mytitle = mytitle;
        this.mycontent = mycontent;
        this.mydate = mydate;
    }

    public int getMyno() {
        return myno;
    }

    public void setMyno(int myno) {
        this.myno = myno;
    }

    public String getMyname() {
        return myname;
    }

    public void setMyname(String myname) {
        this.myname = myname;
    }

    public String getMytitle() {
        return mytitle;
    }

    public void setMytitle(String mytitle) {
        this.mytitle = mytitle;
    }

    public String getMycontent() {
        return mycontent;
    }

    public void setMycontent(String mycontent) {
        this.mycontent = mycontent;
    }

    public Date getMydate() {
        return mydate;
    }

    public void setMydate(Date mydate) {
        this.mydate = mydate;
    }
}
