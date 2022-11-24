package com.codeonce.service;

import com.codeonce.mapper.BookMapper;
import com.codeonce.pojo.Books;
import org.apache.log4j.Logger;

import java.util.List;

public class BookServiceImpl implements BookService {
    // 配置LOG4J
    private static final Logger logger = Logger.getLogger(BookServiceImpl.class);

    // service调用mapper层
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int insertBook(Books books) {
        return bookMapper.insertBook(books);
    }

    @Override
    public int deleteBook(int id) {
        return bookMapper.deleteBook(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
