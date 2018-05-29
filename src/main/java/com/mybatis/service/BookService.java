//package com.mybatis.service;
//
//import com.mybatis.Bookbean;
//import com.mybatis.mapper.BookMapper;
//import com.mybatis.tools.DBTools;
//import me.gacl.Test;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//
//import java.io.InputStream;
//
///**
// * Created by hua on 2018/5/25.
// */
//
//
//public class BookService {
//    public static void main(String[] args) {
//        String resource = "./mybatis.cfg.xml";
//        //使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
//        InputStream is = Test.class.getClassLoader().getResourceAsStream(resource);
//        //构建sqlSession的工厂
//        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
//        SqlSession session = sessionFactory.openSession();
//                try {
//        BookMapper bookMapper = session.getMapper(BookMapper.class);
//        Bookbean book= bookMapper.selectAllBook();
//
////                    List<BookBean> all =session.selectList("getAllBookBean");
////        System.out.println(all);
//        System.out.println(book);
//        } finally {
//            session.close();
//        }
//
//    }
//    }
////
////    /**
////     * 新增书籍
////     */
////    private static void insertUser() {
////        SqlSession session = DBTools.getSession();
////        BookMapper mapper = session.getMapper(BookMapper.class);
////        Bookbean Book = new Bookbean(3, "sky", "hello sky");
////        try {
////            mapper.insertBook(Book);
////            System.out.println(Book.toString());
////            session.commit();
////        } catch (Exception e) {
////            e.printStackTrace();
////            session.rollback();
////        }
////    }
////}
