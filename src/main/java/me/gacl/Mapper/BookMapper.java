package me.gacl.Mapper;

import me.gacl.domain.BookBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by hjt on 2018/5/27.
 */
public interface  BookMapper {
    public BookBean getBookBean(@Param("id") int bid);

    public List<BookBean> getAllBookBean();


    public Map<String,Object> getBookBeanMap(@Param("id") int bid);


}
