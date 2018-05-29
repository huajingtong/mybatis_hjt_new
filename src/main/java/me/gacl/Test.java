package me.gacl;

import me.gacl.Mapper.BookMapper;
import me.gacl.domain.BookBean;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * Created by hua on 2018/5/25.
 */
public class Test {

    public static void main(String[] args) throws IOException {
        //mybatis的配置文件
        String resource = "./conf.xml";
        //使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
        InputStream is = Test.class.getClassLoader().getResourceAsStream(resource);
        //构建sqlSession的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        //使用MyBatis提供的Resources类加载mybatis的配置文件（它也加载关联的映射文件）
        //Reader reader = Resources.getResourceAsReader(resource);
        //构建sqlSession的工厂
        //SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //创建能执行映射文件中sql的sqlSession
        SqlSession session = sessionFactory.openSession();
        /**
         * 映射sql的标识字符串，
         * me.gacl.mapping.userMapper是userMapper.xml文件中mapper标签的namespace属性的值，
         * getUser是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
         */
       // String statement = "me.gacl.Mapper.BookMapper.getBookBean";//映射sql的标识字符串

//        //执行查询返回一个唯一user对象的sql
//        BookBean book = session.selectOne("me.gacl.Mapper.BookMapper.getBookBean", 3);
//        System.out.println(book);
        //第二种方法
//        try {
//        BookMapper bookMapper = session.getMapper(BookMapper.class);
//        BookBean book = bookMapper.getBookBean(1);
//        System.out.println(book);
//        } finally {
//            session.close();
//        }

//        List<BookBean> all =session.selectList("getAllBookBean");
//        System.out.println(all);
        /*
        List<BookBean> all =
                bookMapper.getAllBookBean();
        System.out.println(all);
         */

        Map<String, Object> bookBeanMap = session.selectMap("getBookBeanMap","beijing");
        System.out.println(bookBeanMap);


    }
}
