package com.mybatis.mapper;

/**
 * Created by hua on 2018/5/25.
 */
import com.mybatis.Bookbean;

import java.util.List;

public interface BookMapper {
    /**
     * 新增用戶
     * @param book
     * @return
     * @throws Exception
     */
    public int insertBook(Bookbean book) throws Exception;
    /**
     * 修改用戶
     * @param book
     * @param id
     * @return
     * @throws Exception
     */
    public int updateBook (Bookbean book, int id) throws Exception;
    /**
     * 刪除用戶
     * @param id
     * @return
     * @throws Exception
     */
    public int deleteBook(int id) throws Exception;
    /**
     * 根据id查询用户信息
     * @param id
     * @return
     * @throws Exception
     */
    public Bookbean selectBookById(int id) throws Exception;
    /**
     * 查询所有的用户信息
     * @return
     * @throws Exception
     */
    public List<Bookbean> selectAllBook() throws Exception;
}