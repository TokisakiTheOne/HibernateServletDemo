package com.yyh.service;

import com.yyh.dao.StudentDao;
import com.yyh.dao.StudentDaoImpl;
import com.yyh.po.Student;

import java.util.List;

/**
 * @author YanYuHang
 * @create 2019-12-28-9:47
 */
public class StudentServiceImpl implements StudentService {

    StudentDao sd = new StudentDaoImpl();

    @Override
    public List<Student> findAll() {
        return sd.selectAll();
    }
}
