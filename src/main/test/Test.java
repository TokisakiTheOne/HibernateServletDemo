import com.yyh.utils.HibernateUtils;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 * @author YanYuHang
 * @create 2019-12-28-10:12
 */
public class Test {




    @org.junit.Test
    public void test(){
        Session session = HibernateUtils.getSession();
        //2.创建hql语句
        String hql = "from Student";
        //3.创建Query对象
        Query query = session.createQuery(hql);

        query.list().forEach(System.out::println);
    }
}
