package com.yyh.servlets;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yyh.po.Student;
import com.yyh.service.StudentService;
import com.yyh.service.StudentServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author YanYuHang
 * @create 2019-12-28-9:49
 */
@WebServlet("/FindAllServlet")
public class FindAllServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        //1.调用service层
        StudentService ss = new StudentServiceImpl();
        List<Student> list = ss.findAll();
        //2.调用方法  把集合存入作用域中
        ObjectMapper om =new ObjectMapper();

        String json = om.writeValueAsString(list);

        response.getWriter().print(json);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request, response);
    }
}
