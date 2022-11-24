package com.codeonce;

import com.codeonce.pojo.Books;
import com.codeonce.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {

    @Test
    public void queryAll() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) context.getBean("BookServiceImpl");
        List<Books> booksList = bookServiceImpl.queryAllBook();
        for (Books books : booksList) {
            System.out.println(books);
        }
    }

}
