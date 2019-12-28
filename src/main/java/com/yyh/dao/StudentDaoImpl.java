package com.yyh.dao;

import com.yyh.po.Student;
import com.yyh.utils.HibernateUtils;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

/**
 * @author YanYuHang
 * @create 2019-12-28-9:44
 */
public class StudentDaoImpl implements StudentDao {
    @Override
    public List<Student> selectAll() {
        //1.获取session
        Session session = HibernateUtils.getSession();
        //2.创建hql语句
        String hql = "from Student";
        //3.创建Query对象
        Query query = session.createQuery(hql);
        //4. 执行查询
        return query.list();
    }
}
