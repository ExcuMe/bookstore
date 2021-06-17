package com.example.bookstore.domain;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface BookStoreMapper {
    @Select("select * from book_store")
    public List<BookStore> showAll();

    //    注意mybatis多参传递的用法
    @Update("update book_store set num=#{param2} where id=#{param1}")
    public void update(int id, int num);

    @Select("select * from book_store where id=#{id}")
    public BookStore selectById(int id);


}
