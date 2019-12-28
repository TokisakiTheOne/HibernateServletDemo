package com.yyh.po;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

/**
 * @author YanYuHang
 * @create 2019-12-28-10:45
 */
@Entity
public class Student {
    private int stuid;
    private String stuname;
    private String stupwd;

    @Id
    @Column(name = "stuid", nullable = false)
    public int getStuid() {
        return stuid;
    }

    public void setStuid(int stuid) {
        this.stuid = stuid;
    }

    @Basic
    @Column(name = "stuname", nullable = false, length = 20)
    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    @Basic
    @Column(name = "stupwd", nullable = false, length = 30)
    public String getStupwd() {
        return stupwd;
    }

    public void setStupwd(String stupwd) {
        this.stupwd = stupwd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return stuid == student.stuid &&
                Objects.equals(stuname, student.stuname) &&
                Objects.equals(stupwd, student.stupwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stuid, stuname, stupwd);
    }
}
