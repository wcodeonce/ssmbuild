package com.codeonce.service;

import com.codeonce.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {

    // 增加
    int insertBook(Books books);

    // 删除
    int deleteBook(@Param("bookId") int id);

    // 修改
    int updateBook(Books books);

    // ID查询
    Books queryBookById(int id);

    // 查询全部
    List<Books> queryAllBook();

}
